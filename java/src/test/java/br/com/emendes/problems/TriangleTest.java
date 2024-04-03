package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TriangleTest {

  @Test
  void test01() {
    Triangle solution = new Triangle();

    List<List<Integer>> triangle = new ArrayList<>();
    triangle.add(generateList(-10));

    int actualAnswer = solution.minimumTotal(triangle);

    Assertions.assertThat(actualAnswer).isEqualTo(-10);
  }

  @Test
  void test02() {
    Triangle solution = new Triangle();

    List<List<Integer>> triangle = new ArrayList<>();
    triangle.add(generateList(1));
    triangle.add(generateList(2, 3));

    int actualAnswer = solution.minimumTotal(triangle);

    Assertions.assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test03() {
    Triangle solution = new Triangle();

    List<List<Integer>> triangle = new ArrayList<>();
    triangle.add(generateList(2));
    triangle.add(generateList(3, 4));
    triangle.add(generateList(6, 5, 7));
    triangle.add(generateList(4, 1, 8, 3));

    int actualAnswer = solution.minimumTotal(triangle);

    Assertions.assertThat(actualAnswer).isEqualTo(11);
  }

  private List<Integer> generateList(int... values) {
    List<Integer> list = new ArrayList<>();

    for (int value : values) {
      list.add(value);
    }

    return list;
  }

}