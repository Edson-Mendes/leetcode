package br.com.emendes.problems;

/**
 * Dado um inteiro columnNumber, retornar o título da coluna correspondente conforme aparece em uma planilha do Excel.<br>
 * <br>
 * Por exemplo:
 * <ul>
 *   <li>A -> 1</li>
 *   <li>B -> 2</li>
 *   <li>...</li>
 *   <li>Z -> 26</li>
 *   <li>AA -> 27</li>
 *   <li>AB -> 28</li>
 *   <li>...</li>
 * </ul>
 * <br>
 * Restrições:
 * <ul>
 *   <li>1 <= columnNumber <= 2³¹ - 1</li>
 * </ul>
 */
public class ExcelSheetColumnTitle {

  public String convertToTitle(int columnNumber) {
    StringBuilder answer = new StringBuilder();

    while (columnNumber > 0) {
      columnNumber--;
      int remainder = columnNumber % 26;
      answer.append((char) (remainder + 'A'));
      columnNumber /= 26;
    }

    return answer.reverse().toString();
  }

}
