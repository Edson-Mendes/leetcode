package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseBitsTest {

  @Test
  void test01() {
    ReverseBits solution = new ReverseBits();

    int actualAnswer = solution.reverseBits(0b00000000000000000000000000000001);

    assertThat(actualAnswer).isEqualTo(0b10000000000000000000000000000000);
  }

  @Test
  void test02() {
    ReverseBits solution = new ReverseBits();

    int actualAnswer = solution.reverseBits(0b00000010100101000001111010011100);

    assertThat(actualAnswer).isEqualTo(0b00111001011110000010100101000000);
  }

  @Test
  void test03() {
    ReverseBits solution = new ReverseBits();

    int actualAnswer = solution.reverseBits(0b11111111111111111111111111111101);

    assertThat(actualAnswer).isEqualTo(0b10111111111111111111111111111111);
  }

}