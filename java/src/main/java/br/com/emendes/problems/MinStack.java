package br.com.emendes.problems;

/**
 * Design a stack (pilha) que suporte push, pop, top e recuperando o elemento mínimo em tempo constante.<br>
 * <br>
 * Implemente o MinStack class:
 * <ul>
 *   <li>MinStack() inicializa o objeto stack.</li>
 *   <li>void push(int val) adiciona o elemento val na stack.</li>
 *   <li>void pop() remove o elemento no topo da stack.</li>
 *   <li>int top() get o elemento do topo da stack.</li>
 *   <li>int getMin() recupera o menor elemento da stack.</li>
 * </ul>
 * Você deve implementar uma solução com complexidade de tempo de O(1) para cada função.<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>-2³¹ <= val <= 2³¹ - 1</li>
 *   <li>Métodos pop, top e getMin apenas serão chamados se a stack estiver não-vazia.</li>
 *   <li>No máximo 3 * 10⁴ chamadas aos métodos serão feitas.</li>
 * </ul>
 */
public class MinStack {

  private final int[] stack;
  private int index;

  public MinStack() {
    this.stack = new int[40_000];
    index = -1;
  }

  public void push(int val) {
    index++;
    stack[index] = val;
  }

  public void pop() {
    index--;
  }

  public int top() {
    return stack[index];
  }

  public int getMin() {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i <= index; i++) {
      min = Math.min(min, stack[i]);
    }

    return min;
  }

}
