package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.Integer.MIN_VALUE;

class SymmetricTreeTest {

  @Test
  void test01() {
    SymmetricTree solution = new SymmetricTree();

    TreeNode root = TreeNodeGenerator.generate(1);

    boolean actualAnswer = solution.isSymmetric(root);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test02() {
    SymmetricTree solution = new SymmetricTree();

    TreeNode root = TreeNodeGenerator.generate(1, 2, MIN_VALUE);

    boolean actualAnswer = solution.isSymmetric(root);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test03() {
    SymmetricTree solution = new SymmetricTree();

    TreeNode root = TreeNodeGenerator.generate(1, MIN_VALUE, 2);

    boolean actualAnswer = solution.isSymmetric(root);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test04() {
    SymmetricTree solution = new SymmetricTree();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 2);

    boolean actualAnswer = solution.isSymmetric(root);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test05() {
    SymmetricTree solution = new SymmetricTree();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 3);

    boolean actualAnswer = solution.isSymmetric(root);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test06() {
    SymmetricTree solution = new SymmetricTree();

    TreeNode root = TreeNodeGenerator.generate(1, 3, 2);

    boolean actualAnswer = solution.isSymmetric(root);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test07() {
    SymmetricTree solution = new SymmetricTree();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 2, MIN_VALUE, 3, MIN_VALUE, 3);

    boolean actualAnswer = solution.isSymmetric(root);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test08() {
    SymmetricTree solution = new SymmetricTree();

    TreeNode root = TreeNodeGenerator.generate(1, 2, 2, 3, 4, 4, 3);

    boolean actualAnswer = solution.isSymmetric(root);

    Assertions.assertThat(actualAnswer).isTrue();
  }

}