package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Escreva um programa para resolver um quebra-cabeça Sudoku preenchendo as células vazias.<br><br>
 * <p>
 * Uma solução de sudoku deve satisfazer todas as seguintes regras:<br>
 * - Cada um dos dígitos 1-9 deve ocorrer exatamente uma vez em cada linha.<br>
 * - Cada um dos dígitos 1-9 deve ocorrer exatamente uma vez em cada coluna.<br>
 * - Cada um dos dígitos 1-9 deve ocorrer exatamente uma vez em cada uma das 9 subcaixas 3x3 da grade.<br>
 * - O caracter '.' indica uma célula vazia.<br><br>
 * <p>
 * <p>
 * Restrições:<br>
 * - board.length == 9.<br>
 * - board[i].length == 9.<br>
 * - board[i][j] is a digit or '.'.<br>
 * - É garantido que o board de entrada possui apenas uma solução.<br>
 */
public class SudokuSolver {

  private static final int BOARD_SIZE = 9;
  private static final int SUBSECTION_SIZE = 3;
  private static final int NO_VALUE = 0;
  private static final int CONSTRAINTS = 4;
  private static final int MIN_VALUE = 1;
  private static final int MAX_VALUE = 9;
  private static final int COVER_START_INDEX = 1;

  private int[][] board;

  public void solveSudoku(char[][] board) {
    this.board = toIntBoard(board);

    solve();

    fillCharBoard(board);
  }

  private int[][] toIntBoard(char[][] board) {
    int[][] boardInt = new int[BOARD_SIZE][BOARD_SIZE];

    for (int i = 0; i < BOARD_SIZE; i++) {
      for (int j = 0; j < BOARD_SIZE; j++) {
        if (board[i][j] == '.') {
          boardInt[i][j] = NO_VALUE;
        } else {
          boardInt[i][j] = board[i][j] - 48;
        }
      }
    }

    return boardInt;
  }

  private void fillCharBoard(char[][] board) {
    for (int row = 0; row < BOARD_SIZE; row++) {
      for (int column = 0; column < BOARD_SIZE; column++) {
        board[row][column] = (char) (this.board[row][column] + 48);
      }
    }
  }

  // --------------------------------------------------------------------------------

  private void solve() {
    boolean[][] cover = initializeExactCoverBoard(this.board);
    DancingLinks dlx = new DancingLinks(cover);
    this.board = dlx.runSolver();
  }

  private int getIndex(int row, int column, int num) {
    return (row - 1) * BOARD_SIZE * BOARD_SIZE + (column - 1) * BOARD_SIZE + (num - 1);
  }

  private boolean[][] createExactCoverBoard() {
    boolean[][] coverBoard = new boolean[BOARD_SIZE * BOARD_SIZE * MAX_VALUE][BOARD_SIZE * BOARD_SIZE * CONSTRAINTS];

    int hBase = 0;
    hBase = checkCellConstraint(coverBoard, hBase);
    hBase = checkRowConstraint(coverBoard, hBase);
    hBase = checkColumnConstraint(coverBoard, hBase);
    checkSubsectionConstraint(coverBoard, hBase);

    return coverBoard;
  }

  private int checkSubsectionConstraint(boolean[][] coverBoard, int hBase) {
    for (int row = COVER_START_INDEX; row <= BOARD_SIZE; row += SUBSECTION_SIZE) {
      for (int column = COVER_START_INDEX; column <= BOARD_SIZE; column += SUBSECTION_SIZE) {
        for (int n = COVER_START_INDEX; n <= BOARD_SIZE; n++, hBase++) {
          for (int rowDelta = 0; rowDelta < SUBSECTION_SIZE; rowDelta++) {
            for (int columnDelta = 0; columnDelta < SUBSECTION_SIZE; columnDelta++) {
              int index = getIndex(row + rowDelta, column + columnDelta, n);
              coverBoard[index][hBase] = true;
            }
          }
        }
      }
    }
    return hBase;
  }

  private int checkColumnConstraint(boolean[][] coverBoard, int hBase) {
    for (int column = COVER_START_INDEX; column <= BOARD_SIZE; column++) {
      for (int n = COVER_START_INDEX; n <= BOARD_SIZE; n++, hBase++) {
        for (int row = COVER_START_INDEX; row <= BOARD_SIZE; row++) {
          int index = getIndex(row, column, n);
          coverBoard[index][hBase] = true;
        }
      }
    }
    return hBase;
  }

  private int checkRowConstraint(boolean[][] coverBoard, int hBase) {
    for (int row = COVER_START_INDEX; row <= BOARD_SIZE; row++) {
      for (int n = COVER_START_INDEX; n <= BOARD_SIZE; n++, hBase++) {
        for (int column = COVER_START_INDEX; column <= BOARD_SIZE; column++) {
          int index = getIndex(row, column, n);
          coverBoard[index][hBase] = true;
        }
      }
    }
    return hBase;
  }

  private int checkCellConstraint(boolean[][] coverBoard, int hBase) {
    for (int row = COVER_START_INDEX; row <= BOARD_SIZE; row++) {
      for (int column = COVER_START_INDEX; column <= BOARD_SIZE; column++, hBase++) {
        for (int n = COVER_START_INDEX; n <= BOARD_SIZE; n++) {
          int index = getIndex(row, column, n);
          coverBoard[index][hBase] = true;
        }
      }
    }
    return hBase;
  }

  private boolean[][] initializeExactCoverBoard(int[][] board) {
    boolean[][] coverBoard = createExactCoverBoard();
    for (int row = COVER_START_INDEX; row <= BOARD_SIZE; row++) {
      for (int column = COVER_START_INDEX; column <= BOARD_SIZE; column++) {
        int n = board[row - 1][column - 1];
        if (n != NO_VALUE) {
          for (int num = MIN_VALUE; num <= MAX_VALUE; num++) {
            if (num != n) {
              Arrays.fill(coverBoard[getIndex(row, column, num)], false);
            }
          }
        }
      }
    }
    return coverBoard;
  }

  private static class DancingLinks {

    private ColumnNode header;
    private List<DancingNode> answer;

    private int[][] board;

    public DancingLinks(int[][] board) {}

    private void search(int k) {
      if (header.R == header) {
        this.board = handleSolution(answer);
      } else {
        ColumnNode c = selectColumnNodeHeuristic();
        c.cover();

        for (DancingNode r = c.D; r != c; r = r.D) {
          answer.add(r);

          for (DancingNode j = r.R; j != r; j = j.R) {
            j.C.cover();
          }

          search(k + 1);

          r = answer.remove(answer.size() - 1);
          c = r.C;

          for (DancingNode j = r.L; j != r; j = j.L) {
            j.C.uncover();
          }
        }
        c.uncover();
      }
    }

    private ColumnNode selectColumnNodeHeuristic() {
      int min = Integer.MAX_VALUE;
      ColumnNode ret = null;
      for (ColumnNode c = (ColumnNode) header.R; c != header; c = (ColumnNode) c.R) {
        if (c.size < min) {
          min = c.size;
          ret = c;
        }
      }
      return ret;
    }

    private ColumnNode makeDLXBoard(boolean[][] grid) {
      final int COLS = grid[0].length;

      ColumnNode headerNode = new ColumnNode("header");
      List<ColumnNode> columnNodes = new ArrayList<>();

      for (int i = 0; i < COLS; i++) {
        ColumnNode n = new ColumnNode(Integer.toString(i));
        columnNodes.add(n);
        headerNode = (ColumnNode) headerNode.hookRight(n);
      }
      headerNode = headerNode.R.C;

      for (boolean[] aGrid : grid) {
        DancingNode prev = null;
        for (int j = 0; j < COLS; j++) {
          if (aGrid[j]) {
            ColumnNode col = columnNodes.get(j);
            DancingNode newNode = new DancingNode(col);
            if (prev == null)
              prev = newNode;
            col.U.hookDown(newNode);
            prev = prev.hookRight(newNode);
            col.size++;
          }
        }
      }

      headerNode.size = COLS;

      return headerNode;
    }

    DancingLinks(boolean[][] cover) {
      header = makeDLXBoard(cover);
    }

    public int[][] runSolver() {
      answer = new LinkedList<>();
      search(0);

      return board;
    }

    private int[][] handleSolution(List<DancingNode> answer) {
      return parseBoard(answer);
    }

    private int size = 9;

    private int[][] parseBoard(List<DancingNode> answer) {
      int[][] result = new int[size][size];
      for (DancingNode n : answer) {
        DancingNode rcNode = n;
        int min = Integer.parseInt(rcNode.C.name);
        for (DancingNode tmp = n.R; tmp != n; tmp = tmp.R) {
          int val = Integer.parseInt(tmp.C.name);
          if (val < min) {
            min = val;
            rcNode = tmp;
          }
        }
        int ans1 = Integer.parseInt(rcNode.C.name);
        int ans2 = Integer.parseInt(rcNode.R.C.name);
        int r = ans1 / size;
        int c = ans1 % size;
        int num = (ans2 % size) + 1;
        result[r][c] = num;
      }
      return result;
    }

    private static void printSolution(int[][] result) {
      int size = result.length;
      for (int[] aResult : result) {
        StringBuilder ret = new StringBuilder();
        for (int j = 0; j < size; j++) {
          ret.append(aResult[j]).append(" ");
        }
        System.out.println(ret);
      }
      System.out.println();
    }
  }

  private static class ColumnNode extends DancingNode {
    int size;
    String name;

    ColumnNode(String n) {
      super();
      size = 0;
      name = n;
      C = this;
    }

    void cover() {
      unlinkLR();
      for (DancingNode i = this.D; i != this; i = i.D) {
        for (DancingNode j = i.R; j != i; j = j.R) {
          j.unlinkUD();
          j.C.size--;
        }
      }
    }

    void uncover() {
      for (DancingNode i = this.U; i != this; i = i.U) {
        for (DancingNode j = i.L; j != i; j = j.L) {
          j.C.size++;
          j.relinkUD();
        }
      }
      relinkLR();
    }
  }

  private static class DancingNode {
    DancingNode L, R, U, D;
    ColumnNode C;

    DancingNode hookDown(DancingNode node) {
      assert (this.C == node.C);
      node.D = this.D;
      node.D.U = node;
      node.U = this;
      this.D = node;
      return node;
    }

    DancingNode hookRight(DancingNode node) {
      node.R = this.R;
      node.R.L = node;
      node.L = this;
      this.R = node;
      return node;
    }

    void unlinkLR() {
      this.L.R = this.R;
      this.R.L = this.L;
    }

    void relinkLR() {
      this.L.R = this.R.L = this;
    }

    void unlinkUD() {
      this.U.D = this.D;
      this.D.U = this.U;
    }

    void relinkUD() {
      this.U.D = this.D.U = this;
    }

    DancingNode() {
      L = R = U = D = this;
    }

    DancingNode(ColumnNode c) {
      this();
      C = c;
    }
  }

  // --------------------------------------------------------------------------------

  private void printBoard(char[][] board) {
    for (int row = 0; row < BOARD_SIZE; row++) {
      for (int column = 0; column < BOARD_SIZE; column++) {
        System.out.print(board[row][column] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
//    char[][] board = {
//        {'8', '.', '.', '.', '.', '.', '.', '.', '.'},
//        {'.', '.', '3', '6', '.', '.', '.', '.', '.'},
//        {'.', '7', '.', '.', '9', '.', '2', '.', '.'},
//        {'.', '5', '.', '.', '.', '7', '.', '.', '.'},
//        {'.', '.', '.', '.', '4', '5', '7', '.', '.'},
//        {'.', '.', '.', '1', '.', '.', '.', '3', '.'},
//        {'.', '.', '1', '.', '.', '.', '.', '6', '8'},
//        {'.', '.', '8', '5', '.', '.', '.', '1', '.'},
//        {'.', '9', '.', '.', '.', '.', '4', '.', '.'}
//    };
    char[][] board = {
        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '9', '.', '.', '1', '.', '.', '3', '.'},
        {'.', '.', '6', '.', '2', '.', '7', '.', '.'},
        {'.', '.', '.', '3', '.', '4', '.', '.', '.'},
        {'2', '1', '.', '.', '.', '.', '.', '9', '8'},
        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '2', '5', '.', '6', '4', '.', '.'},
        {'.', '8', '.', '.', '.', '.', '.', '1', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
    };

    SudokuSolver solution = new SudokuSolver();

    solution.printBoard(board);

    solution.solveSudoku(board);

    System.out.println("--------------------------------------------------------");
    solution.printBoard(board);
  }

}
