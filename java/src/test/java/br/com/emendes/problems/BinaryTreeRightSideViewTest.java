package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.lang.Integer.MIN_VALUE;
import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeRightSideViewTest {

  @Test
  void test01() {
    BinaryTreeRightSideView solution = new BinaryTreeRightSideView();

    TreeNode root = TreeNodeGenerator.generate(10);
    List<Integer> actualAnswer = solution.rightSideView(root);

    assertThat(actualAnswer).isNotNull().containsExactly(10);
  }

  @Test
  void test02() {
    BinaryTreeRightSideView solution = new BinaryTreeRightSideView();

    TreeNode root = TreeNodeGenerator.generate(10, 3, MIN_VALUE);
    List<Integer> actualAnswer = solution.rightSideView(root);

    assertThat(actualAnswer).isNotNull().containsExactly(10, 3);
  }

  @Test
  void test03() {
    BinaryTreeRightSideView solution = new BinaryTreeRightSideView();

    TreeNode root = TreeNodeGenerator.generate(10, MIN_VALUE, 3);
    List<Integer> actualAnswer = solution.rightSideView(root);

    assertThat(actualAnswer).isNotNull().containsExactly(10, 3);
  }

  @Test
  void test04() {
    BinaryTreeRightSideView solution = new BinaryTreeRightSideView();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3, MIN_VALUE, 5, MIN_VALUE, 4);
    List<Integer> actualAnswer = solution.rightSideView(root);

    assertThat(actualAnswer).isNotNull().containsExactly(1, 3, 4);
  }

  @Test
  void test05() {
    BinaryTreeRightSideView solution = new BinaryTreeRightSideView();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3, MIN_VALUE, 5, MIN_VALUE, MIN_VALUE);
    List<Integer> actualAnswer = solution.rightSideView(root);

    assertThat(actualAnswer).isNotNull().containsExactly(1, 3, 5);
  }

  @Test
  void test06() {
    BinaryTreeRightSideView solution = new BinaryTreeRightSideView();

    List<Integer> actualAnswer = solution.rightSideView(null);

    assertThat(actualAnswer).isNotNull().isEmpty();
  }

}