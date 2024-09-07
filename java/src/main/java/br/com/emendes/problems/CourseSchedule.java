package br.com.emendes.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Existem um total de numCourses cursos que você tem que terminar, marcado de 0 até numCourses - 1.
 * Você recebe um array de prerequisites onde prerequisites[ai, bi] indica que você deve fazer o curso
 * bi antes de fazer o curso ai.<br>
 * <br>
 * Por exemplo: o par [0, 1], indica que você você deve terminar o curso 1 para pegar o curso 0.<br>
 * <br>
 * Retorne true se você pode terminar todos os cursos. Caso contrário retorne false.<br>
 * <br>
 * Restrições:<br>
 * -> 1 <= numCourses <= 2000<br>
 * -> 0 <= prerequisites.length <= 5000<br>
 * -> prerequisites[i].length == 2;
 * -> 0 <= ai, bi < numCourses<br>
 * -> Todos os pares prerequisites[i] são únicos.
 */
public class CourseSchedule {

  public boolean canFinish(int numCourses, int[][] prerequisites) {
    Map<Integer, Set<Integer>> prerequisiteMap = mapPrerequisites(prerequisites, numCourses);
    for (int i = 0; i < numCourses; i++) {
      if (!dfs(i, prerequisiteMap, new HashSet<>())) return false;
    }
    return true;
  }

  private boolean dfs(int course, Map<Integer, Set<Integer>> prerequisiteMap, Set<Integer> toFinish) {
    if (toFinish.contains(course)) return false;
    Set<Integer> prerequisites = prerequisiteMap.get(course);
    if (prerequisites.isEmpty()) return true;

    toFinish.add(course);
    for (int pr : prerequisites) {
      if (!dfs(pr, prerequisiteMap, toFinish)) return false;
    }
    toFinish.remove(course);
    prerequisiteMap.put(course, new HashSet<>());
    return true;
  }

  private Map<Integer, Set<Integer>> mapPrerequisites(int[][] prerequisites, int numCourses) {
    Map<Integer, Set<Integer>> map = new HashMap<>();
    for (int i = 0; i < numCourses; i++) {
      map.put(i, new HashSet<>());
    }
    for (int[] prerequisite : prerequisites) {
      Set<Integer> prerequisiteSet = map.get(prerequisite[0]);
      prerequisiteSet.add(prerequisite[1]);
    }
    return map;
  }

}
