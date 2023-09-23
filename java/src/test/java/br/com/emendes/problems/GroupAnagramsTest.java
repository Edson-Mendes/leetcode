package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class GroupAnagramsTest {

  @Test
  void test01() {
    GroupAnagrams solution = new GroupAnagrams();

    String[] input = {"eat"};

    List<List<String>> actualAnswer = solution.groupAnagrams(input);

    Assertions.assertThat(actualAnswer).isNotNull().isNotEmpty().hasSize(1);
  }

  @Test
  void test02() {
    GroupAnagrams solution = new GroupAnagrams();

    String[] input = {"eat", "tea", "ate"};

    List<List<String>> actualAnswer = solution.groupAnagrams(input);

    Assertions.assertThat(actualAnswer).isNotNull().isNotEmpty().hasSize(1);
  }

  @Test
  void test03() {
    GroupAnagrams solution = new GroupAnagrams();

    String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

    List<List<String>> actualAnswer = solution.groupAnagrams(input);

    Assertions.assertThat(actualAnswer).isNotNull().isNotEmpty().hasSize(3);
  }

  @Test
  void test04() {
    GroupAnagrams solution = new GroupAnagrams();

    String[] input = {"eat", "tea", "", "", "tan", "ate", "nat", "bat", ""};

    List<List<String>> actualAnswer = solution.groupAnagrams(input);

    Assertions.assertThat(actualAnswer).isNotNull().isNotEmpty().hasSize(4);
  }

}