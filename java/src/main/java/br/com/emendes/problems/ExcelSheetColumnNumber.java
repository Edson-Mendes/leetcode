package br.com.emendes.problems;

/**
 * Dado uma string columnTitle que representa o título de uma coluna que aparece em um folha do Excel, retorne
 * o número da coluna correspondente.<br>
 * <br>
 * Por exemplo:
 * <ul>
 *   <li>A -> 1</li>
 *   <li>B -> 2</li>
 *   <li>C -> 3</li>
 *   <li>...</li>
 *   <li>Z -> 26</li>
 *   <li>AA -> 27</li>
 *   <li>AB -> 28</li>
 *   <li>...</li>
 * </ul>
 * Restrições:<br>
 * <ul>
 *   <li>1 <= columnTitle.length <= 7</li>
 *   <li>columnTitle cosiste apenas de letras inglesas minúsculas.</li>
 *   <li>columnTitle está no intervalo de ["A", "FXSHRXW"].</li>
 * </ul>
 */
public class ExcelSheetColumnNumber {

  public int titleToNumber(String columnTitle) {
    return columnTitle.chars().reduce(0, (result, value) -> result * 26 + value - 64);
  }

  public int firstSolution(String columnTitle) {
    int index = columnTitle.length() - 1;
    int exp = 0;
    int answer = 0;
    while (index >= 0) {
      double value = columnTitle.charAt(index) - 64;
      answer += Math.pow(26, exp) * value;
      index--;
      exp++;
    }
    return answer;
  }

}
