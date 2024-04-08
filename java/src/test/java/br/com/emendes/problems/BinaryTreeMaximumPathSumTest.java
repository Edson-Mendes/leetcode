package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeMaximumPathSumTest {

  @Test
  void test01() {
    BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

    TreeNode root = TreeNodeGenerator.generate(1);
    int actualAnswer = solution.maxPathSum(root);

    assertThat(actualAnswer).isOne();
  }

  @Test
  void test02() {
    BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3);
    int actualAnswer = solution.maxPathSum(root);

    assertThat(actualAnswer).isEqualTo(6);
  }

  @Test
  void test03() {
    BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3);
    int actualAnswer = solution.maxPathSum(root);

    assertThat(actualAnswer).isEqualTo(6);
  }

  @Test
  void test04() {
    BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

    TreeNode root = TreeNodeGenerator.generate(1, -2, 3);
    int actualAnswer = solution.maxPathSum(root);

    assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test05() {
    BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

    TreeNode root = TreeNodeGenerator.generate(1, -2, -3);
    int actualAnswer = solution.maxPathSum(root);

    assertThat(actualAnswer).isOne();
  }

  @Test
  void test06() {
    BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

    TreeNode root = TreeNodeGenerator.generate(-1, -2, 3);
    int actualAnswer = solution.maxPathSum(root);

    assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test07() {
    BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

    TreeNode root = TreeNodeGenerator.generate(-10, 9, 20, Integer.MIN_VALUE, Integer.MIN_VALUE, 15, 7);
    int actualAnswer = solution.maxPathSum(root);

    assertThat(actualAnswer).isEqualTo(42);
  }

  @Test
  void test08() {
    BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

    TreeNode root = TreeNodeGenerator.generate(3, 3, -1, 3, -1, -1, -1, 3, -1, -1, -1, -1, -1, -1, -1);
    int actualAnswer = solution.maxPathSum(root);

    assertThat(actualAnswer).isEqualTo(12);
  }

  @Test
  void test09() {
    BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

    TreeNode root = TreeNodeGenerator.generate(-1, 3, -1, 3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1);
    int actualAnswer = solution.maxPathSum(root);

    assertThat(actualAnswer).isEqualTo(6);
  }

  @Test
  void test10() {
    BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

    TreeNode root = TreeNodeGenerator.generate(3, -30, -1, -3, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1);
    int actualAnswer = solution.maxPathSum(root);

    assertThat(actualAnswer).isEqualTo(100);
  }

  @Test
  void test11() {
    BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

    TreeNode root = TreeNodeGenerator.generate(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1);
    int actualAnswer = solution.maxPathSum(root);

    assertThat(actualAnswer).isEqualTo(-1);
  }

  @Test
  void test12() {
    BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

    TreeNode root = TreeNodeGenerator.generate(-1, 100, -1, -1, -1, -1, -1, 100, -1, -1, 100, -1, -1, -1, -1);
    int actualAnswer = solution.maxPathSum(root);

    assertThat(actualAnswer).isEqualTo(298);
  }

  @Test
  void test13() {
    BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

    TreeNode root = TreeNodeGenerator.generate(-1, 100, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1);
    int actualAnswer = solution.maxPathSum(root);

    assertThat(actualAnswer).isEqualTo(200);
  }

  @Test
  void test14() {
    BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

    TreeNode root = TreeNodeGenerator.generate(-1, 100, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1);
    int actualAnswer = solution.maxPathSum(root);

    assertThat(actualAnswer).isEqualTo(199);
  }

  @Test
  void test15() {
    BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

    TreeNode root = TreeNodeGenerator.generate(100, 100, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, 100);
    int actualAnswer = solution.maxPathSum(root);

    assertThat(actualAnswer).isEqualTo(397);
  }

  @Test
  void test16() {
    BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

    TreeNode root = TreeNodeGenerator.generate(100, 100, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, 100);
    int actualAnswer = solution.maxPathSum(root);

    assertThat(actualAnswer).isEqualTo(397);
  }

}