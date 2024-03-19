package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;
import br.com.emendes.problems.util.ListNodeGenerator;
import br.com.emendes.problems.util.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ConvertSortedListToBinarySearchTreeTest {

  @Test
  void test01() {
    ConvertSortedListToBinarySearchTree solution = new ConvertSortedListToBinarySearchTree();

    TreeNode actualAnswer = solution.sortedListToBST(null);

    Assertions.assertThat(actualAnswer).isNull();
  }

  @Test
  void test02() {
    ConvertSortedListToBinarySearchTree solution = new ConvertSortedListToBinarySearchTree();

    ListNode head = ListNodeGenerator.generate(1);
    TreeNode actualAnswer = solution.sortedListToBST(head);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(1);
    Assertions.assertThat(actualAnswer.left).isNull();
    Assertions.assertThat(actualAnswer.right).isNull();
  }

  @Test
  void test03() {
    ConvertSortedListToBinarySearchTree solution = new ConvertSortedListToBinarySearchTree();

    ListNode head = ListNodeGenerator.generate(1, 2);
    TreeNode actualAnswer = solution.sortedListToBST(head);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(1);
    Assertions.assertThat(actualAnswer.left).isNull();
    Assertions.assertThat(actualAnswer.right).isNotNull();
    Assertions.assertThat(actualAnswer.right.val).isEqualTo(2);
  }

  @Test
  void test04() {
    ConvertSortedListToBinarySearchTree solution = new ConvertSortedListToBinarySearchTree();

    ListNode head = ListNodeGenerator.generate(1, 2, 3);
    TreeNode actualAnswer = solution.sortedListToBST(head);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(2);
    Assertions.assertThat(actualAnswer.left).isNotNull();
    Assertions.assertThat(actualAnswer.left.val).isEqualTo(1);
    Assertions.assertThat(actualAnswer.right).isNotNull();
    Assertions.assertThat(actualAnswer.right.val).isEqualTo(3);
  }

  @Test
  void test05() {
    ConvertSortedListToBinarySearchTree solution = new ConvertSortedListToBinarySearchTree();

    ListNode head = ListNodeGenerator.generate(-10, -3, 0, 5, 9);
    TreeNode actualAnswer = solution.sortedListToBST(head);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isZero();

    Assertions.assertThat(actualAnswer.left).isNotNull();
    Assertions.assertThat(actualAnswer.left.val).isEqualTo(-10);
    Assertions.assertThat(actualAnswer.left.left).isNull();
    Assertions.assertThat(actualAnswer.left.right).isNotNull();
    Assertions.assertThat(actualAnswer.left.right.val).isEqualTo(-3);

    Assertions.assertThat(actualAnswer.right).isNotNull();
    Assertions.assertThat(actualAnswer.right.val).isEqualTo(5);
    Assertions.assertThat(actualAnswer.right.left).isNull();
    Assertions.assertThat(actualAnswer.right.right).isNotNull();
    Assertions.assertThat(actualAnswer.right.right.val).isEqualTo(9);
  }

}