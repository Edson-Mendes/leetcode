package br.com.emendes.problems;

/**
 * Dado um array de inteiros nums, encontre o subarray que tem o maior produto, e retorne o produto.<br>
 * <br>
 * Os casos de testes são gerados de modo que a resposta irá caber em um inteiro de 32-bits.<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>1 <= nums.length <= 2 * 10⁴</li>
 *   <li>-10 <= nums[i] <= 10</li>
 *   <li>O produto de qualquer prefixo ou sufixo de nums é garantido caber em um inteiro de 32-bits.</li>
 * </ul>
 */
public class MaximumProductSubarray {

  public int maxProduct(int[] nums) {
    int maxProduct = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        maxProduct = Math.max(maxProduct, 0);
        continue;
      }
      long currProduct = nums[i];
      maxProduct = Math.max(maxProduct, nums[i]);
      for (int j = i + 1; j < nums.length && nums[j] != 0; j++) {
        currProduct *= nums[j];
        if (currProduct > Integer.MAX_VALUE || currProduct < Integer.MIN_VALUE) break;
        maxProduct = Math.max(maxProduct, (int) currProduct);
      }
    }

    return maxProduct;
  }

}
