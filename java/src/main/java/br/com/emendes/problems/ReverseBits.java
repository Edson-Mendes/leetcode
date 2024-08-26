package br.com.emendes.problems;

/**
 * Inverte bits de um inteiro sem sinal de 32 bits.<br>
 * <br>
 * Nota: Note que em algumas linguagens, como Java, não há um tipo inteiro sem sinal.
 * Nesse caso, tanto a entrada quanto a saída serão fornecidas como um tipo inteiro com sinal.
 * Elas não devem afetar sua implementação, pois a representação binária interna do inteiro é a mesma,
 * seja com sinal ou sem sinal.<br>
 * <br>
 * Em Java, o compilador representa os inteiros assinados usando a notação de complemento de 2.
 * Portanto, no Exemplo 2 acima, a entrada representa o inteiro assinado -3 e a saída representa o
 * inteiro assinado -1073741825.<br>
 * <br>
 * Restrições:<br>
 * -> A entrada deve ser uma string binária de comprimento 32<br>
 * <br>
 * Follow up: Se esta função for chamada muitas vezes, como você a otimizaria?
 */
public class ReverseBits {

  public int reverseBits(int n) {
    int reversed = 0;
    for (int i = 0; i < 32; i++) {
      int value = n >> i;
      int bit = value & 1;
      reversed <<= 1;
      reversed += bit;
    }

    return reversed;
  }

}
