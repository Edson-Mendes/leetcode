package br.com.emendes.problems;

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
    int[][] cache = new int[numCourses][numCourses];
    for (int[] prerequisite : prerequisites) {
      cache[prerequisite[0]][prerequisite[1]] = 2;
    }
    for (int[] prerequisite : prerequisites) {
      if (!canFinish(prerequisite[0], prerequisite[1], numCourses, cache)) return false;
    }
    return true;
  }

  private boolean canFinish(int course, int prerequisite, int numCourses, int[][] cache) {
    if (cache[course][prerequisite] < 2) return cache[course][prerequisite] == 0;

    cache[course][prerequisite] = 1;
    for (int p = 0; p < numCourses; p++) {
      if (!canFinish(prerequisite, p, numCourses, cache)) return false;
    }
    cache[course][prerequisite] = 0;
    return true;
  }

}
