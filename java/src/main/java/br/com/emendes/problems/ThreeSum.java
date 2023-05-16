package br.com.emendes.problems;

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

  // Solução em 31ms
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    int i;
    int numsLength = nums.length;
    List<List<Integer>> answer = new ArrayList<>();

    for (i = 0; i < numsLength && nums[i] <= 0; i++) {
      if (i == 0 || nums[i] != nums[i - 1]) {
        findTripletForIndex(nums, answer, i);
      }
    }

    return answer;
  }

  private void findTripletForIndex(int[] nums, List<List<Integer>> answer, int index) {
    int iLeft = index + 1;
    int iRight = nums.length - 1;
    int sum;

    while (iLeft < iRight) {
      sum = nums[iLeft] + nums[iRight] + nums[index];

      if (sum > 0) {
        iRight--;
      } else if (sum < 0) {
        iLeft++;
      } else {
        answer.add(List.of(nums[index], nums[iLeft], nums[iRight]));
        iLeft++;
        iRight--;
        while (iLeft < iRight && nums[iLeft] == nums[iLeft - 1]){
          iLeft++;
        }
        while (iLeft < iRight && nums[iRight] == nums[iRight + 1]){
          iRight--;
        }
      }
    }
  }

  // Solução muito lenta, executou em 995ms
  public List<List<Integer>> slowSolution(int[] nums) {
    Set<List<Integer>> answer = new HashSet<>();
    Arrays.sort(nums);
    int i;
    int j;
    int k;
    int kValue;
    int numsLength = nums.length;

    for (i = 0; i < numsLength - 1; i++) {
      for (j = i + 1; j < numsLength; j++) {
        kValue = -(nums[i] + nums[j]);
        k = Arrays.binarySearch(nums, kValue);

        if (k >= 0 && k != i && k != j) {
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
