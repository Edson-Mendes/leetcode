package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * O quebra-cabeça n-queens é o problema de colocar n rainhas em um tabuleiro de xadrez nxn
 * de modo que não haja duas rainhas atacando uma à outra.<br><br>
 * <p>
 * Dado um número inteiro n, retorne todas as soluções distintas para o quebra-cabeça das n-rainhas.
 * Você pode retornar a resposta em qualquer ordem.<br><br>
 * <p>
 * Cada solução contém uma configuração de tabuleiro distinta da colocação das n-rainhas,
 * onde 'Q' e '.' ambos indicam uma rainha e um espaço vazio, respectivamente.<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= n <= 9
 */
public class NQueens {

  private List<List<String>> answer;
  private int boardSize;

  public List<List<String>> solveNQueens(int n) {
    this.answer = new ArrayList<>();
    if (n == 1) {
      List<String> board = new ArrayList<>();
      board.add("Q");
      answer.add(board);
      return answer;
    } else if (n == 2 || n == 3) {
      return answer;
    }
    this.boardSize = n;

    putQueenOnLine(generateEmptyLine(n), 0, new ArrayList<>());

    return answer;
  }

  private String[] generateEmptyLine(int n) {
    String[] emptyLine = new String[n];

    Arrays.fill(emptyLine, ".");

    return emptyLine;
  }

  private void putQueenOnLine(String[] line, int currentLine, List<String> currentBoard) {
    if (currentLine == this.boardSize && currentBoard.size() == this.boardSize) {
      this.answer.add(currentBoard);
    }
    String[] lineBelow = generateEmptyLine(this.boardSize);
    validatePositions(line, lineBelow);

    for (int i = 0; i < this.boardSize; i++) {
      if (line[i].equals(".")) {
        // copy line
        String[] lineCopy = Arrays.copyOf(line, this.boardSize);
        // put Q at i
        lineCopy[i] = "Q";
        // invalidate positions i-1, i and i+1 from lineBelow
        String[] lineBelowCopy = Arrays.copyOf(lineBelow, this.boardSize);
        invalidatePosition(i - 1, "l", lineBelowCopy);
        invalidatePosition(i + 1, "r", lineBelowCopy);
        invalidatePosition(i, "b", lineBelowCopy);

        // copy currentBoard
        List<String> currentBoardCopy = new ArrayList<>(currentBoard);
        // save lineCopy at currentBoardCopy
        currentBoardCopy.add(lineToString(lineCopy));
        // call putQueenOnLine.
        putQueenOnLine(lineBelowCopy, currentLine + 1, currentBoardCopy);
      }
    }
  }

  private String lineToString(String[] lineArray) {
    StringBuilder line = new StringBuilder();
    for (int i = 0; i < this.boardSize; i++) {
      if (!lineArray[i].equals("Q")) {
        line.append(".");
      } else {
        line.append("Q");
      }
    }
    return line.toString();
  }

  private void validatePositions(String[] currentLine, String[] lineBelow) {
    for (int i = 0; i < this.boardSize; i++) {
      if (currentLine[i].contains("l")) {
        invalidatePosition(i - 1, "l", lineBelow);
      }
      if (currentLine[i].contains("r")) {
        invalidatePosition(i + 1, "r", lineBelow);
      }
      if (currentLine[i].contains("b")) {
        invalidatePosition(i, "b", lineBelow);
      }
    }
  }

  private void invalidatePosition(int position, String invalidationType, String[] line) {
    if (position > -1 && position < this.boardSize) {
      if (line[position].equals(".")) {
        line[position] = invalidationType;
      } else {
        line[position] += invalidationType;
      }
    }
  }

}
