package br.com.emendes.problems;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Dado uma lista de inteiros não negativos nums, organize eles de maneira que forme o maior número e retorne.<br>
 * <br>
 * Desde que o resultado pode ser muito grande, você deve retornar uma string ou invés de um inteiro.<br>
 * <br>
 * Restrições:<br>
 * -> 1 <= nums.length <= 100<br>
 * -> 0 <= nums[i] <= 10⁹
 */
public class LargestNumber {

  public String largestNumber(int[] nums) {
    String answer = Arrays.stream(nums)
        .mapToObj(String::valueOf)
        .sorted((n1, n2) -> (n2 + n1).compareTo(n1 + n2))
        .collect(Collectors.joining(""));

    return answer.startsWith("00") ? "0" : answer;
  }

}
