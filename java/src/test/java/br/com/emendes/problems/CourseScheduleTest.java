package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CourseScheduleTest {

  @Test
  void test01() {
    CourseSchedule solution = new CourseSchedule();

    int[][] prerequisites = {};
    boolean actualAnswer = solution.canFinish(1, prerequisites);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test02() {
    CourseSchedule solution = new CourseSchedule();

    int[][] prerequisites = {{1, 0}};
    boolean actualAnswer = solution.canFinish(2, prerequisites);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test03() {
    CourseSchedule solution = new CourseSchedule();

    int[][] prerequisites = {{1, 0}, {0, 1}};
    boolean actualAnswer = solution.canFinish(2, prerequisites);

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test04() {
    CourseSchedule solution = new CourseSchedule();

    int[][] prerequisites = {{2, 0}, {2, 1}};
    boolean actualAnswer = solution.canFinish(3, prerequisites);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test05() {
    CourseSchedule solution = new CourseSchedule();

    int[][] prerequisites = {{2, 1}, {1, 0}, {0, 2}};
    boolean actualAnswer = solution.canFinish(3, prerequisites);

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test06() {
    CourseSchedule solution = new CourseSchedule();

    int[][] prerequisites = {{2, 0}, {5, 4}, {1, 0}, {3, 2}, {3, 1}, {4, 3}, {2, 1}};
    boolean actualAnswer = solution.canFinish(6, prerequisites);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test07() {
    CourseSchedule solution = new CourseSchedule();

    int[][] prerequisites = {{5, 0}, {5, 4}, {5, 2}, {5, 1}, {5, 3}};
    boolean actualAnswer = solution.canFinish(6, prerequisites);

    assertThat(actualAnswer).isTrue();
  }

}