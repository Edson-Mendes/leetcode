package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PathSumIITest {

  @Test
  void test01() {
    PathSumII solution = new PathSumII();

    List<List<Integer>> actualAnswer = solution.pathSum(null, 22);

    Assertions.assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test02() {
    PathSumII solution = new PathSumII();

    TreeNode root = TreeNodeGenerator.generate(1);
    List<List<Integer>> actualAnswer = solution.pathSum(root, 22);

    Assertions.assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test03() {
    PathSumII solution = new PathSumII();

    TreeNode root = TreeNodeGenerator.generate(22);
    List<List<Integer>> actualAnswer = solution.pathSum(root, 22);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(1)
        .contains(List.of(22));
  }

  @Test
  void test04() {
    PathSumII solution = new PathSumII();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3);
    List<List<Integer>> actualAnswer = solution.pathSum(root, 3);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(1)
        .contains(List.of(1, 2));
  }

  @Test
  void test05() {
    PathSumII solution = new PathSumII();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3);
    List<List<Integer>> actualAnswer = solution.pathSum(root, 5);

    Assertions.assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test06() {
    PathSumII solution = new PathSumII();

    TreeNode root = TreeNodeGenerator.generate(5, 4, 8, 11, Integer.MIN_VALUE, 13, 4, 7, 2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 5, 1);
    List<List<Integer>> actualAnswer = solution.pathSum(root, 22);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(2)
        .contains(List.of(5, 4, 11, 2), List.of(5, 8, 4, 5));
  }

  @Test
  void test07() {
    PathSumII solution = new PathSumII();

    List<List<Integer>> actualAnswer = solution.pathSum(null, 0);

    Assertions.assertThat(actualAnswer).isNotNull().isEmpty();
  }

}