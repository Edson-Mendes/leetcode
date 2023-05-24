package br.com.emendes.problems;

/**
 * A sequência Count and Say é uma sequência de dígitos definida pela fórmula recursiva:<br>
 * - countAndSay(1) = "1"
 * - countAndSay(n) é a maneira como você "falará" a cadeia de dígitos de countAndSay(n - 1),
 * que é então convertido em uma string de dígitos diferente.<br><br>
 *
 * Para determinar como você "diz" uma string de dígitos,
 * divida-a no número mínimo de substrings de forma que cada substring contenha exatamente um único dígito.
 * Em seguida, para cada substring, diga o número de dígitos e, em seguida, diga o dígito.
 * Por fim, concatene todos os dígitos mencionados.<br><br>
 *
 * Restrições<br>
 * 1 <= n <= 30
 */
public class CountAndSay {

  public String countAndSay(int n){
    return countAndSay(n, 1, new StringBuilder("1")).toString();
  }

  /**
   * Count and Say recursivamente do 1 até n.
   */
  private StringBuilder countAndSay(int n, int count, StringBuilder sequence) {
    if (n > count) {
      return countAndSay(n, count+1, generateNextSequence(sequence));
    }
    return sequence;
  }

  /**
   * Contrói a próxima sequencia.
   */
  private StringBuilder generateNextSequence(StringBuilder sequence) {
    int length = sequence.length();
    StringBuilder nextSequence = new StringBuilder();
    int i = 0;
    boolean isNewDigit = true;
    int count = 0;
    int digit = 48;

    while (i < length){
      if (isNewDigit) {
        digit = sequence.codePointAt(i);
        count++;
        isNewDigit = false;
        i++;
      } else {
        int nextCodePoint = sequence.codePointAt(i);
        if (nextCodePoint == digit) {
          count++;
          i++;
        } else {
          nextSequence.appendCodePoint(count+48);
          nextSequence.appendCodePoint(digit);
          count = 0;
          isNewDigit = true;
        }
      }
    }

    nextSequence.appendCodePoint(count+48);
    nextSequence.appendCodePoint(digit);

    return nextSequence;
  }

}
