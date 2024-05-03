package br.com.emendes.problems;

import br.com.emendes.problems.util.random.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * Uma linked list de tamanho n é fornecida de forma que cada node contenha um ponteiro aleatório adicional,
 * que pode apontar para qualquer nó da lista, ou nulo.<br>
 * <br>
 * Construa uma deep copy da lista. A deep copy deve consistir em exatamente n novos nodes,
 * onde cada novo node tem seu valor definido como o valor de seu node original correspondente.
 * Tanto o next ponteiro quanto o random dos novos nodes devem apontar para novos nodes na lista copiada,
 * de modo que os ponteiros na lista original e na lista copiada representem o mesmo estado da lista.
 * Nenhum dos ponteiros da nova lista deve apontar para nós da lista original.<br>
 * <br>
 * Por exemplo, se houver dois nodes X e Y na lista original, onde X.random -> Y,
 * então para os dois nodes correspondentes x e y na lista copiada, x.random -> y.<br>
 * <br>
 * Retorne o head da lista encadeada copiada.<br>
 * <br>
 * A linked list é representada na entrada/saída como uma lista de n nodes.
 * Cada nodes é representado como um par de [val, random_index] onde:
 * <ul>
 *   <li>val: um número inteiro representando Node.val</li>
 *   <li>random_index: o índice do nó (intervalo de 0 a n-1) para o qual o ponteiro random aponta,
 *   ou null se não apontar para nenhum nó.</li>
 * </ul>
 * Seu código receberá apenas o topo da lista vinculada original.<br>
 * <br>
 * Restrições:
 * <ul>
 *   <li>0 <= n <= 1000</li>
 *   <li>-10⁴ <= Node.val <= 10⁴</li>
 *   <li>Node.random é null ou aponta para algum node na linked list.</li>
 * </ul>
 */
public class CopyListWithRandomPointer {

  private Map<Node, Node> originalToCopy;

  public Node copyRandomList(Node head) {
    if (head == null) return null;

    originalToCopy = new HashMap<>();

    return copy(head);
  }

  private Node copy(Node node) {
    if (node == null) return null;

    Node copy = generateNode(node);
    copy.random = generateNode(node.random);
    copy.next = copy(node.next);

    return copy;
  }

  private Node generateNode(Node node) {
    if (node == null) return null;

    if (originalToCopy.containsKey(node)) {
      return originalToCopy.get(node);
    }
    Node newNode = new Node(node.val);
    originalToCopy.put(node, newNode);
    return newNode;
  }

}
