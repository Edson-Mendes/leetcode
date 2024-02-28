package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RecoverBinarySearchTreeTest {

  @Test
  void test01() {
    RecoverBinarySearchTree solution = new RecoverBinarySearchTree();

    TreeNode root = TreeNodeGenerator.generate(1, 2, Integer.MIN_VALUE);
    solution.recoverTree(root);

    assertThat(root).isNotNull();
    assertThat(root.val).isEqualTo(2);
    assertThat(root.left).isNotNull();
    assertThat(root.left.val).isEqualTo(1);
    assertThat(root.right).isNull();
  }

  @Test
  void test02() {
    RecoverBinarySearchTree solution = new RecoverBinarySearchTree();

    TreeNode root = TreeNodeGenerator.generate(2, Integer.MIN_VALUE, 1);
    solution.recoverTree(root);

    assertThat(root).isNotNull();
    assertThat(root.val).isEqualTo(1);
    assertThat(root.right).isNotNull();
    assertThat(root.right.val).isEqualTo(2);
    assertThat(root.left).isNull();
  }

  @Test
  void test03() {
    RecoverBinarySearchTree solution = new RecoverBinarySearchTree();

    TreeNode root = TreeNodeGenerator
        .generate(1, 3, Integer.MIN_VALUE, Integer.MIN_VALUE, 2, Integer.MIN_VALUE, Integer.MIN_VALUE);
    solution.recoverTree(root);

    assertThat(root).isNotNull();
    assertThat(root.val).isEqualTo(3);
    assertThat(root.left).isNotNull();
    assertThat(root.left.val).isEqualTo(1);
    assertThat(root.left.right).isNotNull();
    assertThat(root.left.right.val).isEqualTo(2);
  }

  @Test
  void test04() {
    RecoverBinarySearchTree solution = new RecoverBinarySearchTree();

    TreeNode root = TreeNodeGenerator
        .generate(3, 1, 4, Integer.MIN_VALUE, Integer.MIN_VALUE, 2, Integer.MIN_VALUE);
    solution.recoverTree(root);

    assertThat(root).isNotNull();
    assertThat(root.val).isEqualTo(2);
    assertThat(root.left).isNotNull();
    assertThat(root.left.val).isEqualTo(1);
    assertThat(root.right).isNotNull();
    assertThat(root.right.val).isEqualTo(4);
    assertThat(root.right.left).isNotNull();
    assertThat(root.right.left.val).isEqualTo(3);
  }

  @Test
  void test05() {
    RecoverBinarySearchTree solution = new RecoverBinarySearchTree();

    TreeNode root = TreeNodeGenerator
        .generate(2, 3, 1);
    solution.recoverTree(root);

    assertThat(root).isNotNull();
    assertThat(root.val).isEqualTo(2);
    assertThat(root.left).isNotNull();
    assertThat(root.left.val).isEqualTo(1);
    assertThat(root.right).isNotNull();
    assertThat(root.right.val).isEqualTo(3);
  }

  @Test
  void test06() {
    RecoverBinarySearchTree solution = new RecoverBinarySearchTree();

    TreeNode root = TreeNodeGenerator
        .generate(1, 2, 3);
    solution.recoverTree(root);

    assertThat(root).isNotNull();
    assertThat(root.val).isEqualTo(2);
    assertThat(root.left).isNotNull();
    assertThat(root.left.val).isEqualTo(1);
    assertThat(root.right).isNotNull();
    assertThat(root.right.val).isEqualTo(3);
  }

  @Test
  void test07() {
    RecoverBinarySearchTree solution = new RecoverBinarySearchTree();

    TreeNode root = TreeNodeGenerator
        .generate(3, Integer.MIN_VALUE, 2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 1);
    solution.recoverTree(root);

    assertThat(root).isNotNull();
    assertThat(root.val).isEqualTo(1);
    assertThat(root.right).isNotNull();
    assertThat(root.right.val).isEqualTo(2);
    assertThat(root.right.right).isNotNull();
    assertThat(root.right.right.val).isEqualTo(3);
  }

}