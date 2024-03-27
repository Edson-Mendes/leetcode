package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FlattenBinaryTreeToLinkedListTest {

  @Test
  void test01() {
    FlattenBinaryTreeToLinkedList solution = new FlattenBinaryTreeToLinkedList();

    TreeNode root = null;
    solution.flatten(root);

    Assertions.assertThat(root).isNull();
  }

  @Test
  void test02() {
    FlattenBinaryTreeToLinkedList solution = new FlattenBinaryTreeToLinkedList();

    TreeNode root = TreeNodeGenerator.generate(1);
    solution.flatten(root);

    Assertions.assertThat(root).isNotNull();
    Assertions.assertThat(root.val).isEqualTo(1);
    Assertions.assertThat(root.left).isNull();
    Assertions.assertThat(root.right).isNull();
  }

  @Test
  void test03() {
    FlattenBinaryTreeToLinkedList solution = new FlattenBinaryTreeToLinkedList();

    TreeNode root = TreeNodeGenerator.generate(1, 2, Integer.MIN_VALUE);
    solution.flatten(root);

    Assertions.assertThat(root).isNotNull();
    Assertions.assertThat(root.val).isEqualTo(1);
    Assertions.assertThat(root.left).isNull();
    Assertions.assertThat(root.right).isNotNull();
    Assertions.assertThat(root.right.val).isEqualTo(2);
    Assertions.assertThat(root.right.left).isNull();
    Assertions.assertThat(root.right.right).isNull();
  }

  @Test
  void test04() {
    FlattenBinaryTreeToLinkedList solution = new FlattenBinaryTreeToLinkedList();

    TreeNode root = TreeNodeGenerator.generate(1, Integer.MIN_VALUE, 2);
    solution.flatten(root);

    Assertions.assertThat(root).isNotNull();
    Assertions.assertThat(root.val).isEqualTo(1);
    Assertions.assertThat(root.left).isNull();
    Assertions.assertThat(root.right).isNotNull();
    Assertions.assertThat(root.right.val).isEqualTo(2);
    Assertions.assertThat(root.right.left).isNull();
    Assertions.assertThat(root.right.right).isNull();
  }

  @Test
  void test05() {
    FlattenBinaryTreeToLinkedList solution = new FlattenBinaryTreeToLinkedList();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3);
    solution.flatten(root);

    Assertions.assertThat(root).isNotNull();
    Assertions.assertThat(root.val).isEqualTo(1);
    Assertions.assertThat(root.left).isNull();
    Assertions.assertThat(root.right).isNotNull();
    Assertions.assertThat(root.right.val).isEqualTo(2);
    Assertions.assertThat(root.right.left).isNull();
    Assertions.assertThat(root.right.right).isNotNull();
    Assertions.assertThat(root.right.right.val).isEqualTo(3);
    Assertions.assertThat(root.right.right.left).isNull();
    Assertions.assertThat(root.right.right.right).isNull();
  }

  @Test
  void test06() {
    FlattenBinaryTreeToLinkedList solution = new FlattenBinaryTreeToLinkedList();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 5, 3, 4, Integer.MIN_VALUE, 6);
    solution.flatten(root);

    Assertions.assertThat(root).isNotNull();
    Assertions.assertThat(root.val).isEqualTo(1);
    Assertions.assertThat(root.left).isNull();
    Assertions.assertThat(root.right).isNotNull();
    Assertions.assertThat(root.right.val).isEqualTo(2);
    Assertions.assertThat(root.right.left).isNull();
    Assertions.assertThat(root.right.right).isNotNull();
    Assertions.assertThat(root.right.right.val).isEqualTo(3);
    Assertions.assertThat(root.right.right.left).isNull();
    Assertions.assertThat(root.right.right.right).isNotNull();
    Assertions.assertThat(root.right.right.right.val).isEqualTo(4);
    Assertions.assertThat(root.right.right.right.left).isNull();
    Assertions.assertThat(root.right.right.right.right).isNotNull();
    Assertions.assertThat(root.right.right.right.right.val).isEqualTo(5);
    Assertions.assertThat(root.right.right.right.right.left).isNull();
    Assertions.assertThat(root.right.right.right.right.right).isNotNull();
    Assertions.assertThat(root.right.right.right.right.right.val).isEqualTo(6);
    Assertions.assertThat(root.right.right.right.right.right.left).isNull();
    Assertions.assertThat(root.right.right.right.right.right.right).isNull();
  }

}