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
  let half = (nums1.length + nums2.length) / 2;
  let i = 0;
  let j = 0;
  let m1 = 0;
  let m2 = 0;

  for (let k = 0; k <= half; k++) {
    m1 = m2;
    if (i < nums1.length && j < nums2.length) {
      if (nums1[i] <= nums2[j]) {
        m2 = nums1[i++];
      } else {
        m2 = nums2[j++];
      }
    } else if (i < nums1.length) {
      m2 = nums1[i++];
    } else {
      m2 = nums2[j++];
    }
  }

  if ((nums1.length + nums2.length) % 2 === 0) return (m1 + m2) / 2;
  return m2;
};
