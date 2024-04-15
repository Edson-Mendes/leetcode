package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.junit.jupiter.api.Test;

import static java.lang.Integer.MIN_VALUE;
import static org.assertj.core.api.Assertions.assertThat;

class SumRootToLeafNumbersTest {

  @Test
  void test01() {
    SumRootToLeafNumbers solution = new SumRootToLeafNumbers();

    TreeNode root = TreeNodeGenerator.generate(8);
    int actualAnswer = solution.sumNumbers(root);

    assertThat(actualAnswer).isEqualTo(8);
  }

  @Test
  void test02() {
    SumRootToLeafNumbers solution = new SumRootToLeafNumbers();

    TreeNode root = TreeNodeGenerator.generate(8, 1, 2);
    int actualAnswer = solution.sumNumbers(root);

    assertThat(actualAnswer).isEqualTo(163);
  }

  @Test
  void test03() {
    SumRootToLeafNumbers solution = new SumRootToLeafNumbers();

    TreeNode root = TreeNodeGenerator.generate(8, 1, MIN_VALUE);
    int actualAnswer = solution.sumNumbers(root);

    assertThat(actualAnswer).isEqualTo(81);
  }

  @Test
  void test04() {
    SumRootToLeafNumbers solution = new SumRootToLeafNumbers();

    TreeNode root = TreeNodeGenerator.generate(8, MIN_VALUE, 2);
    int actualAnswer = solution.sumNumbers(root);

    assertThat(actualAnswer).isEqualTo(82);
  }

  @Test
  void test05() {
    SumRootToLeafNumbers solution = new SumRootToLeafNumbers();

    TreeNode root = TreeNodeGenerator.generate(4, 9, 0, 5, 1, MIN_VALUE, MIN_VALUE);
    int actualAnswer = solution.sumNumbers(root);

    assertThat(actualAnswer).isEqualTo(1026);
  }

}