package br.com.emendes.threesumclosest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Dado um array de inteiros {@code nums} de comprimento {@code n} e um inteiro {@code target},
 * encontre três inteiros em {@code nums} tal que a soma esteja mais próxima de {@code target}.<br>
 * <p>
 * Retorna a soma dos três inteiros.<br>
 * Você pode assumir que cada entrada teria exatamente uma solução.<br><br>
 * <p>
 * Restrições:<br>
 * 3 <= nums.length <= 500<br>
 * -1000 <= nums[i] <= 1000<br>
 * -10^4 <= target <= 10^4
 */
public class ThreeSumClosest {

  // Solução em 10ms.
  public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int i;
    int numsLength = nums.length;
    int diff = 1000000;
    int iLeft;
    int iRight;
    int sum;
    int currentDiff;
    int answer = 0;

    for (i = 0; i < numsLength - 2; i++) {
      if (i == 0 || nums[i] != nums[i - 1]) {
        iLeft = i + 1;
        iRight = numsLength - 1;
        while (iLeft < iRight) {
          sum = nums[i] + nums[iLeft] + nums[iRight];
          currentDiff = target - sum;
          if (currentDiff < 0)
            currentDiff *= -1;
          if (currentDiff < diff){
            diff = currentDiff;
            answer = sum;
          }
          if (sum < target)
            iLeft++;
          else if (sum > target)
            iRight--;
          else return sum;
        }
      }
    }

    return answer;
  }

  private Set<Integer> cache;

  // Solução em 104ms.
  public int oldSolution(int[] nums, int target) {
    Arrays.sort(nums);
    int i;
    int numsLength = nums.length;
    cache = new HashSet<>();

    for (i = 0; i < numsLength - 2; i++) {
      if ((i == 0 || nums[i] != nums[i - 1]) && isClosestThreeSumEqualsToTarget(nums, i, target)) {
        return target;
      }
    }

    return findOnCache(target);
  }

  private boolean isClosestThreeSumEqualsToTarget(int[] nums, int index, int target) {
    int iLeft = index + 1;
    int iRight = nums.length - 1;
    int sum;

    while (iLeft < iRight) {
      sum = nums[iLeft] + nums[iRight] + nums[index];

      if (sum > target) {
        iRight--;
      } else if (sum < target) {
        iLeft++;
      } else {
        return true;
      }
      cache.add(sum);
    }
    return false;
  }

  private int findOnCache(int target) {
    int i = target - 1;
    int j = target + 1;

    while (true) {
      if (cache.contains(i))
        return i;
      if (cache.contains(j))
        return j;
      i--;
      j++;
    }
  }

}
