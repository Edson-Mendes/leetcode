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
    int answer = 0;
    int length = columnTitle.length();
    for (int i = 0; i < length; i++) {
      answer = answer * 26 + columnTitle.charAt(i) - 64;
    }

    return answer;
  }

}
