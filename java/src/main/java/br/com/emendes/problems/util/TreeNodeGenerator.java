package br.com.emendes.problems.util;

public class TreeNodeGenerator {

  /**
   * Gera uma TreeNode com base nos valores do array values.
   * Caso o valor seja {@link Integer#MIN_VALUE} significa que é um nó null.
   *
   * @param values vetor com valores dos nó de uma {@link TreeNode}.
   * @return {@link TreeNode} formada com os valores de values.
   */
  public static TreeNode generate(int... values) {
    if (values == null) {
      throw new IllegalArgumentException("value must not be null");
    }

    return generate(values, 0);
  }

  private static TreeNode generate(int[] values, int index) {
    if (index >= values.length || values[index] == Integer.MIN_VALUE) return null;

    TreeNode node = new TreeNode(values[index]);
    node.left = generate(values, 2 * index + 1);
    node.right = generate(values, 2 * index + 2);
    return node;
  }

}
