/**
 * Dado dois arrays ordenados nums1 e nums2 de tamanho m e n respectivamente, retorne a mediana dos dois arrays.
 *
 * A complexidade geral do tempo de execução deve ser O(log (m+n)).
 *
 * Restrições:
 *
 * nums1.length == m
 *
 * nums2.length == n
 *
 * 0 <= m <= 1000
 *
 * 0 <= n <= 1000
 *
 * 1 <= m + n <= 2000
 *
 * -10⁶ <= nums1[i], nums2[i] <= 10⁶
 *
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function (nums1, nums2) {
  const nums = merge(nums1, nums2);
  let half = nums.length / 2;
  if (nums.length % 2 === 0) {
    return (nums[half - 1] + nums[half]) / 2;
  }
  return nums[Math.floor(half)];
};

const merge = (nums1, nums2) => {
  let nums = [];
  let i = 0;
  let j = 0;
  let k = 0;
  while (i < nums1.length && j < nums2.length) {
    if (nums1[i] <= nums2[j]) {
      nums[k] = nums1[i];
      i++;
    } else {
      nums[k] = nums2[j];
      j++;
    }
    k++;
  }
  while (i < nums1.length) {
    nums[k] = nums1[i];
    i++;
    k++;
  }
  while (j < nums2.length) {
    nums[k] = nums2[j];
    j++;
    k++;
  }
  return nums;
};
