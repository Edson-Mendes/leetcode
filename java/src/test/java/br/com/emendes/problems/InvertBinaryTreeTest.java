package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.junit.jupiter.api.Test;

import static java.lang.Integer.MIN_VALUE;
import static org.assertj.core.api.Assertions.assertThat;

class InvertBinaryTreeTest {

  @Test
  void test01() {
    InvertBinaryTree solution = new InvertBinaryTree();

    TreeNode actualAnswer = solution.invertTree(null);

    assertThat(actualAnswer).isNull();
  }

  @Test
  void test02() {
    InvertBinaryTree solution = new InvertBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(1);
    TreeNode actualAnswer = solution.invertTree(root);

    assertThat(actualAnswer).isNotNull();
    assertThat(actualAnswer.val).isEqualTo(1);
  }

  @Test
  void test03() {
    InvertBinaryTree solution = new InvertBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3);
    TreeNode actualAnswer = solution.invertTree(root);

    assertThat(actualAnswer).isNotNull();
    assertThat(actualAnswer.val).isEqualTo(1);
    assertThat(actualAnswer.left).isNotNull();
    assertThat(actualAnswer.left.val).isEqualTo(3);
    assertThat(actualAnswer.right).isNotNull();
    assertThat(actualAnswer.right.val).isEqualTo(2);
  }

  @Test
  void test04() {
    InvertBinaryTree solution = new InvertBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(4, 2, 7, 1, 3, 6, 9);
    TreeNode actualAnswer = solution.invertTree(root);

    assertThat(actualAnswer).isNotNull();
    assertThat(actualAnswer.val).isEqualTo(4);
    assertThat(actualAnswer.left).isNotNull();
    assertThat(actualAnswer.left.val).isEqualTo(7);
    assertThat(actualAnswer.right).isNotNull();
    assertThat(actualAnswer.right.val).isEqualTo(2);

    assertThat(actualAnswer.left.left).isNotNull();
    assertThat(actualAnswer.left.left.val).isEqualTo(9);
    assertThat(actualAnswer.left.right).isNotNull();
    assertThat(actualAnswer.left.right.val).isEqualTo(6);

    assertThat(actualAnswer.right.left).isNotNull();
    assertThat(actualAnswer.right.left.val).isEqualTo(3);
    assertThat(actualAnswer.right.right).isNotNull();
    assertThat(actualAnswer.right.right.val).isEqualTo(1);
  }

  @Test
  void test05() {
    InvertBinaryTree solution = new InvertBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(2, 1, 3);
    TreeNode actualAnswer = solution.invertTree(root);

    assertThat(actualAnswer).isNotNull();
    assertThat(actualAnswer.val).isEqualTo(2);
    assertThat(actualAnswer.left).isNotNull();
    assertThat(actualAnswer.left.val).isEqualTo(3);
    assertThat(actualAnswer.right).isNotNull();
    assertThat(actualAnswer.right.val).isEqualTo(1);
  }

  @Test
  void test06() {
    InvertBinaryTree solution = new InvertBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 5, MIN_VALUE, MIN_VALUE, 3, 4);
    TreeNode actualAnswer = solution.invertTree(root);

    assertThat(actualAnswer).isNotNull();
    assertThat(actualAnswer.val).isEqualTo(1);
    assertThat(actualAnswer.left).isNotNull();
    assertThat(actualAnswer.left.val).isEqualTo(5);
    assertThat(actualAnswer.right).isNotNull();
    assertThat(actualAnswer.right.val).isEqualTo(2);

    assertThat(actualAnswer.left.left).isNotNull();
    assertThat(actualAnswer.left.left.val).isEqualTo(4);
    assertThat(actualAnswer.left.right).isNotNull();
    assertThat(actualAnswer.left.right.val).isEqualTo(3);

    assertThat(actualAnswer.right.left).isNull();
    assertThat(actualAnswer.right.right).isNull();
  }

  @Test
  void test07() {
    InvertBinaryTree solution = new InvertBinaryTree();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 5, 3, 4, MIN_VALUE, MIN_VALUE);
    TreeNode actualAnswer = solution.invertTree(root);

    assertThat(actualAnswer).isNotNull();
    assertThat(actualAnswer.val).isEqualTo(1);
    assertThat(actualAnswer.left).isNotNull();
    assertThat(actualAnswer.left.val).isEqualTo(5);
    assertThat(actualAnswer.right).isNotNull();
    assertThat(actualAnswer.right.val).isEqualTo(2);

    assertThat(actualAnswer.left.left).isNull();
    assertThat(actualAnswer.left.right).isNull();

    assertThat(actualAnswer.right.left).isNotNull();
    assertThat(actualAnswer.right.left.val).isEqualTo(4);
    assertThat(actualAnswer.right.right).isNotNull();
    assertThat(actualAnswer.right.right.val).isEqualTo(3);
  }

}