package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Da uma array de Strings e uma largura maxWidth, formate o texto de maneira que cada linha tenha
 * exatamente maxWidth caracteres e totalmente justificado (direita e esquerda).<br><br>
 * <p>
 * Você deve embalar suas palavras de uma forma gananciosa, isso é, coloque o máximo de palavras que puder em cada linha.
 * Preencha espaços extras ' ' quando necessário para que cada linha tenha exatamente caracteres maxWidth.<br><br>
 * <p>
 * Os espaços extras entre as palavras devem ser distribuídos da forma mais uniforme possível.
 * Se o número de espaços em uma linha não for dividido igualmente entre as palavras,
 * os slots vazios à esquerda receberão mais espaços do que os slots à direita.<br><br>
 * <p>
 * Para a última linha do texto, deve ser justificado à esquerda e nenhum espaço extra deve ser
 * inserido entre as palavras.<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= words.length <= 300<br>
 * 1 <= words[i].length <= 20<br>
 * words[i] consiste apenas de letras inglesas e símbolos.<br>
 * 1 <= maxWidth <= 100<br>
 * words[i].length <= maxWidth
 */
public class TextJustification {

  private int currIndex = 0;

  public List<String> fullJustify(String[] words, int maxWidth) {
    currIndex = 0;
    List<String> answer = new ArrayList<>();

    while (currIndex < words.length) {
      answer.add(justifyLine(words, maxWidth));
    }

    return answer;
  }

  private String justifyLine(String[] words, int maxWidth) {
    int[] spaces = new int[60];

    int currWidth = words[currIndex].length();
    int start = currIndex;
    int end = currIndex;
    int spaceIndex = 1;

    currIndex++;
    while (currIndex < words.length && words[currIndex].length() + currWidth < maxWidth) {
      spaces[spaceIndex - 1]++;
      currWidth += 1 + words[currIndex].length();

      end++;
      spaceIndex++;
      currIndex++;
    }

    // caso seja a última linha.
    if (currIndex == words.length) {
      spaces[spaceIndex - 1] = maxWidth - currWidth;
    } else if (words[currIndex].length() + currWidth >= maxWidth) {
      int totalAdditionalSpace = maxWidth - currWidth;

      if (start == end) spaces[0] = totalAdditionalSpace;
      else {
        while (totalAdditionalSpace > 0) {
          for (int i = 0; i < end - start && totalAdditionalSpace > 0; i++) {
            spaces[i]++;
            totalAdditionalSpace--;
          }
        }
      }
    }

    return append(words, start, end, spaces);
  }

  private String append(String[] words, int start, int end, int[] spaces) {
    StringBuilder line = new StringBuilder();

    for (int i = 0; i <= end - start; i++) {
      line.append(words[start + i]);
      line.append(" ".repeat(spaces[i]));
    }

    return line.toString();
  }

}
