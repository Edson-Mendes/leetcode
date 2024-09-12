package br.com.emendes.problems;

import java.util.*;

/**
 * Existe um total de numCourses cursos que você deve fazer, marcado de 0 até numCourses - 1.
 * Você recebe um array de pré-requisitos onde prerequisites[i] = [ai, bi] indicando que você deve
 * fazer o curso bi antes ai.<br>
 * <br>
 * -> Por exemplo, o par [0, 1] indica que você deve fazer o curso 0 antes de poder pegar o curso 1.<br>
 * <br>
 * Retorne a ordem dos cursos que você deve fazer para terminar todos os cursos.
 * Se houver muitas respostas válidas, retorna qualquer uma delas.
 * Se for impossível terminar todos os cursos, retorna um array vazio.<br>
 * <br>
 * Restrições:<br>
 * -> 1 <= numCourses <= 2000<br>
 * -> 0 <= prerequisites.length <= numCourses * (numCourses - 1)<br>
 * -> prerequisites[i].length == 2<br>
 * -> 0 <= ai, bi < numCourses<br>
 * -> ai != bi<br>
 * -> Todos os pares [ai, bi] são distintos.
 */
public class CourseScheduleII {

  public int[] findOrder(int numCourses, int[][] prerequisites) {
    Map<Integer, List<Integer>> prerequisitesMap = toMap(prerequisites, numCourses);
    Set<Integer> coursesOrder = new LinkedHashSet<>();

    for (int i = 0; i < numCourses; i++) {
      if (!dfs(i, prerequisitesMap, new HashSet<>(), coursesOrder))
        return new int[]{};
    }

    return coursesOrder.stream().mapToInt(i -> i).toArray();
  }

  private boolean dfs(int course, Map<Integer, List<Integer>> prerequisites, Set<Integer> toFinish, Set<Integer> order) {
    if (toFinish.contains(course)) return false;
    if (order.contains(course)) return true;
    List<Integer> prerequisitesCourse = prerequisites.get(course);

    toFinish.add(course);
    for (int c : prerequisitesCourse) {
      if (!dfs(c, prerequisites, toFinish, order)) return false;
    }

    toFinish.remove(course);
    prerequisites.put(course, List.of());
    order.add(course);
    return true;
  }

  private Map<Integer, List<Integer>> toMap(int[][] prerequisites, int numCourses) {
    Map<Integer, List<Integer>> prerequisitesMap = new HashMap<>();
    for (int i = 0; i < numCourses; i++) {
      prerequisitesMap.put(i, new ArrayList<>());
    }
    for (int[] prerequisite : prerequisites) {
      prerequisitesMap.get(prerequisite[0]).add(prerequisite[1]);
    }
    return prerequisitesMap;
  }

}
