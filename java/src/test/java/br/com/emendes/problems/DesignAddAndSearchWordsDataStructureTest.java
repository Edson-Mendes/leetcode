package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DesignAddAndSearchWordsDataStructureTest {

  @Test
  void test01() {
    DesignAddAndSearchWordsDataStructure.WordDictionary solution = new DesignAddAndSearchWordsDataStructure.WordDictionary();

    assertThat(solution.search("bad")).isFalse();
    solution.addWord("bad");
    assertThat(solution.search("bad")).isTrue();
    assertThat(solution.search(".ad")).isTrue();
    assertThat(solution.search("b.d")).isTrue();
    assertThat(solution.search("ba.")).isTrue();
  }

  @Test
  void test02() {
    DesignAddAndSearchWordsDataStructure.WordDictionary solution = new DesignAddAndSearchWordsDataStructure.WordDictionary();

    assertThat(solution.search("dad")).isFalse();
    solution.addWord("dad");
    assertThat(solution.search("dad")).isTrue();
    assertThat(solution.search("bad")).isFalse();
    assertThat(solution.search(".ad")).isTrue();
    assertThat(solution.search("..d")).isTrue();
  }

  @Test
  void test04() {
    DesignAddAndSearchWordsDataStructure.WordDictionary solution = new DesignAddAndSearchWordsDataStructure.WordDictionary();

    solution.addWord("foobar");
    assertThat(solution.search("fooba")).isFalse();
    assertThat(solution.search("f")).isFalse();
    assertThat(solution.search("foo")).isFalse();
    assertThat(solution.search("foob..")).isTrue();
    assertThat(solution.search("f.ob.r")).isTrue();
  }

  @Test
  void test05() {
    DesignAddAndSearchWordsDataStructure.WordDictionary solution = new DesignAddAndSearchWordsDataStructure.WordDictionary();

    solution.addWord("a");
    assertThat(solution.search("a")).isTrue();
    assertThat(solution.search(".")).isTrue();
    assertThat(solution.search("aa")).isFalse();
    assertThat(solution.search("a.")).isFalse();
    assertThat(solution.search(".a")).isFalse();
  }

  @Test
  void test06() {
    DesignAddAndSearchWordsDataStructure.WordDictionary solution = new DesignAddAndSearchWordsDataStructure.WordDictionary();

    assertThat(solution.search("ab")).isFalse();
    solution.addWord("ab");
    assertThat(solution.search("ab")).isTrue();
    assertThat(solution.search("a.")).isTrue();
    assertThat(solution.search(".b")).isTrue();
    assertThat(solution.search("..")).isTrue();
  }

  @Test
  void test07() {
    DesignAddAndSearchWordsDataStructure.WordDictionary solution = new DesignAddAndSearchWordsDataStructure.WordDictionary();

    solution.addWord("aa");
    solution.addWord("ab");
    solution.addWord("ac");
    solution.addWord("ad");
    solution.addWord("za");
    solution.addWord("zb");
    solution.addWord("zc");
    assertThat(solution.search("ab")).isTrue();
    assertThat(solution.search("a.")).isTrue();
    assertThat(solution.search(".b")).isTrue();
    assertThat(solution.search("z.")).isTrue();
    assertThat(solution.search("..")).isTrue();
  }

  @Test
  void test08() {
    DesignAddAndSearchWordsDataStructure.WordDictionary solution = new DesignAddAndSearchWordsDataStructure.WordDictionary();

    solution.addWord("xgvk");
    solution.addWord("wykzbvwdsoyfowqicymzd");
    solution.addWord("xajbtjyjuwgoynjgu");
    assertThat(solution.search("wykzbvwdso..owqicymzd")).isTrue();
    assertThat(solution.search("..ha")).isFalse();
    solution.addWord("qsibzxaorktypkfg");
    assertThat(solution.search("xgvk")).isTrue();
    solution.addWord("vbycuvrkbcq");
    assertThat(solution.search("qsibz.aorkty.kfg")).isTrue();
    solution.addWord("sm");
  }

  @Test
  void test09() {
    DesignAddAndSearchWordsDataStructure.WordDictionary solution = new DesignAddAndSearchWordsDataStructure.WordDictionary();

    solution.addWord("zz");
    solution.addWord("aaaaa");
    assertThat(solution.search("aaaaa")).isTrue();
    assertThat(solution.search("zz")).isTrue();
    assertThat(solution.search("z.")).isTrue();
    assertThat(solution.search(".z")).isTrue();
    assertThat(solution.search("a.")).isFalse();
    assertThat(solution.search("..")).isTrue();
  }

  @Test
  void test10() {
    DesignAddAndSearchWordsDataStructure.WordDictionary solution = new DesignAddAndSearchWordsDataStructure.WordDictionary();

    solution.addWord("zz");
    solution.addWord("aaaaa");
    assertThat(solution.search("..")).isTrue();
  }

}