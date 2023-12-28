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

  public void firstSolution(int[] nums) {
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

  public void sortColors(int[] nums) {
    quickSort(nums, 0, nums.length - 1);
  }

  private void quickSort(int[] nums, int iIni, int iEnd) {
    if (iIni < iEnd) {
      int pivot = nums[iEnd];
      int i = iIni;
      int j = iEnd - 1;
      while (i <= j) {
        while (nums[i] < pivot) {
          i += 1;
        }
        while (j > -1 && nums[j] > pivot) {
          j -= 1;
        }
        if (i <= j) {
          swap(nums, i, j);
          i += 1;
          j -= 1;
        }
      }
      swap(nums, i, iEnd);
      quickSort(nums, iIni, i - 1);
      quickSort(nums, i + 1, iEnd);
    }
  }

  private void swap(int[] nums, int i, int j) {
    int value = nums[i];
    nums[i] = nums[j];
    nums[j] = value;
  }

}
