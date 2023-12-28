package br.com.emendes.problems;

/**
 * Dado um array com n objetos coloridos (vermelho, azul e branco), ordene eles in-place (operar direto na entrada)
 * para que objetos da mesma cor sejam adjacentes, com as cores na ordem vermelho, branco e azul.<br><br>
 * <p>
 * Usaremos os inteiros 0, 1 e 2 para representar a cor vermelha, branca e azul, respectivamente.<br><br>
 * <p>
 * Você deve resolver este problema sem usar a função de classificação da biblioteca.<br><br>
 * <p>
 * Restrições:<br>
 * n == nums.length<br>
 * 1 <= n <= 300<br>
 * nums[i] é 0, 1 ou 2.
 */
public class SortColors {

  public void sortColors(int[] nums) {
    int n = nums.length;

    for (int i = 0; i < n; i++) {
      int aux = i;
      for (int j = i + 1; j < n; j++) {
        if (nums[j] < nums[aux]) {
          aux = j;
        }
      }
      int value = nums[i];
      nums[i] = nums[aux];
      nums[aux] = value;
    }
  }

}
