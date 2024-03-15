package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class BinaryTreeLevelOrderTraversalIITest {

  @Test
  void test01() {
    BinaryTreeLevelOrderTraversalII solution = new BinaryTreeLevelOrderTraversalII();

    List<List<Integer>> actualAnswer = solution.levelOrderBottom(null);

    Assertions.assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test02() {
    BinaryTreeLevelOrderTraversalII solution = new BinaryTreeLevelOrderTraversalII();

    TreeNode root = TreeNodeGenerator.generate(-1);
    List<List<Integer>> actualAnswer = solution.levelOrderBottom(root);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(1)
        .containsExactly(List.of(-1));
  }

  @Test
  void test03() {
    BinaryTreeLevelOrderTraversalII solution = new BinaryTreeLevelOrderTraversalII();

    TreeNode root = TreeNodeGenerator.generate(1, 2, Integer.MIN_VALUE);
    List<List<Integer>> actualAnswer = solution.levelOrderBottom(root);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(2)
        .containsExactly(List.of(2), List.of(1));
  }

  @Test
  void test04() {
    BinaryTreeLevelOrderTraversalII solution = new BinaryTreeLevelOrderTraversalII();

    TreeNode root = TreeNodeGenerator.generate(1, Integer.MIN_VALUE, 2);
    List<List<Integer>> actualAnswer = solution.levelOrderBottom(root);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(2)
        .containsExactly(List.of(2), List.of(1));
  }

  @Test
  void test05() {
    BinaryTreeLevelOrderTraversalII solution = new BinaryTreeLevelOrderTraversalII();

    TreeNode root = TreeNodeGenerator.generate(3, 9, 20, Integer.MIN_VALUE, Integer.MIN_VALUE, 15, 7);
    List<List<Integer>> actualAnswer = solution.levelOrderBottom(root);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(3)
        .containsExactly(List.of(15, 7), List.of(9, 20), List.of(3));
  }

}