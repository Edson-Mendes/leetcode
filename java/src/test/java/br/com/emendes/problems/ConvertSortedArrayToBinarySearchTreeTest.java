package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ConvertSortedArrayToBinarySearchTreeTest {

  @Test
  void test01() {
    ConvertSortedArrayToBinarySearchTree solution = new ConvertSortedArrayToBinarySearchTree();

    int[] nums = {1};
    TreeNode actualAnswer = solution.sortedArrayToBST(nums);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(1);
    Assertions.assertThat(actualAnswer.left).isNull();
    Assertions.assertThat(actualAnswer.right).isNull();
  }

  @Test
  void test02() {
    ConvertSortedArrayToBinarySearchTree solution = new ConvertSortedArrayToBinarySearchTree();

    int[] nums = {1, 2};
    TreeNode actualAnswer = solution.sortedArrayToBST(nums);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(1);

    Assertions.assertThat(actualAnswer.left).isNull();
    Assertions.assertThat(actualAnswer.right).isNotNull();
    Assertions.assertThat(actualAnswer.right.val).isEqualTo(2);
  }

  @Test
  void test03() {
    ConvertSortedArrayToBinarySearchTree solution = new ConvertSortedArrayToBinarySearchTree();

    int[] nums = {1, 2, 3};
    TreeNode actualAnswer = solution.sortedArrayToBST(nums);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(2);

    Assertions.assertThat(actualAnswer.left).isNotNull();
    Assertions.assertThat(actualAnswer.left.val).isEqualTo(1);

    Assertions.assertThat(actualAnswer.right).isNotNull();
    Assertions.assertThat(actualAnswer.right.val).isEqualTo(3);
  }

  @Test
  void test04() {
    ConvertSortedArrayToBinarySearchTree solution = new ConvertSortedArrayToBinarySearchTree();

    int[] nums = {-10, -3, 0, 5, 9};
    TreeNode actualAnswer = solution.sortedArrayToBST(nums);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isZero();

    Assertions.assertThat(actualAnswer.left).isNotNull();
    Assertions.assertThat(actualAnswer.left.val).isEqualTo(-10);
    Assertions.assertThat(actualAnswer.right).isNotNull();
    Assertions.assertThat(actualAnswer.right.val).isEqualTo(5);

    Assertions.assertThat(actualAnswer.left.left).isNull();
    Assertions.assertThat(actualAnswer.left.right).isNotNull();
    Assertions.assertThat(actualAnswer.left.right.val).isEqualTo(-3);
    Assertions.assertThat(actualAnswer.right.right).isNotNull();
    Assertions.assertThat(actualAnswer.right.right.val).isEqualTo(9);
    Assertions.assertThat(actualAnswer.right.left).isNull();
  }

}