package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PathSumTest {

  @Test
  void test01() {
    PathSum solution = new PathSum();

    boolean actualAnswer = solution.hasPathSum(null, 1000);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test02() {
    PathSum solution = new PathSum();

    boolean actualAnswer = solution.hasPathSum(null, 0);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test03() {
    PathSum solution = new PathSum();

    TreeNode root = TreeNodeGenerator.generate(1);
    boolean actualAnswer = solution.hasPathSum(root, 1);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test04() {
    PathSum solution = new PathSum();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3);
    boolean actualAnswer = solution.hasPathSum(root, 5);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test05() {
    PathSum solution = new PathSum();

    TreeNode root = TreeNodeGenerator.generate(5, 4, 8, 11, Integer.MIN_VALUE, 13, 4, 7, 2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 1);
    boolean actualAnswer = solution.hasPathSum(root, 22);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test06() {
    PathSum solution = new PathSum();

    TreeNode root = TreeNodeGenerator.generate(5, 4, 8, 11, Integer.MIN_VALUE, 13, 4, 7, 2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 1);
    boolean actualAnswer = solution.hasPathSum(root, 18);

    Assertions.assertThat(actualAnswer).isTrue();
  }

}