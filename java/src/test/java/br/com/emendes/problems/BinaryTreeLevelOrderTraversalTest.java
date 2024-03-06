package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeLevelOrderTraversalTest {

  @Test
  void test01() {
    BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();

    List<List<Integer>> actualAnswer = solution.levelOrder(null);

    assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test02() {
    BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();

    TreeNode root = TreeNodeGenerator.generate(1);
    List<List<Integer>> actualAnswer = solution.levelOrder(root);

    assertThat(actualAnswer).isNotNull().isNotEmpty().hasSize(1);
    assertThat(actualAnswer.get(0)).isNotNull().hasSize(1);
  }

  @Test
  void test03() {
    BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();

    TreeNode root = TreeNodeGenerator.generate(1, 2, Integer.MIN_VALUE);
    List<List<Integer>> actualAnswer = solution.levelOrder(root);

    assertThat(actualAnswer).isNotNull().isNotEmpty().hasSize(2);
    assertThat(actualAnswer.get(0)).isNotNull().hasSize(1);
    assertThat(actualAnswer.get(1)).isNotNull().hasSize(1);
  }

  @Test
  void test04() {
    BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();

    TreeNode root = TreeNodeGenerator.generate(1, Integer.MIN_VALUE, 2);
    List<List<Integer>> actualAnswer = solution.levelOrder(root);

    assertThat(actualAnswer).isNotNull().isNotEmpty().hasSize(2);
    assertThat(actualAnswer.get(0)).isNotNull().hasSize(1).containsExactly(1);
    assertThat(actualAnswer.get(1)).isNotNull().hasSize(1).containsExactly(2);
  }

  @Test
  void test05() {
    BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3);
    List<List<Integer>> actualAnswer = solution.levelOrder(root);

    assertThat(actualAnswer).isNotNull().isNotEmpty().hasSize(2);
    assertThat(actualAnswer.get(0)).isNotNull().hasSize(1).contains(1);
    assertThat(actualAnswer.get(1)).isNotNull().hasSize(2).containsExactly(2, 3);
  }

  @Test
  void test06() {
    BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();

    TreeNode root = TreeNodeGenerator.generate(3, 9, 20, Integer.MIN_VALUE, Integer.MIN_VALUE, 15, 7);
    List<List<Integer>> actualAnswer = solution.levelOrder(root);

    assertThat(actualAnswer).isNotNull().isNotEmpty().hasSize(3);
    assertThat(actualAnswer.get(0)).isNotNull().hasSize(1).contains(3);
    assertThat(actualAnswer.get(1)).isNotNull().hasSize(2).containsExactly(9, 20);
    assertThat(actualAnswer.get(2)).isNotNull().hasSize(2).containsExactly(15, 7);
  }

}