package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.lang.Integer.MIN_VALUE;

class BinaryTreePostorderTraversalTest {

  @Test
  void test01() {
    BinaryTreePostorderTraversal solution = new BinaryTreePostorderTraversal();

    List<Integer> actualAnswer = solution.postorderTraversal(null);

    Assertions.assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test02() {
    BinaryTreePostorderTraversal solution = new BinaryTreePostorderTraversal();

    TreeNode root = TreeNodeGenerator.generate(1);
    List<Integer> actualAnswer = solution.postorderTraversal(root);

    Assertions.assertThat(actualAnswer).isNotNull().containsExactly(1);
  }

  @Test
  void test03() {
    BinaryTreePostorderTraversal solution = new BinaryTreePostorderTraversal();

    TreeNode root = TreeNodeGenerator.generate(1, 2, MIN_VALUE);
    List<Integer> actualAnswer = solution.postorderTraversal(root);

    Assertions.assertThat(actualAnswer).isNotNull().containsExactly(2, 1);
  }

  @Test
  void test04() {
    BinaryTreePostorderTraversal solution = new BinaryTreePostorderTraversal();

    TreeNode root = TreeNodeGenerator.generate(1, MIN_VALUE, 2);
    List<Integer> actualAnswer = solution.postorderTraversal(root);

    Assertions.assertThat(actualAnswer).isNotNull().containsExactly(2, 1);
  }

  @Test
  void test05() {
    BinaryTreePostorderTraversal solution = new BinaryTreePostorderTraversal();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3);
    List<Integer> actualAnswer = solution.postorderTraversal(root);

    Assertions.assertThat(actualAnswer).isNotNull().containsExactly(2, 3, 1);
  }

  @Test
  void test06() {
    BinaryTreePostorderTraversal solution = new BinaryTreePostorderTraversal();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3, 4, MIN_VALUE, MIN_VALUE, MIN_VALUE);
    List<Integer> actualAnswer = solution.postorderTraversal(root);

    Assertions.assertThat(actualAnswer).isNotNull().containsExactly(4, 2, 3, 1);
  }

  @Test
  void test07() {
    BinaryTreePostorderTraversal solution = new BinaryTreePostorderTraversal();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3, MIN_VALUE, MIN_VALUE, MIN_VALUE, 4);
    List<Integer> actualAnswer = solution.postorderTraversal(root);

    Assertions.assertThat(actualAnswer).isNotNull().containsExactly(2, 4, 3, 1);
  }

  @Test
  void test08() {
    BinaryTreePostorderTraversal solution = new BinaryTreePostorderTraversal();

    TreeNode root = TreeNodeGenerator.generate(1, MIN_VALUE, 2, MIN_VALUE, MIN_VALUE, 3, MIN_VALUE);
    List<Integer> actualAnswer = solution.postorderTraversal(root);

    Assertions.assertThat(actualAnswer).isNotNull().containsExactly(3, 2, 1);
  }

}