package br.com.emendes.problems;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Implemente um queue (fila) first in first out (FIFO) usando apenas duas stacks.
 * A queue implementada deve suportar todas as funções de uma queue normal (push, peek, pop e empty).
 * <br><br>
 * Implemente a classe MyQueue:<br>
 * -> void push(int x) insere o elemento x ao fim da queue.<br>
 * -> int pop() remove o elemento a frente da queue e o retorna.<br>
 * -> int peek() retorna o elemento que esta a frente na queue.<br>
 * -> boolean empty() retorna true se a queue está vazia, false caso contrário.<br>
 * <br>
 * Notas:<br>
 * -> Você só deve usar operações padrão da stack, o que quer dizer apenas push to top, peek/pop from top,
 * size e isEmpty são operações válidas.<br>
 * -> Dependendo da sua linguagem, a pilha pode não ser suportada nativamente.
 * Você pode simular uma pilha usando uma lista ou deque (fila de extremidade dupla),
 * desde que use apenas as operações padrão da pilha.
 * <br><br>
 * Restrições:<br>
 * 1 <= x <= 9<br>
 * No máximo 100 calls serão feitas para push, pop, peek e empty.<br>
 * Todas as chamadas para pop e peek são válidas.
 * <br><br>
 * Você pode implementar a fila de forma que cada operação seja amortizada em complexidade de tempo O(1)?
 * Em outras palavras, executar n operações levará um tempo total O(n), mesmo que uma dessas operações demore mais.
 */
public class ImplementQueueUsingStacks {

  static class MyQueue {

    private final Deque<Integer> values;
    private final Deque<Integer> helper;

    public MyQueue() {
      values = new ArrayDeque<>();
      helper = new ArrayDeque<>();
    }

    public void push(int x) {
      while (!values.isEmpty()) {
        helper.push(values.pop());
      }
      helper.push(x);
      while (!helper.isEmpty()) {
        values.push(helper.pop());
      }
    }

    public int pop() {
      return values.pop();
    }

    public int peek() {
      Integer value = values.pop();
      values.push(value);
      return value;
    }

    public boolean empty() {
      return values.isEmpty();
    }

  }

}
