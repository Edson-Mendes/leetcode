package br.com.emendes.problems;

/**
 * Você recebe dois arrays de inteiros nums1 e nums2, ordenados em ordem crescente, e dois inteiros m e n,
 * representando o número de elementos em nums1 e nums2 respectivamente.<br>
 * <br>
 * Merge nums1 e nums2 em um único array ordenado em ordem crescente.<br>
 * <br>
 * O array final não deve ser retornado pela função, mas sim armazenado dentro do array nums1.
 * Para isso, o tamanho de nums1 é m + n, onde os primeiros m elementos são os elementos de nums1 que devem ser mesclados,
 * e os n últimos elementos são settados em 0 e devem ser ignorados. nums2 tem o tamanho de n.<br>
 * <br>
 * Restrições:<br>
 * nums1.length == m + n<br>
 * nums2.length == n<br>
 * 0 <= m, n <= 200<br>
 * 1 <= m + n <= 200<br>
 * -10⁹ <= nums1[i], nums2[j] <= 10⁹<br>
 * <br>
 * Desafio: Você consegue fazer um algoritmo que executa em tempo O(m + n)?
 */
public class MergeSortedArray {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    if (n == 0) return;
    if (m == 0) {
      System.arraycopy(nums2, 0, nums1, 0, n);
      return;
    }

    int[] numsAux = new int[m + n];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < m && j < n) {
      if (nums2[j] < nums1[i]) {
        numsAux[k] = nums2[j];
        j++;
      } else {
        numsAux[k] = nums1[i];
        i++;
      }
      k++;
    }
    while (i < m) {
      numsAux[k] = nums1[i];
      i++;
      k++;
    }
    while (j < n) {
      numsAux[k] = nums2[j];
      j++;
      k++;
    }
    System.arraycopy(numsAux, 0, nums1, 0, numsAux.length);
  }

}
