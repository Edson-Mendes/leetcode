package br.com.emendes.problems;

import br.com.emendes.problems.util.Node;
import br.com.emendes.problems.util.NodeGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PopulatingNextRightPointersInEachNodeIITest {

  @Test
  void test01() {
    PopulatingNextRightPointersInEachNodeII solution = new PopulatingNextRightPointersInEachNodeII();

    Node actualAnswer = solution.connect(null);

    Assertions.assertThat(actualAnswer).isNull();
  }

  @Test
  void test02() {
    PopulatingNextRightPointersInEachNodeII solution = new PopulatingNextRightPointersInEachNodeII();

    Node root = NodeGenerator.generate(1);
    Node actualAnswer = solution.connect(root);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.next).isNull();
  }

  @Test
  void test03() {
    PopulatingNextRightPointersInEachNodeII solution = new PopulatingNextRightPointersInEachNodeII();

    Node root = NodeGenerator.generate(1, 2, 3);
    Node actualAnswer = solution.connect(root);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(1);
    Assertions.assertThat(actualAnswer.next).isNull();

    Assertions.assertThat(actualAnswer.left).isNotNull();
    Assertions.assertThat(actualAnswer.left.val).isEqualTo(2);
    Assertions.assertThat(actualAnswer.left.next).isNotNull();
    Assertions.assertThat(actualAnswer.left.next.val).isEqualTo(3);
    Assertions.assertThat(actualAnswer.left.next.next).isNull();
  }

  @Test
  void test04() {
    PopulatingNextRightPointersInEachNodeII solution = new PopulatingNextRightPointersInEachNodeII();

    Node root = NodeGenerator.generate(1, 2, 3, 4, 5, 6, 7);
    Node actualAnswer = solution.connect(root);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(1);
    Assertions.assertThat(actualAnswer.next).isNull();

    Assertions.assertThat(actualAnswer.left).isNotNull();
    Assertions.assertThat(actualAnswer.left.val).isEqualTo(2);
    Assertions.assertThat(actualAnswer.left.next).isNotNull();
    Assertions.assertThat(actualAnswer.left.next.val).isEqualTo(3);
    Assertions.assertThat(actualAnswer.left.next.next).isNull();

    Assertions.assertThat(actualAnswer.left.left).isNotNull();
    Assertions.assertThat(actualAnswer.left.left.val).isEqualTo(4);
    Assertions.assertThat(actualAnswer.left.left.next).isNotNull();
    Assertions.assertThat(actualAnswer.left.left.next.val).isEqualTo(5);
    Assertions.assertThat(actualAnswer.left.left.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.left.left.next.next.val).isEqualTo(6);
    Assertions.assertThat(actualAnswer.left.left.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.left.left.next.next.next.val).isEqualTo(7);
    Assertions.assertThat(actualAnswer.left.left.next.next.next.next).isNull();
  }

  @Test
  void test05() {
    PopulatingNextRightPointersInEachNodeII solution = new PopulatingNextRightPointersInEachNodeII();

    Node root = NodeGenerator.generate(1, 2, 3, 4, 5, Integer.MIN_VALUE, 7);
    Node actualAnswer = solution.connect(root);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(1);
    Assertions.assertThat(actualAnswer.next).isNull();

    Assertions.assertThat(actualAnswer.left).isNotNull();
    Assertions.assertThat(actualAnswer.left.val).isEqualTo(2);
    Assertions.assertThat(actualAnswer.left.next).isNotNull();
    Assertions.assertThat(actualAnswer.left.next.val).isEqualTo(3);
    Assertions.assertThat(actualAnswer.left.next.next).isNull();

    Assertions.assertThat(actualAnswer.left.left).isNotNull();
    Assertions.assertThat(actualAnswer.left.left.val).isEqualTo(4);
    Assertions.assertThat(actualAnswer.left.left.next).isNotNull();
    Assertions.assertThat(actualAnswer.left.left.next.val).isEqualTo(5);
    Assertions.assertThat(actualAnswer.left.left.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.left.left.next.next.val).isEqualTo(7);
    Assertions.assertThat(actualAnswer.left.left.next.next.next).isNull();
  }

  @Test
  void test06() {
    PopulatingNextRightPointersInEachNodeII solution = new PopulatingNextRightPointersInEachNodeII();

    Node root = NodeGenerator.generate(1, Integer.MIN_VALUE, 3);
    Node actualAnswer = solution.connect(root);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(1);
    Assertions.assertThat(actualAnswer.next).isNull();

    Assertions.assertThat(actualAnswer.left).isNull();
    Assertions.assertThat(actualAnswer.right).isNotNull();
    Assertions.assertThat(actualAnswer.right.val).isEqualTo(3);
    Assertions.assertThat(actualAnswer.right.next).isNull();
  }

  @Test
  void test07() {
    PopulatingNextRightPointersInEachNodeII solution = new PopulatingNextRightPointersInEachNodeII();

    Node root = NodeGenerator.generate(1, 2, 3, Integer.MIN_VALUE, 5, Integer.MIN_VALUE, 7);
    Node actualAnswer = solution.connect(root);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(1);
    Assertions.assertThat(actualAnswer.next).isNull();

    Assertions.assertThat(actualAnswer.left).isNotNull();
    Assertions.assertThat(actualAnswer.left.val).isEqualTo(2);
    Assertions.assertThat(actualAnswer.left.next).isNotNull();
    Assertions.assertThat(actualAnswer.left.next.val).isEqualTo(3);
    Assertions.assertThat(actualAnswer.left.next.next).isNull();

    Assertions.assertThat(actualAnswer.left.left).isNull();
    Assertions.assertThat(actualAnswer.left.right).isNotNull();
    Assertions.assertThat(actualAnswer.left.right.val).isEqualTo(5);
    Assertions.assertThat(actualAnswer.left.right.next).isNotNull();
    Assertions.assertThat(actualAnswer.left.right.next.val).isEqualTo(7);
    Assertions.assertThat(actualAnswer.left.right.next.next).isNull();
  }

}