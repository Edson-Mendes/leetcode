package br.com.emendes.problems;

import java.util.*;

/**
 * O horizonte de uma cidade é o contorno externo da silhueta formada por todos os edifícios daquela
 * cidade quando vistos à distância. Dadas as localizações e alturas de todos os edifícios,
 * retorne o horizonte formado por esses edifícios coletivamente.<br>
 * <br>
 * As informações geométricas de cada edifício são fornecidas no array buildings onde
 * buildings[i] = [lefti, righti, heighti]:<br>
 * -- lefti é a coordenada x da borda esquerda do iésimo edifício.<br>
 * -- righti é a coordenada x da borda direita do iésimo edifício.<br>
 * -- heighti é a altura do iésimo edifício.<br>
 * <br>
 * Você pode supor que todos os edifícios são retângulos perfeitos apoiados em uma superfície
 * absolutamente plana na altura 0.<br>
 * <br>
 * O horizonte deve ser representado como uma lista de "pontos-chave" classificados por sua coordenada x
 * no formato [[x1,y1],[x2,y2],...]. Cada ponto-chave é o ponto final esquerdo de algum segmento horizontal no horizonte,
 * exceto o último ponto na lista, que sempre tem uma coordenada y 0 e é usada para marcar o término do horizonte
 * onde termina o edifício mais à direita. Qualquer terreno entre os edifícios mais à esquerda e mais à direita
 * deve fazer parte do contorno do horizonte.<br>
 * <br>
 * Note: Não deve haver linhas horizontais consecutivas de mesma altura no horizonte de saída.
 * Por exemplo, [...,[2 3],[4 5],[7 5],[11 5],[12 7],...] não é aceitável;
 * as três linhas de altura 5 devem ser mescladas em uma na saída final, como tal: [...,[2 3],[4 5],[12 7],...]<br>
 * <br>
 * Restrições:<br>
 * 1 <= buildings.length <= 10⁴<br>
 * 0 <= lefti < righti <= 2³¹ - 1<br>
 * 1 <= heighti <= 2³¹ - 1<br>
 * buildings está ordenado por lefti em ordem crescente.
 */
public class TheSkylineProblem {

  public List<List<Integer>> getSkyline(int[][] buildings) {
    Queue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(h -> -h));
    List<List<Integer>> skylineDots = new ArrayList<>();

    List<Edge> edges = extractEdges(buildings);
    edges.sort(Comparator.comparingInt(e -> e.side));
    int lastHeight = 0;

    for (int i = 0; i < edges.size(); i++) {
      Edge edge = edges.get(i);
      boolean mustContinue = i + 1 < edges.size() && edge.side == edges.get(i + 1).side;
      if (edge.isLeftSide) {
        queue.offer(edge.height);
      } else {
        queue.remove(edge.height);
      }
      if (mustContinue) continue;
      int height = queue.isEmpty() ? 0 : queue.peek();
      if (height != lastHeight) {
        skylineDots.add(List.of(edge.side, height));
      }
      lastHeight = height;
    }

    return skylineDots;
  }

  private List<Edge> extractEdges(int[][] buildings) {
    List<Edge> edges = new ArrayList<>();
    for (int[] building : buildings) {
      edges.add(new Edge(building[0], building[2], true));
      edges.add(new Edge(building[1], building[2], false));
    }

    return edges;
  }

  private static class Edge {
    int side;
    int height;
    boolean isLeftSide;

    public Edge(int side, int height, boolean isLeftSide) {
      this.side = side;
      this.height = height;
      this.isLeftSide = isLeftSide;
    }
  }

}
