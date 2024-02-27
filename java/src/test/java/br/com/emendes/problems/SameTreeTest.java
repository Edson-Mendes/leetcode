package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SameTreeTest {

  @Test
  void test01() {
    SameTree solution = new SameTree();

    boolean actualAnswer = solution.isSameTree(null, null);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test02() {
    SameTree solution = new SameTree();

    boolean actualAnswer = solution.isSameTree(TreeNodeGenerator.generate(1), null);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test03() {
    SameTree solution = new SameTree();

    boolean actualAnswer = solution.isSameTree(TreeNodeGenerator.generate(1), TreeNodeGenerator.generate(1));

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test04() {
    SameTree solution = new SameTree();

    boolean actualAnswer = solution.isSameTree(TreeNodeGenerator.generate(1), TreeNodeGenerator.generate(2));

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test05() {
    SameTree solution = new SameTree();

    TreeNode p = TreeNodeGenerator.generate(1, 2, 3);
    TreeNode q = TreeNodeGenerator.generate(1, 2, 3);
    boolean actualAnswer = solution.isSameTree(p, q);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test06() {
    SameTree solution = new SameTree();

    TreeNode p = TreeNodeGenerator.generate(1, 3, 2);
    TreeNode q = TreeNodeGenerator.generate(1, 2, 3);
    boolean actualAnswer = solution.isSameTree(p, q);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test07() {
    SameTree solution = new SameTree();

    TreeNode p = TreeNodeGenerator.generate(1, 2, 3, 4, 5, 6, Integer.MIN_VALUE);
    TreeNode q = TreeNodeGenerator.generate(1, 2, 3, 4, 5, 6, 7);
    boolean actualAnswer = solution.isSameTree(p, q);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test08() {
    SameTree solution = new SameTree();

    TreeNode p = TreeNodeGenerator.generate(1, 2, 3, 4, 5, 6, 7);
    TreeNode q = TreeNodeGenerator.generate(1, 2, 3, 4, 5, 6, 8);
    boolean actualAnswer = solution.isSameTree(p, q);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test09() {
    SameTree solution = new SameTree();

    TreeNode p = TreeNodeGenerator.generate(1, 2, Integer.MIN_VALUE);
    TreeNode q = TreeNodeGenerator.generate(1, Integer.MIN_VALUE, 2);
    boolean actualAnswer = solution.isSameTree(p, q);

    Assertions.assertThat(actualAnswer).isFalse();
  }

}