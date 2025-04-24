package br.com.emendes.problems;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Implemente uma pilha last-in-first-out (LIFO) usando apenas duas queues (filas).
 * A implementação da pilha deve suportar todas as funcionalidades de uma pilha normal
 * (push, top, pop, e empty).
 * <br><br>
 * Implemente a classe MyStack.
 * <br><br>
 * - void push(int x) insere um elemento x ao topo da stack.<br>
 * - int pop() remove o elemento no topo da stack e retorne-o.<br>
 * - int top() retorna o elemento no topo da stack.<br>
 * - boolean empty() retorne true se a stack estiver vazia, false caso contrário.
 * <br><br>
 * Notas:<br>
 * Você deve usar apenas operações padrões da queue, o que significa que apenas as operações
 * push to back, peek/pop from front, size e isEmpty são válidas.
 * <br><br>
 * Dependendo da sua linguagem, a queue pode não ser suportada nativamente.
 * Você pode simular uma queue usando uma lista ou deque (double ended queue)
 * contanto que você use apenas as operações padrão da queue.
 * <br><br>
 * Restrições:<br>
 * 1 <= x <= 9<br>
 * No máximo 100 chamadas serão feitas para push, pop, top e empty.<br>
 * Todas as chamadas a pop e top são válidas.
 * <br><br>
 * Follow-up: Você poderia implementar a stack usando apenas uma queue?
 */
public class ImplementStackUsingQueues {

  private final Queue<Integer> memory = new ArrayDeque<>();

  public void push(int x) {
    memory.add(x);
  }

  public int pop() {
    rotate(memory.size() - 1);
    return memory.poll();
  }

  public int top() {
    rotate(memory.size() - 1);
    int top = memory.peek();
    rotate(1);
    return top;
  }

  public boolean empty() {
    return memory.isEmpty();
  }

  private void rotate(int rotations) {
    while (rotations > 0) {
      Integer value = memory.poll();
      memory.add(value);
      rotations--;
    }
  }

}
