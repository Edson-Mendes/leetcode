/**
 * Dado um grid board de m x n caracteres e uma string word,
 * retorne true se word existe no grid.
 *
 * A palavra pode ser construída por letras sequênciais de células adjacentes,
 * onde células adjacentes são vizinhos horizontais ou verticais.
 * Uma mesma célula não pode ser usado mais de uma vez.
 *
 * Restrições:
 *
 * m == board.length
 *
 * n = board[i].length
 *
 * 1 <= m, n <= 6
 *
 * 1 <= word.length <= 15
 *
 * board e word consistem de letras minúsculas.
 *
 * Follow-up: Você poderia usar a poda de pesquisa para tornar sua solução mais rápida com um quadro maior?
 */
const exist = function (board, word) {
  const used = new Array(board.length);
  for (let i = 0; i < board.length; i++) {
    used[i] = new Array(board[i].length).fill(false);
  }
  for (let i = 0; i < board.length; i++) {
    for (let j = 0; j < board[0].length; j++)
      if (existWord(board, word, 0, i, j, used)) return true;
  }
  return false;
};

const existWord = (board, word, wi, bi, bj, used) => {
  if (wi === word.length) return true;
  if (bi < 0 || bi >= board.length || bj < 0 || bj >= board[0].length)
    return false;
  if (used[bi][bj] || word[wi] !== board[bi][bj]) return false;

  used[bi][bj] = true;
  const result =
    existWord(board, word, wi + 1, bi + 1, bj, used) ||
    existWord(board, word, wi + 1, bi - 1, bj, used) ||
    existWord(board, word, wi + 1, bi, bj + 1, used) ||
    existWord(board, word, wi + 1, bi, bj - 1, used);
  used[bi][bj] = false;
  return result;
};
