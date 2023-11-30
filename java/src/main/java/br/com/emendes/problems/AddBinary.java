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
    int iA = a.length() - 1;
    int iB = b.length() - 1;
    StringBuilder answer = new StringBuilder();
    int carrier = 0;

    for (; iA >= 0 && iB >= 0; iA--, iB--) {
      int sum = (a.charAt(iA) - 48) + (b.charAt(iB) - 48) + carrier;
      answer.append(sum % 2);
      carrier = sum / 2;
    }
    for (; iA >= 0; iA--) {
      int sum = (a.charAt(iA) - 48) + carrier;
      answer.append(sum % 2);
      carrier = sum / 2;
    }
    for (; iB >= 0; iB--) {
      int sum = (b.charAt(iB) - 48) + carrier;
      answer.append(sum % 2);
      carrier = sum / 2;
    }
    if (carrier == 1) {
      answer.append(1);
    }

    return answer.reverse().toString();
  }

}
