package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.junit.jupiter.api.Test;

import static java.lang.Integer.MIN_VALUE;
import static org.assertj.core.api.Assertions.assertThat;

class CountCompleteTreeNodesTest {

  @Test
  void test01() {
    CountCompleteTreeNodes solution = new CountCompleteTreeNodes();

    TreeNode root = TreeNodeGenerator.generate(1);
    int actualAnswer = solution.countNodes(root);

    assertThat(actualAnswer).isOne();
  }

  @Test
  void test02() {
    CountCompleteTreeNodes solution = new CountCompleteTreeNodes();

    int actualAnswer = solution.countNodes(null);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test03() {
    CountCompleteTreeNodes solution = new CountCompleteTreeNodes();

    TreeNode root = TreeNodeGenerator.generate(1, 2, MIN_VALUE);
    int actualAnswer = solution.countNodes(root);

    assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test04() {
    CountCompleteTreeNodes solution = new CountCompleteTreeNodes();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3);
    int actualAnswer = solution.countNodes(root);

    assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test05() {
    CountCompleteTreeNodes solution = new CountCompleteTreeNodes();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3, 4, 5, 6, MIN_VALUE);
    int actualAnswer = solution.countNodes(root);

    assertThat(actualAnswer).isEqualTo(6);
  }

  @Test
  void test06() {
    CountCompleteTreeNodes solution = new CountCompleteTreeNodes();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE);
    int actualAnswer = solution.countNodes(root);

    assertThat(actualAnswer).isEqualTo(17);
  }

}