package br.com.emendes.medianoftwosortedarrays;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int nums1Length = nums1.length;
    int nums2Length = nums2.length;
    int[] mergedArray = merge(nums1, nums2, nums1Length, nums2Length); // merge os dois arrays.

    Arrays.sort(mergedArray); // Ordenar o novo array.

    if ((nums1Length+nums2Length) % 2 == 0) { // verificar se o novo tamanho é par
      // se sim, soma os dois valores centrais e divide por 2.
      int centralValue = (nums1Length+nums2Length) / 2;
      double median1 = mergedArray[centralValue];
      double median2 = mergedArray[centralValue - 1];
      return (median1 + median2)/2.0;
    }
    // se não, retorna o valor central
    return mergedArray[(nums1Length+nums2Length) / 2];
  }

  private int[] merge(int[] nums1, int[] nums2, int length1, int length2) {
    int[] mergedArray = Arrays.copyOf(nums1, length1 + length2);
    int i = 0;

    while (i < length2) {
      mergedArray[length1 + i] = nums2[i];
      i++;
    }

    return mergedArray;
  }

  public static void main(String[] args) {
    MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();

    int[] nums1 = {1, 2};
    int[] nums2 = {3, 4};

    double median = solution.findMedianSortedArrays(nums1, nums2);

    System.out.println(median);
  }

}
