package br.com.emendes.problems;

public class StringToInteger {

  // Solução bem mais simples, executou em 1 ms
  public int myAtoi(String s) {
    char[] sArray = s.toCharArray();

    long answer = 0;
    int sign = 1;
    int digit;

    int sLength = sArray.length;
    int index = 0;

    // Ignorar trailing whitespaces
    while (index < sLength && sArray[index] == ' ')
      index++;

    // verifica se há sinal
    if (index < sLength && sArray[index] == '-') {
      index++;
      sign = -1;
    } else if (index < sLength && sArray[index] == '+') {
      index++;
    }

    // Pega todos os digitos e insere em um long, se o long sair do range de um inteiro 32 bits, então retorna.
    while (index < sLength && (sArray[index] > 47 && sArray[index] < 58)) {
      digit = sArray[index] - 48;
      answer = answer * 10 + digit;

      if (answer*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
      if (answer*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;

      index++;
    }

    return (int) (answer * sign);
  }

  // Solução em 2ms
  public int oldSolution(String s) {
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
