package br.com.emendes.foursum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Dado um array nums de n inteiros, retorne um array de todos os quadrigêmeos únicos
 * [nums[a], nums[b], nums[c], nums[d]] tal que:<br>
 * 0 <= a, b, c, d < n<br>
 * a, b, c, e d são diferentes<br>
 * nums[a] + nums[b] + nums[c] + nums[d] == target<br>
 * Você pode retornar a resposta em qualquer ordem.<br><br>
 * Restrições:
 * 1 <= nums.length <= 200<br>
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 */
public class FourSum {

  // Solução em 19 ms.
  // Adptaçao do 3Sum.
  public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> answer = new ArrayList<>();
    int a;
    int b;
    int c;
    int d;
    long sum;
    long aPlusB;
    int numsLength = nums.length;

    Arrays.sort(nums);

    for (a = 0; a <= numsLength - 4; a++) {
      if (a == 0 || nums[a] != nums[a - 1]) {
        for (b = a + 1; b <= numsLength - 3; b++) {
          if (b == a + 1 || nums[b] != nums[b - 1]) {
            c = b + 1;
            d = numsLength - 1;
            aPlusB = nums[a] + nums[b];
            while (c < d) {
              sum = aPlusB + (long) nums[c] + nums[d];
              if (sum < target) {
                c++;
              } else if (sum > target) {
                d--;
              } else {
                answer.add(List.of(nums[a], nums[b], nums[c], nums[d]));

                c++;
                d--;
                while (c < d && nums[c] == nums[c - 1]) c++;
                while (c < d && nums[d] == nums[d + 1]) d--;
              }
            }
          }
        }
      }
    }

    return answer;
  }

}
