package br.com.emendes.longestcommonprefix;

/**
 * Escreva uma função para encontrar a string de prefixo comum mais longa entre uma matriz de strings.
 * If there is no common prefix, return an empty string "".
 * <br><br>
 * Restrições:
 * 1 <= strs.length <= 200<br>
 * 0 <= strs[i].length <= 200<br>
 * strs[i] consiste apenas de letras minúsculas do alfabeto inglês.
 */
public class LongestCommonPrefix {

  // Solução em 0ms
  // Solução um tanto complexa de entender.
  public String longestCommonPrefix(String[] strs) {
    String answer = "";
    int length = 201;
    int index = 0;
    int iStrs;
    int strsLength = strs.length;
    char currentChar;

    // Busca a menor String no array strs e guarda em answer
    for (String s : strs) {
      if (length > s.length()) {
        answer = s;
        length = answer.length();
      }
    }

    // Compara todos os caracteres de answer com os caracteres iniciais do resto das String do array.
    while (index < length) {
      currentChar = answer.charAt(index);
      iStrs = 0;

      while(iStrs < strsLength && currentChar == strs[iStrs].charAt(index)) {
        iStrs++;
      }

      // iStrs será menor que strsLength, se o caracter da posição index da string a ser testada não combinar.
      if(iStrs != strsLength) return answer.substring(0, index);

      index++;
    }

    return answer;
  }

}
