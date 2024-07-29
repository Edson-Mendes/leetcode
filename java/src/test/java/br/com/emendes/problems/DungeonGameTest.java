package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DungeonGameTest {

  @Test
  void test01() {
    DungeonGame solution = new DungeonGame();

    int[][] dungeon = {{0}};
    int actualAnswer = solution.calculateMinimumHP(dungeon);

    assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test02() {
    DungeonGame solution = new DungeonGame();

    int[][] dungeon = {{10}};
    int actualAnswer = solution.calculateMinimumHP(dungeon);

    assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test03() {
    DungeonGame solution = new DungeonGame();

    int[][] dungeon = {{-10}};
    int actualAnswer = solution.calculateMinimumHP(dungeon);

    assertThat(actualAnswer).isEqualTo(11);
  }

  @Test
  void test04() {
    DungeonGame solution = new DungeonGame();

    int[][] dungeon = {{-2, 1}, {-1, -5}};
    int actualAnswer = solution.calculateMinimumHP(dungeon);

    assertThat(actualAnswer).isEqualTo(7);
  }

  @Test
  void test05() {
    DungeonGame solution = new DungeonGame();

    int[][] dungeon = {{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}};
    int actualAnswer = solution.calculateMinimumHP(dungeon);

    assertThat(actualAnswer).isEqualTo(7);
  }

  @Test
  void test06() {
    DungeonGame solution = new DungeonGame();

    int[][] dungeon = {{-2, -3, 3, -4}};
    int actualAnswer = solution.calculateMinimumHP(dungeon);

    assertThat(actualAnswer).isEqualTo(7);
  }

  @Test
  void test07() {
    DungeonGame solution = new DungeonGame();

    int[][] dungeon = {{-2}, {-3}, {3}, {-4}};
    int actualAnswer = solution.calculateMinimumHP(dungeon);

    assertThat(actualAnswer).isEqualTo(7);
  }

  @Test
  void test08() {
    DungeonGame solution = new DungeonGame();

    int[][] dungeon = {{1, -3, 3}, {0, -2, 0}, {-3, -3, -3}};
    int actualAnswer = solution.calculateMinimumHP(dungeon);

    assertThat(actualAnswer).isEqualTo(3);
  }

}