package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumDepthOfBinaryTreeTest {

  @Test
  void test01() {
    MinimumDepthOfBinaryTree solution = new MinimumDepthOfBinaryTree();

    int actualAnswer = solution.minDepth(null);

    Assertions.assertThat(actualAnswer).isZero();
  }

  @Test
  void test02() {
    MinimumDepthOfBinaryTree solution = new MinimumDepthOfBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(1);
    int actualAnswer = solution.minDepth(root);

    Assertions.assertThat(actualAnswer).isOne();
  }

  @Test
  void test03() {
    MinimumDepthOfBinaryTree solution = new MinimumDepthOfBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3);
    int actualAnswer = solution.minDepth(root);

    Assertions.assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test04() {
    MinimumDepthOfBinaryTree solution = new MinimumDepthOfBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(3, 9, 20, Integer.MIN_VALUE, Integer.MIN_VALUE, 15, 7);
    int actualAnswer = solution.minDepth(root);

    Assertions.assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test05() {
    MinimumDepthOfBinaryTree solution = new MinimumDepthOfBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(1, Integer.MIN_VALUE, 2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 3);
    int actualAnswer = solution.minDepth(root);

    Assertions.assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test06() {
    MinimumDepthOfBinaryTree solution = new MinimumDepthOfBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(1, Integer.MIN_VALUE, 2);
    int actualAnswer = solution.minDepth(root);

    Assertions.assertThat(actualAnswer).isEqualTo(2);
  }

}