package br.com.emendes.substringwithconcatenationofallwords;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SubstringWithConcatenationOfAllWordsTest {

  @Test
  void test1() {
    SubstringWithConcatenationOfAllWords solution = new SubstringWithConcatenationOfAllWords();
    String sInput = "barfoothefoobarman";
    String[] words = {"foo", "bar"};

    List<Integer> actualAnswer = solution.findSubstring(sInput, words);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(2).contains(0, 9);
  }

  @Test
  void test2() {
    SubstringWithConcatenationOfAllWords solution = new SubstringWithConcatenationOfAllWords();
    String sInput = "wordgoodgoodgoodbestword";
    String[] words = {"word", "good", "best", "word"};

    List<Integer> actualAnswer = solution.findSubstring(sInput, words);

    Assertions.assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test3() {
    SubstringWithConcatenationOfAllWords solution = new SubstringWithConcatenationOfAllWords();
    String sInput = "barfoofoobarthefoobarman";
    String[] words = {"bar", "foo", "the"};

    List<Integer> actualAnswer = solution.findSubstring(sInput, words);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(3).contains(6, 9, 12);
  }

  @Test
  void test4() {
    SubstringWithConcatenationOfAllWords solution = new SubstringWithConcatenationOfAllWords();
    String sInput = "lingmindraboofooowingdingbarrwingmonkeypoundcake";
    String[] words = {"fooo", "barr", "wing", "ding", "wing"};

    List<Integer> actualAnswer = solution.findSubstring(sInput, words);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(1).contains(13);
  }

  @Test
  void test5() {
    SubstringWithConcatenationOfAllWords solution = new SubstringWithConcatenationOfAllWords();
    String sInput = "wordgoodgoodgoodbestword";
    String[] words = {"word", "good", "best", "good"};

    List<Integer> actualAnswer = solution.findSubstring(sInput, words);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(1).contains(8);
  }

  @Test
  void test6() {
    SubstringWithConcatenationOfAllWords solution = new SubstringWithConcatenationOfAllWords();
    String sInput = "aaaaaaaaaaaaaa";
    String[] words = {"aa", "aa"};

    List<Integer> actualAnswer = solution.findSubstring(sInput, words);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(11).contains(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
  }

}