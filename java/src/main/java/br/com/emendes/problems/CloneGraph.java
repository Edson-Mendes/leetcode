package br.com.emendes.problems;

import br.com.emendes.problems.util.graph.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * Dado a referência de um node em um graph não direcionado conectado.<br>
 * <br>
 * Retorne uma deep copy (clone) do graph.<br>
 * <br>
 * Cada node do graph contém um valor int e uma list dos seus vizinhos.<br>
 * <br>
 * Formato dos casos de testes:<br>
 * <br>
 * Para simplificar, o valor de cada nó é igual ao índice do nó (indexado em 1).
 * Por exemplo, o primeiro nó com val == 1, o segundo nó com val == 2 e assim por diante.
 * O gráfico é representado no caso de teste usando uma lista de adjacências.<br>
 * <br>
 * Uma lista de adjacências é uma coleção de listas não ordenadas usadas para representar um grafo finito.
 * Cada lista descreve o conjunto de vizinhos de um nó no gráfico.<br>
 * <br>
 * O nó fornecido sempre será o primeiro nó com val = 1.
 * Você deve retornar a cópia do nó fornecido como referência ao gráfico clonado.<br>
 * <br>
 * Restrições:
 * <ul>
 *   <li>O número de nodes do graph esta no intervalo [0, 100].</li>
 *   <li>1 <= Node.val <= 100</li>
 *   <li>Node.val é único para cada node.</li>
 *   <li>Não há arestas repetidas nem auto-loops no gráfico.</li>
 *   <li>O gráfico está conectado e todos os nós podem ser visitados a partir de um determinado nó.</li>
 * </ul>
 */
public class CloneGraph {

  private Map<Integer, Node> visited;
  private Map<Integer, Node> created;

  public Node cloneGraph(Node node) {
    if (node == null) return null;

    visited = new HashMap<>();
    created = new HashMap<>();
    return clone(node);
  }

  private Node clone(Node node) {
    if (visited.containsKey(node.val)) return visited.get(node.val);

    Node clone = getCopy(node.val);
    visited.put(clone.val, clone);

    node.neighbors.forEach(neighbor -> {
      clone(neighbor);
      Node neighborClone = getCopy(neighbor.val);
      clone.neighbors.add(neighborClone);
    });

    return clone;
  }

  private Node getCopy(int value) {
    if (created.containsKey(value)) return created.get(value);

    Node node = new Node(value);
    created.put(value, node);
    return node;
  }

}
