package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.lang.Integer.MIN_VALUE;

class BinaryTreePreorderTraversalTest {

  @Test
  void test01() {
    BinaryTreePreorderTraversal solution = new BinaryTreePreorderTraversal();

    List<Integer> actualAnswer = solution.preorderTraversal(null);

    Assertions.assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test02() {
    BinaryTreePreorderTraversal solution = new BinaryTreePreorderTraversal();

    TreeNode root = TreeNodeGenerator.generate(1);
    List<Integer> actualAnswer = solution.preorderTraversal(root);

    Assertions.assertThat(actualAnswer).isNotNull().containsExactly(1);
  }

  @Test
  void test03() {
    BinaryTreePreorderTraversal solution = new BinaryTreePreorderTraversal();

    TreeNode root = TreeNodeGenerator.generate(1, 2, MIN_VALUE);
    List<Integer> actualAnswer = solution.preorderTraversal(root);

    Assertions.assertThat(actualAnswer).isNotNull().containsExactly(1, 2);
  }

  @Test
  void test04() {
    BinaryTreePreorderTraversal solution = new BinaryTreePreorderTraversal();

    TreeNode root = TreeNodeGenerator.generate(1, MIN_VALUE, 2);
    List<Integer> actualAnswer = solution.preorderTraversal(root);

    Assertions.assertThat(actualAnswer).isNotNull().containsExactly(1, 2);
  }

  @Test
  void test05() {
    BinaryTreePreorderTraversal solution = new BinaryTreePreorderTraversal();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3);
    List<Integer> actualAnswer = solution.preorderTraversal(root);

    Assertions.assertThat(actualAnswer).isNotNull().containsExactly(1, 2, 3);
  }

  @Test
  void test06() {
    BinaryTreePreorderTraversal solution = new BinaryTreePreorderTraversal();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3, 4, MIN_VALUE, MIN_VALUE, MIN_VALUE);
    List<Integer> actualAnswer = solution.preorderTraversal(root);

    Assertions.assertThat(actualAnswer).isNotNull().containsExactly(1, 2, 4, 3);
  }

  @Test
  void test07() {
    BinaryTreePreorderTraversal solution = new BinaryTreePreorderTraversal();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3, MIN_VALUE, MIN_VALUE, MIN_VALUE, 4);
    List<Integer> actualAnswer = solution.preorderTraversal(root);

    Assertions.assertThat(actualAnswer).isNotNull().containsExactly(1, 2, 3, 4);
  }

  @Test
  void test08() {
    BinaryTreePreorderTraversal solution = new BinaryTreePreorderTraversal();

    TreeNode root = TreeNodeGenerator.generate(1, MIN_VALUE, 2, MIN_VALUE, MIN_VALUE, 3, MIN_VALUE);
    List<Integer> actualAnswer = solution.preorderTraversal(root);

    Assertions.assertThat(actualAnswer).isNotNull().containsExactly(1, 2, 3);
  }

}