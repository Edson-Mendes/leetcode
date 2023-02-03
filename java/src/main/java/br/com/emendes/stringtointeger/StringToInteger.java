package br.com.emendes.stringtointeger;

public class StringToInteger {

  // Solução em 2ms
  public int myAtoi(String s) {
    char[] sArray = s.toCharArray();
    int sLength = sArray.length;

    int beginIndex = 0;
    int endIndex;
    int digits = 0;

    // Ignorar todos os whitespaces.
    while (beginIndex < sLength && sArray[beginIndex] == ' ')
      beginIndex++;

    // verifica se após os whitespaces há sinal.
    if(beginIndex < sLength && (sArray[beginIndex] == '-' || sArray[beginIndex] == '+'))
      endIndex = beginIndex + 1;
    else
      endIndex = beginIndex;

    // verifica se há trailing 0 para não adicionar na contagem de dígitos.
    while (endIndex < sLength && sArray[endIndex] == '0')
      endIndex++;

    // pega qual o índice que até ali são apenas números.
    while (endIndex < sLength && digits < 11 && (sArray[endIndex] > 47 && sArray[endIndex] < 58)) {
      endIndex++;
      digits++;
    }

    long answerAsLong;
    // Caso a conversão de errado, significa que não havia números antes de outros caracteres.
    try {
      answerAsLong = Long.parseLong(s, beginIndex, endIndex, 10);
    } catch (Exception ex) {
      return 0;
    }

    if (answerAsLong > Integer.MAX_VALUE) return Integer.MAX_VALUE;
    if (answerAsLong < Integer.MIN_VALUE) return Integer.MIN_VALUE;

    return (int) answerAsLong;
  }

}
