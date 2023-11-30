package br.com.emendes.problems;

/**
 * Dado duas strings binários a e b, retorne a soma como uma string.<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= a.length, b.length <= 10⁴<br>
 * a e b consistem apenas de caracteres 0 e 1.<br>
 * Cada string não contem 0 iniciais, exceto o próprio valor 0.
 */
public class AddBinary {

  public String addBinary(String a, String b) {
    int aLength = a.length();
    int bLength = b.length();
    int iA = aLength - 1;
    int iB = bLength - 1;
    StringBuilder answer = new StringBuilder();
    int carrier = 0;
    if (aLength > bLength) {
      for (; iB >= 0; iB--, iA--) {
        int sum = (a.charAt(iA) - 48) + (b.charAt(iB) - 48) + carrier;
        answer.append(sum % 2);
        carrier = sum / 2;
      }
      for (; iA >= 0; iA--) {
        int sum = (a.charAt(iA) - 48) + carrier;
        answer.append(sum % 2);
        carrier = sum / 2;
      }
    } else {
      for (; iA >= 0; iA--, iB--) {
        int sum = (a.charAt(iA) - 48) + (b.charAt(iB) - 48) + carrier;
        answer.append(sum % 2);
        carrier = sum / 2;
      }
      for (; iB >= 0; iB--) {
        int sum = (b.charAt(iB) - 48) + carrier;
        answer.append(sum % 2);
        carrier = sum / 2;
      }
    }
    if (carrier == 1) {
      answer.append(1);
    }
    answer.reverse();

    return answer.toString();
  }

}
