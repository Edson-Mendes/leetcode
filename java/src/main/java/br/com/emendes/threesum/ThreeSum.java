package br.com.emendes.threesum;

import java.util.*;

/**
 * Dado um array inteiro nums, retorne todos os triplets
 * [nums[i], nums[j], nums[k]] em que i != j, i != k, e j != k, e nums[i] + nums[j] + nums[k] == 0.
 * <p>
 * Restrições:<p>
 * 3 <= nums.length <= 3000<p>
 * -10^5 <= nums[i] <= 10^5
 */
public class ThreeSum {

  // Solução muito lenta, executou em 995ms
  public List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> answer = new HashSet<>();
    Arrays.sort(nums);
    int i;
    int j;
    int k;
    int kValue;
    int numsLength = nums.length;

    for (i = 0; i < numsLength - 1; i++) {
      for (j = i + 1; j < numsLength; j++) {
        kValue = - (nums[i] + nums[j]);
        k = Arrays.binarySearch(nums, kValue);

        if(k >= 0 && k != i && k != j){
          List<Integer> triplet = new ArrayList<>();
          if (nums[k] >= nums[j]) {
            triplet.add(nums[i]);
            triplet.add(nums[j]);
            triplet.add(nums[k]);
          } else if (nums[k] >= nums[i]) {
            triplet.add(nums[i]);
            triplet.add(nums[k]);
            triplet.add(nums[j]);
          } else {
            triplet.add(nums[k]);
            triplet.add(nums[i]);
            triplet.add(nums[j]);
          }
          answer.add(triplet);
        }
      }
    }

    return answer.stream().map(s -> s.stream().toList()).toList();
  }

}
