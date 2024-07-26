package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BSTIteratorTest {

  @Test
  void test01() {
    TreeNode root = TreeNodeGenerator.generate(10);
    BSTIterator solution = new BSTIterator(root);

    assertThat(solution.hasNext()).isTrue();
    assertThat(solution.next()).isEqualTo(10);
    assertThat(solution.hasNext()).isFalse();
  }

  @Test
  void test02() {
    TreeNode root = TreeNodeGenerator.generate(7, 3, 15, Integer.MIN_VALUE, Integer.MIN_VALUE, 9, 20);
    BSTIterator solution = new BSTIterator(root);

    assertThat(solution.next()).isEqualTo(3);
    assertThat(solution.next()).isEqualTo(7);
    assertThat(solution.hasNext()).isTrue();
    assertThat(solution.next()).isEqualTo(9);
    assertThat(solution.hasNext()).isTrue();
    assertThat(solution.next()).isEqualTo(15);
    assertThat(solution.hasNext()).isTrue();
    assertThat(solution.next()).isEqualTo(20);
    assertThat(solution.hasNext()).isFalse();
  }

}