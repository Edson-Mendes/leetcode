package br.com.emendes.problems;

import java.util.Arrays;

/**
 * Dado um array de inteiros nums, retorne a diferença máxima entre dois elementos sucessivos em sua forma ordenada.
 * Se o array tiver menos de dois elementos retorne 0.<br>
 * <br>
 * Você deve escrever um algoritmo que execute em tempo linear e use espaço extra linear.<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>1 <= nums.length <= 10⁵</li>
 *   <li>0 <= nums[i] <= 10⁹</li>
 * </ul>
 */
public class MaximumGap {

  static class Bucket {
    int min;
    int max;

    public Bucket(int min, int max) {
      this.min = min;
      this.max = max;
    }

  }

  public int maximumGap(int[] nums) {
    if (nums.length < 2) return 0;
//    int min = Arrays.stream(nums).min().getAsInt();
//    int max = Arrays.stream(nums).max().getAsInt();
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int num : nums) {
      if (num < min) min = num;
      if (num > max) max = num;
    }

    if (min == max) return 0;

    int gap = (int) Math.ceil((double) (max - min) / (nums.length - 1));
    int bucketLength = (max - min) / gap + 1;
    Bucket[] buckets = new Bucket[bucketLength];

    for (int i = 0; i < bucketLength; i++) {
      buckets[i] = new Bucket(Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    for (int num : nums) {
      int i = (num - min) / gap;
      buckets[i].min = Math.min(buckets[i].min, num);
      buckets[i].max = Math.max(buckets[i].max, num);
    }

    int answer = 0;
    int prevMax = min;
    for (Bucket bucket : buckets) {
      if (bucket.min == Integer.MAX_VALUE) continue;

      answer = Math.max(answer, bucket.min - prevMax);
      prevMax = bucket.max;
    }

    return answer;
  }

  public int firstSolution(int[] nums) {
    Arrays.sort(nums);
    int answer = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      answer = Math.max(answer, nums[i + 1] - nums[i]);
    }

    return answer;
  }

}
