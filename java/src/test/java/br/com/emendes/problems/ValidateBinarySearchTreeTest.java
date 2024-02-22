package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidateBinarySearchTreeTest {

  @Test
  void test01() {
    ValidateBinarySearchTree solution = new ValidateBinarySearchTree();

    boolean actualAnswer = solution.isValidBST(TreeNodeGenerator.generate(2, 1, 3));

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test02() {
    ValidateBinarySearchTree solution = new ValidateBinarySearchTree();

    int nodeNull = Integer.MIN_VALUE;

    boolean actualAnswer = solution.isValidBST(TreeNodeGenerator.generate(5, 1, 4, nodeNull, nodeNull, 3, 6));

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test03() {
    ValidateBinarySearchTree solution = new ValidateBinarySearchTree();

    int nodeNull = Integer.MIN_VALUE;

    boolean actualAnswer = solution.isValidBST(TreeNodeGenerator.generate(5, 4, 6, nodeNull, nodeNull, 3, 7));

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test04() {
    ValidateBinarySearchTree solution = new ValidateBinarySearchTree();

    boolean actualAnswer = solution.isValidBST(TreeNodeGenerator.generate(2, 2, 2));

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test05() {
    ValidateBinarySearchTree solution = new ValidateBinarySearchTree();

    int nodeNull = Integer.MIN_VALUE;
    TreeNode root = TreeNodeGenerator.generate(120, 70, 140, 50, 100, 130, 160, 20, 55, 75, 110, 119, 135, 150, 200);

    boolean actualAnswer = solution.isValidBST(root);

    Assertions.assertThat(actualAnswer).isFalse();
  }

}
