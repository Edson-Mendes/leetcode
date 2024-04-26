package br.com.emendes.problems.util.graph;

import java.util.HashMap;
import java.util.Map;

public class GraphGenerator {

  private GraphGenerator() {
  }

  public static Node generate(int[][] graph) {
    Map<Integer, Node> nodes = getNodes(graph);

    for (int i = 0; i < graph.length; i++) {
      Node node = nodes.get(i + 1);
      for (int j = 0; j < graph[i].length; j++) {
        Node neighbor = nodes.get(graph[i][j]);
        node.neighbors.add(neighbor);
      }
    }

    return nodes.get(1);
  }

  private static Map<Integer, Node> getNodes(int[][] graph) {
    Map<Integer, Node> nodes = new HashMap<>();

    for (int i = 0; i < graph.length; i++) {
      Node node = new Node(i + 1);
      nodes.put(i + 1, node);
    }

    return nodes;
  }

}
