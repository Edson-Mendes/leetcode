package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Um endereço de IP válido consiste em exatos 4 inteiros separados por pontos.<br>
 * Cada inteiro está entre 0 e 255 (inclusive) e não pode ter zeros a esquerda.<br>
 * <br>
 * Por exemplo, "0.1.2.201" e "192.168.1.1" são endereços de IP válidos, mas "0.011.255.245",
 * "192.168.1.312" e "192.168@1.1" são endereços IP inválidos.<br>
 * <br>
 * Dado uma string s contendo apenas digitos, retorne todos os possiveis endereços IP válidos que podem ser formados
 * inserindo pontos em s. Você não está permitido reordenar ou remover digitos de s. Você pode retornar os endereços
 * IP válidos em qualquer ordem.<br>
 * <br>
 * Restrições:<br>
 * 1 <= s.length <= 20<br>
 * s consiste apenas de digitos.
 */
public class RestoreIPAddresses {

  public List<String> restoreIpAddresses(String s) {
    List<String> answer = new ArrayList<>();
    if (s.length() >= 4 && s.length() <= 12) {
      restoreIpAddresses(s, 0, new ArrayList<>(), answer);
    }

    return answer;
  }

  private void restoreIpAddresses(String digits, int index, List<String> ip, List<String> answer) {
    if (ip.size() == 4) {
      if (index >= digits.length()) {
        answer.add(String.join(".", ip));
      }
      return;
    }

    int value = 0;
    for (int i = index; i < digits.length() && i < index + 3; i++) {
      value = value * 10 + digits.charAt(i) - '0';
      if (value > 255 || (digits.charAt(index) == '0' && i != index)) {
        break;
      }
      ip.add(digits.substring(index, i + 1));
      restoreIpAddresses(digits, i + 1, ip, answer);
      ip.remove(ip.size() - 1);
    }
  }

}
