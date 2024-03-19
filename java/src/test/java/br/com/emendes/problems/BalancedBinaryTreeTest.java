package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BalancedBinaryTreeTest {

  @Test
  void test01() {
    BalancedBinaryTree solution = new BalancedBinaryTree();

    boolean actualAnswer = solution.isBalanced(null);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test02() {
    BalancedBinaryTree solution = new BalancedBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(1);
    boolean actualAnswer = solution.isBalanced(root);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test03() {
    BalancedBinaryTree solution = new BalancedBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3);
    boolean actualAnswer = solution.isBalanced(root);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test04() {
    BalancedBinaryTree solution = new BalancedBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(1, 2, Integer.MIN_VALUE);
    boolean actualAnswer = solution.isBalanced(root);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test05() {
    BalancedBinaryTree solution = new BalancedBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(1, Integer.MIN_VALUE, 2);
    boolean actualAnswer = solution.isBalanced(root);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test06() {
    BalancedBinaryTree solution = new BalancedBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 2, 3, 3, Integer.MIN_VALUE, Integer.MIN_VALUE, 4, 4, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    boolean actualAnswer = solution.isBalanced(root);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test07() {
    BalancedBinaryTree solution = new BalancedBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(1, 2, Integer.MIN_VALUE, 3, 3, Integer.MIN_VALUE, Integer.MIN_VALUE);
    boolean actualAnswer = solution.isBalanced(root);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test08() {
    BalancedBinaryTree solution = new BalancedBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 2, 3, Integer.MIN_VALUE, Integer.MIN_VALUE, 3, 4, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 4);
    boolean actualAnswer = solution.isBalanced(root);

    Assertions.assertThat(actualAnswer).isFalse();
  }

}