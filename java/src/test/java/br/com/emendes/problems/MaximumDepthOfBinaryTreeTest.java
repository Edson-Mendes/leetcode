package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumDepthOfBinaryTreeTest {

  @Test
  void test01() {
    MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

    int actualAnswer = solution.maxDepth(null);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test02() {
    MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(1);
    int actualAnswer = solution.maxDepth(root);

    assertThat(actualAnswer).isOne();
  }

  @Test
  void test03() {
    MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(1, Integer.MIN_VALUE, 2);
    int actualAnswer = solution.maxDepth(root);

    assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test04() {
    MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(1, 2, Integer.MIN_VALUE);
    int actualAnswer = solution.maxDepth(root);

    assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test05() {
    MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3);
    int actualAnswer = solution.maxDepth(root);

    assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test06() {
    MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3, 5, 1, 7, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 6, Integer.MIN_VALUE, 8, Integer.MIN_VALUE, Integer.MIN_VALUE);
    int actualAnswer = solution.maxDepth(root);

    assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test07() {
    MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(3, 9, 20, Integer.MIN_VALUE, Integer.MIN_VALUE, 15, 7);
    int actualAnswer = solution.maxDepth(root);

    assertThat(actualAnswer).isEqualTo(3);
  }

}