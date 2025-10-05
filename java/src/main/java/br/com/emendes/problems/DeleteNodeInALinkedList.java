package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;

/**
 * Existe uma linked list head, e nós queremos deletar um node node da lista.<br>
 * <br>
 * Você recebe o node que será deletado. Você não terá acesso ao primeiro elemento da lista (head).<br>
 * <br>
 * Todos os valores da lista são únicos, e é garantido que o node dado não é o último elemento da lista.<br>
 * <br>
 * Delete o dado node. Note que por deletar, não queremos dizer remover da memória. Queremos dizer:<br>
 * - O valor do dado node não deve existir na lista.<br>
 * - O número de nodes da lista deve ser reduzido em um.<br>
 * - Todos os valores antes de node devem estar na mesma ordem.<br>
 * - Todos os valores depois de node devem estar na mesma ordem.<br>
 * <br>
 * Teste customizado:<br>
 * <br>
 * - Para entrada, você deve fornecer a lista inteira e o dado node, node não deve ser o último node da lista.<br>
 * - Vamos construir a linked list e fornecer o node para o método.<br>
 * - A saída será a lista inteira após a chamada do método.<br>
 * <br>
 * Restrições:<br>
 * - O número de nodes da lista está no intervalo [2, 1000].<br>
 * - -1000 <= Node.val <= 1000<br>
 * - O valor de cada node na lista é único.<br>
 * - O node para ser deletado está na lista e não é o último.<br>
 */
public class DeleteNodeInALinkedList {

  public void deleteNode(ListNode node) {
    while (node.next.next != null) {
      node.val = node.next.val;
      node = node.next;
    }
    node.val = node.next.val;
    node.next = null;
  }

  public void firstSolution(ListNode node) {
    node.val = node.next.val;
    if (node.next.next == null) {
      node.next = null;
      return;
    }
    firstSolution(node.next);
  }

}
