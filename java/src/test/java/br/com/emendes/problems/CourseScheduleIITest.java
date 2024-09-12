package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CourseScheduleIITest {

  @Test
  void test01() {
    CourseScheduleII solution = new CourseScheduleII();

    int numCourses = 1;
    int[][] prerequisites = {};
    int[] actualAnswer = solution.findOrder(numCourses, prerequisites);

    assertThat(actualAnswer).isNotNull().containsExactly(0);
  }

  @Test
  void test02() {
    CourseScheduleII solution = new CourseScheduleII();

    int numCourses = 2;
    int[][] prerequisites = {};
    int[] actualAnswer = solution.findOrder(numCourses, prerequisites);

    assertThat(actualAnswer).isNotNull().containsExactly(0, 1);
  }

  @Test
  void test03() {
    CourseScheduleII solution = new CourseScheduleII();

    int numCourses = 2;
    int[][] prerequisites = {{0, 1}};
    int[] actualAnswer = solution.findOrder(numCourses, prerequisites);

    assertThat(actualAnswer).isNotNull().containsExactly(1, 0);
  }

  @Test
  void test04() {
    CourseScheduleII solution = new CourseScheduleII();

    int numCourses = 4;
    int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
    int[] actualAnswer = solution.findOrder(numCourses, prerequisites);

    assertThat(actualAnswer).isNotNull().containsExactly(0, 1, 2, 3);
  }

  @Test
  void test05() {
    CourseScheduleII solution = new CourseScheduleII();

    int numCourses = 4;
    int[][] prerequisites = {{0, 1}, {1, 2}, {2, 3}, {3, 0}};
    int[] actualAnswer = solution.findOrder(numCourses, prerequisites);

    assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test06() {
    CourseScheduleII solution = new CourseScheduleII();

    int numCourses = 4;
    int[][] prerequisites = {{1, 2}, {2, 3}, {3, 1}};
    int[] actualAnswer = solution.findOrder(numCourses, prerequisites);

    assertThat(actualAnswer).isNotNull().isEmpty();
  }

}