package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

  @Test
  void test01() {
    ConstructBinaryTreeFromPreorderAndInorderTraversal solution = new ConstructBinaryTreeFromPreorderAndInorderTraversal();

    int[] preorder = {-1};
    int[] inorder = {-1};

    TreeNode actualAnswer = solution.buildTree(preorder, inorder);

    assertThat(actualAnswer).isNotNull();
    assertThat(actualAnswer.val).isEqualTo(-1);
    assertThat(actualAnswer.left).isNull();
    assertThat(actualAnswer.right).isNull();
  }

  @Test
  void test02() {
    ConstructBinaryTreeFromPreorderAndInorderTraversal solution = new ConstructBinaryTreeFromPreorderAndInorderTraversal();

    int[] preorder = {1, 2};
    int[] inorder = {2, 1};

    TreeNode actualAnswer = solution.buildTree(preorder, inorder);

    assertThat(actualAnswer).isNotNull();
    assertThat(actualAnswer.val).isEqualTo(1);
    assertThat(actualAnswer.left).isNotNull();
    assertThat(actualAnswer.left.val).isEqualTo(2);
    assertThat(actualAnswer.right).isNull();
  }

  @Test
  void test03() {
    ConstructBinaryTreeFromPreorderAndInorderTraversal solution = new ConstructBinaryTreeFromPreorderAndInorderTraversal();

    int[] preorder = {1, 2};
    int[] inorder = {1, 2};

    TreeNode actualAnswer = solution.buildTree(preorder, inorder);

    assertThat(actualAnswer).isNotNull();
    assertThat(actualAnswer.val).isEqualTo(1);
    assertThat(actualAnswer.left).isNull();
    assertThat(actualAnswer.right).isNotNull();
    assertThat(actualAnswer.right.val).isEqualTo(2);
  }

  @Test
  void test04() {
    ConstructBinaryTreeFromPreorderAndInorderTraversal solution = new ConstructBinaryTreeFromPreorderAndInorderTraversal();

    int[] preorder = {3, 9, 20, 15, 7};
    int[] inorder = {9, 3, 15, 20, 7};

    TreeNode actualAnswer = solution.buildTree(preorder, inorder);

    assertThat(actualAnswer).isNotNull();
    assertThat(actualAnswer.val).isEqualTo(3);

    assertThat(actualAnswer.left).isNotNull();
    assertThat(actualAnswer.left.val).isEqualTo(9);
    assertThat(actualAnswer.left.left).isNull();
    assertThat(actualAnswer.left.right).isNull();

    assertThat(actualAnswer.right).isNotNull();
    assertThat(actualAnswer.right.val).isEqualTo(20);
    assertThat(actualAnswer.right.left).isNotNull();
    assertThat(actualAnswer.right.left.val).isEqualTo(15);
    assertThat(actualAnswer.right.left.left).isNull();
    assertThat(actualAnswer.right.left.right).isNull();

    assertThat(actualAnswer.right.right).isNotNull();
    assertThat(actualAnswer.right.right.val).isEqualTo(7);
    assertThat(actualAnswer.right.right.left).isNull();
    assertThat(actualAnswer.right.right.right).isNull();
  }

  @Test
  void test05() {
    ConstructBinaryTreeFromPreorderAndInorderTraversal solution = new ConstructBinaryTreeFromPreorderAndInorderTraversal();

    int[] preorder = {2, 3, 5, 1, 6, 4, 7, 8};
    int[] inorder = {5, 3, 1, 6, 2, 7, 8, 4};

    TreeNode actualAnswer = solution.buildTree(preorder, inorder);

    BinaryTreeInorderTraversal tester = new BinaryTreeInorderTraversal();
    List<Integer> actualAnswerList = tester.inorderTraversal(actualAnswer);

    assertThat(actualAnswer).isNotNull();
    assertThat(actualAnswerList).isNotNull();

    List<Integer> inorderList = Arrays.stream(inorder).boxed().toList();

    assertThat(actualAnswerList).isEqualTo(inorderList);
  }

}