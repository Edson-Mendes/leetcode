/**
 * Você recebe dois array de inteiros nums1 e nums2, ordenados em ordem crescente, e dois inteiros
 * m e n, representando o número de elementos em nums1 e nums2, respectivamente.
 *
 * Merge nums1 e nums2 em um único array ordenado em ordem crescente.
 *
 * O array ordenado final não deve ser retornado pela função, mas sim armazenado no array nums1.
 * Para acomodar isso, o comprimento de nums1 é m + n, onde os m primeiros elementos são os elementos
 * que devem ser mesclados, e o resto dos n elementos setados em 0 e devem ser ignorados.
 * nums2 tem o comprimento de n.
 *
 * Restrições:
 *
 * nums1.length == m + n
 *
 * nums2.length == n
 *
 * 0 <= m, n <= 200
 *
 * 1 <= m + n <= 200
 *
 * -10⁹ <= nums1[i], nums2[j] <= 10⁹
 */
const merge = function (nums1, m, nums2, n) {
  let i = m - 1;
  let j = n - 1;
  let k = m + n - 1;
  while (j >= 0) {
    if (nums1[i] > nums2[j]) nums1[k--] = nums1[i--];
    else nums1[k--] = nums2[j--];
  }
};
