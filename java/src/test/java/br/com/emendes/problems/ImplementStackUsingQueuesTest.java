package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ImplementStackUsingQueuesTest {

  @Test
  void test01() {
    ImplementStackUsingQueues solution = new ImplementStackUsingQueues();

    assertThat(solution.empty()).isTrue();
    solution.push(10);
    assertThat(solution.empty()).isFalse();
    assertThat(solution.top()).isEqualTo(10);
    assertThat(solution.pop()).isEqualTo(10);
    assertThat(solution.empty()).isTrue();
  }

  @Test
  void test02() {
    ImplementStackUsingQueues solution = new ImplementStackUsingQueues();

    solution.push(1);
    solution.push(2);
    assertThat(solution.top()).isEqualTo(2);
    assertThat(solution.pop()).isEqualTo(2);
    assertThat(solution.empty()).isFalse();
  }

  @Test
  void test03() {
    ImplementStackUsingQueues solution = new ImplementStackUsingQueues();

    solution.push(1);
    solution.push(2);
    solution.push(3);
    solution.push(4);
    assertThat(solution.empty()).isFalse();
    assertThat(solution.top()).isEqualTo(4);
    assertThat(solution.pop()).isEqualTo(4);
    assertThat(solution.empty()).isFalse();
    assertThat(solution.top()).isEqualTo(3);
    assertThat(solution.pop()).isEqualTo(3);
    assertThat(solution.empty()).isFalse();
    assertThat(solution.top()).isEqualTo(2);
    assertThat(solution.pop()).isEqualTo(2);
    assertThat(solution.empty()).isFalse();
    assertThat(solution.top()).isEqualTo(1);
    assertThat(solution.pop()).isEqualTo(1);
    assertThat(solution.empty()).isTrue();
  }

}