package br.com.emendes.problems;

import br.com.emendes.problems.util.graph.GraphGenerator;
import br.com.emendes.problems.util.graph.Node;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CloneGraphTest {

  @Test
  void test01() {
    CloneGraph solution = new CloneGraph();

    Node actualAnswer = solution.cloneGraph(null);

    assertThat(actualAnswer).isNull();
  }

  @Test
  void test02() {
    CloneGraph solution = new CloneGraph();

    int[][] graphAsArray = {{}};
    Node node = GraphGenerator.generate(graphAsArray);
    Node actualAnswer = solution.cloneGraph(node);

    assertThat(actualAnswer).isNotNull();
    assertThat(actualAnswer.val).isEqualTo(1);
    assertThat(actualAnswer.neighbors).isNotNull().isEmpty();
  }

  @Test
  void test03() {
    CloneGraph solution = new CloneGraph();

    int[][] graphAsArray = {
        {2, 4},
        {1, 3},
        {2, 4},
        {1, 3}
    };
    Node node = GraphGenerator.generate(graphAsArray);
    Node actualAnswer = solution.cloneGraph(node);

    assertThat(actualAnswer).isNotNull();
    assertThat(actualAnswer.val).isEqualTo(1);
    assertThat(actualAnswer.neighbors).isNotNull().hasSize(2);
  }

}