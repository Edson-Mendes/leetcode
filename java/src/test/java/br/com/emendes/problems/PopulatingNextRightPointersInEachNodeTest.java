package br.com.emendes.problems;

import br.com.emendes.problems.util.Node;
import br.com.emendes.problems.util.NodeGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PopulatingNextRightPointersInEachNodeTest {

  @Test
  void test01() {
    PopulatingNextRightPointersInEachNode solution = new PopulatingNextRightPointersInEachNode();

    Node actualAnswer = solution.connect(null);

    Assertions.assertThat(actualAnswer).isNull();
  }

  @Test
  void test02() {
    PopulatingNextRightPointersInEachNode solution = new PopulatingNextRightPointersInEachNode();

    Node root = NodeGenerator.generate(1);
    Node actualAnswer = solution.connect(root);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.next).isNull();
  }

  @Test
  void test03() {
    PopulatingNextRightPointersInEachNode solution = new PopulatingNextRightPointersInEachNode();

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
    PopulatingNextRightPointersInEachNode solution = new PopulatingNextRightPointersInEachNode();

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

}