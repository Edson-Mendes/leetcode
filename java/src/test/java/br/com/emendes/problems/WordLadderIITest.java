package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class WordLadderIITest {

  @Test
  void test01() {
    WordLadderII solution = new WordLadderII();

    String beginWord = "a";
    String endWord = "b";
    List<String> wordList = List.of("b");
    List<List<String>> actualAnswer = solution.findLadders(beginWord, endWord, wordList);

    assertThat(actualAnswer).isNotNull().hasSize(1).contains(List.of("a", "b"));
  }

  @Test
  void test02() {
    WordLadderII solution = new WordLadderII();

    String beginWord = "a";
    String endWord = "b";
    List<String> wordList = List.of("c");
    List<List<String>> actualAnswer = solution.findLadders(beginWord, endWord, wordList);

    assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test03() {
    WordLadderII solution = new WordLadderII();

    String beginWord = "ab";
    String endWord = "cd";
    List<String> wordList = List.of("ad", "cb", "cd");
    List<List<String>> actualAnswer = solution.findLadders(beginWord, endWord, wordList);

    assertThat(actualAnswer).isNotNull().hasSize(2)
        .contains(List.of("ab", "cb", "cd"), List.of("ab", "ad", "cd"));
  }

  @Test
  void test04() {
    WordLadderII solution = new WordLadderII();

    String beginWord = "hit";
    String endWord = "cog";
    List<String> wordList = List.of("hot", "dot", "dog", "lot", "log", "cog");
    List<List<String>> actualAnswer = solution.findLadders(beginWord, endWord, wordList);

    assertThat(actualAnswer).isNotNull().hasSize(2)
        .contains(List.of("hit", "hot", "dot", "dog", "cog"), List.of("hit", "hot", "lot", "log", "cog"));
  }

  @Test
  void test05() {
    WordLadderII solution = new WordLadderII();

    String beginWord = "hit";
    String endWord = "cog";
    List<String> wordList = List.of("hot", "dot", "dog", "lot", "log");
    List<List<String>> actualAnswer = solution.findLadders(beginWord, endWord, wordList);

    assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test06() {
    WordLadderII solution = new WordLadderII();

    String beginWord = "a";
    String endWord = "b";
    List<String> wordList = List.of("b", "c", "d");
    List<List<String>> actualAnswer = solution.findLadders(beginWord, endWord, wordList);

    assertThat(actualAnswer).isNotNull().hasSize(1).contains(List.of("a", "b"));
  }

  @Test
  void test07() {
    WordLadderII solution = new WordLadderII();

    String beginWord = "qa";
    String endWord = "sq";
    List<String> wordList = List.of(
        "si", "go", "se", "cm", "so", "ph", "mt", "db", "mb", "sb", "kr", "ln", "tm", "le", "av",
        "sm", "ar", "ci", "ca", "br", "ti", "ba", "to", "ra", "fa", "yo", "ow", "sn", "ya", "cr", "po",
        "fe", "ho", "ma", "re", "or", "rn", "au", "ur", "rh", "sr", "tc", "lt", "lo", "as", "fr", "nb",
        "yb", "if", "pb", "ge", "th", "pm", "rb", "sh", "co", "ga", "li", "ha", "hz", "no", "bi", "di",
        "hi", "qa", "pi", "os", "uh", "wm", "an", "me", "mo", "na", "la", "st", "er", "sc", "ne", "mn",
        "mi", "am", "ex", "pt", "io", "be", "fm", "ta", "tb", "ni", "mr", "pa", "he", "lr", "sq", "ye");
    List<List<String>> actualAnswer = solution.findLadders(beginWord, endWord, wordList);

    assertThat(actualAnswer).isNotNull().isNotEmpty()
        .contains(
            List.of("qa", "ba", "be", "se", "sq"), List.of("qa", "ba", "bi", "si", "sq"), List.of("qa", "ba", "br", "sr", "sq"),
            List.of("qa", "ca", "cm", "sm", "sq"), List.of("qa", "ca", "co", "so", "sq"), List.of("qa", "la", "ln", "sn", "sq"),
            List.of("qa", "la", "lt", "st", "sq"), List.of("qa", "ma", "mb", "sb", "sq"), List.of("qa", "pa", "ph", "sh", "sq"),
            List.of("qa", "ta", "tc", "sc", "sq"), List.of("qa", "fa", "fe", "se", "sq"), List.of("qa", "ga", "ge", "se", "sq"),
            List.of("qa", "ha", "he", "se", "sq"), List.of("qa", "la", "le", "se", "sq"), List.of("qa", "ma", "me", "se", "sq"),
            List.of("qa", "na", "ne", "se", "sq"), List.of("qa", "ra", "re", "se", "sq"), List.of("qa", "ya", "ye", "se", "sq"),
            List.of("qa", "ca", "ci", "si", "sq"), List.of("qa", "ha", "hi", "si", "sq"), List.of("qa", "la", "li", "si", "sq"),
            List.of("qa", "ma", "mi", "si", "sq"), List.of("qa", "na", "ni", "si", "sq"), List.of("qa", "pa", "pi", "si", "sq"),
            List.of("qa", "ta", "ti", "si", "sq"), List.of("qa", "ca", "cr", "sr", "sq"), List.of("qa", "fa", "fr", "sr", "sq"),
            List.of("qa", "la", "lr", "sr", "sq"), List.of("qa", "ma", "mr", "sr", "sq"), List.of("qa", "fa", "fm", "sm", "sq"),
            List.of("qa", "pa", "pm", "sm", "sq"), List.of("qa", "ta", "tm", "sm", "sq"), List.of("qa", "ga", "go", "so", "sq"),
            List.of("qa", "ha", "ho", "so", "sq"), List.of("qa", "la", "lo", "so", "sq"), List.of("qa", "ma", "mo", "so", "sq"),
            List.of("qa", "na", "no", "so", "sq")
        );
  }

  @Test
  void test08() {
    WordLadderII solution = new WordLadderII();

    String beginWord = "aaaaa";
    String endWord = "ggggg";
    List<String> wordList = List.of(
        "aaaaa", "caaaa", "cbaaa", "daaaa", "dbaaa", "eaaaa", "ebaaa", "faaaa",
        "fbaaa", "gaaaa", "gbaaa", "haaaa", "hbaaa", "iaaaa", "ibaaa", "jaaaa", "jbaaa",
        "kaaaa", "kbaaa", "laaaa", "lbaaa", "maaaa", "mbaaa", "naaaa", "nbaaa", "oaaaa",
        "obaaa", "paaaa", "pbaaa", "bbaaa", "bbcaa", "bbcba", "bbdaa", "bbdba", "bbeaa",
        "bbeba", "bbfaa", "bbfba", "bbgaa", "bbgba", "bbhaa", "bbhba", "bbiaa", "bbiba",
        "bbjaa", "bbjba", "bbkaa", "bbkba", "bblaa", "bblba", "bbmaa", "bbmba", "bbnaa",
        "bbnba", "bboaa", "bboba", "bbpaa", "bbpba", "bbbba", "abbba", "acbba", "dbbba",
        "dcbba", "ebbba", "ecbba", "fbbba", "fcbba", "gbbba", "gcbba", "hbbba", "hcbba",
        "ibbba", "icbba", "jbbba", "jcbba", "kbbba", "kcbba", "lbbba", "lcbba", "mbbba",
        "mcbba", "nbbba", "ncbba", "obbba", "ocbba", "pbbba", "pcbba", "ccbba", "ccaba",
        "ccaca", "ccdba", "ccdca", "cceba", "cceca", "ccfba", "ccfca", "ccgba", "ccgca",
        "cchba", "cchca", "cciba", "ccica", "ccjba", "ccjca", "cckba", "cckca", "cclba",
        "cclca", "ccmba", "ccmca", "ccnba", "ccnca", "ccoba", "ccoca", "ccpba", "ccpca",
        "cccca", "accca", "adcca", "bccca", "bdcca", "eccca", "edcca", "fccca", "fdcca",
        "gccca", "gdcca", "hccca", "hdcca", "iccca", "idcca", "jccca", "jdcca", "kccca",
        "kdcca", "lccca", "ldcca", "mccca", "mdcca", "nccca", "ndcca", "occca", "odcca",
        "pccca", "pdcca", "ddcca", "ddaca", "ddada", "ddbca", "ddbda", "ddeca", "ddeda",
        "ddfca", "ddfda", "ddgca", "ddgda", "ddhca", "ddhda", "ddica", "ddida", "ddjca",
        "ddjda", "ddkca", "ddkda", "ddlca", "ddlda", "ddmca", "ddmda", "ddnca", "ddnda",
        "ddoca", "ddoda", "ddpca", "ddpda", "dddda", "addda", "aedda", "bddda", "bedda",
        "cddda", "cedda", "fddda", "fedda", "gddda", "gedda", "hddda", "hedda", "iddda",
        "iedda", "jddda", "jedda", "kddda", "kedda", "lddda", "ledda", "mddda", "medda",
        "nddda", "nedda", "oddda", "oedda", "pddda", "pedda", "eedda", "eeada", "eeaea",
        "eebda", "eebea", "eecda", "eecea", "eefda", "eefea", "eegda", "eegea", "eehda",
        "eehea", "eeida", "eeiea", "eejda", "eejea", "eekda", "eekea", "eelda", "eelea",
        "eemda", "eemea", "eenda", "eenea", "eeoda", "eeoea", "eepda", "eepea", "eeeea",
        "ggggg", "agggg", "ahggg", "bgggg", "bhggg", "cgggg", "chggg", "dgggg", "dhggg",
        "egggg", "ehggg", "fgggg", "fhggg", "igggg", "ihggg", "jgggg", "jhggg", "kgggg",
        "khggg", "lgggg", "lhggg", "mgggg", "mhggg", "ngggg", "nhggg", "ogggg", "ohggg",
        "pgggg", "phggg", "hhggg", "hhagg", "hhahg", "hhbgg", "hhbhg", "hhcgg", "hhchg",
        "hhdgg", "hhdhg", "hhegg", "hhehg", "hhfgg", "hhfhg", "hhigg", "hhihg", "hhjgg",
        "hhjhg", "hhkgg", "hhkhg", "hhlgg", "hhlhg", "hhmgg", "hhmhg", "hhngg", "hhnhg",
        "hhogg", "hhohg", "hhpgg", "hhphg", "hhhhg", "ahhhg", "aihhg", "bhhhg", "bihhg",
        "chhhg", "cihhg", "dhhhg", "dihhg", "ehhhg", "eihhg", "fhhhg", "fihhg", "ghhhg",
        "gihhg", "jhhhg", "jihhg", "khhhg", "kihhg", "lhhhg", "lihhg", "mhhhg", "mihhg",
        "nhhhg", "nihhg", "ohhhg", "oihhg", "phhhg", "pihhg", "iihhg", "iiahg", "iiaig",
        "iibhg", "iibig", "iichg", "iicig", "iidhg", "iidig", "iiehg", "iieig", "iifhg",
        "iifig", "iighg", "iigig", "iijhg", "iijig", "iikhg", "iikig", "iilhg", "iilig",
        "iimhg", "iimig", "iinhg", "iinig", "iiohg", "iioig", "iiphg", "iipig", "iiiig",
        "aiiig", "ajiig", "biiig", "bjiig", "ciiig", "cjiig", "diiig", "djiig", "eiiig",
        "ejiig", "fiiig", "fjiig", "giiig", "gjiig", "hiiig", "hjiig", "kiiig", "kjiig",
        "liiig", "ljiig", "miiig", "mjiig", "niiig", "njiig", "oiiig", "ojiig", "piiig",
        "pjiig", "jjiig", "jjaig", "jjajg", "jjbig", "jjbjg", "jjcig", "jjcjg", "jjdig",
        "jjdjg", "jjeig", "jjejg", "jjfig", "jjfjg", "jjgig", "jjgjg", "jjhig", "jjhjg",
        "jjkig", "jjkjg", "jjlig", "jjljg", "jjmig", "jjmjg", "jjnig", "jjnjg", "jjoig",
        "jjojg", "jjpig", "jjpjg", "jjjjg", "ajjjg", "akjjg", "bjjjg", "bkjjg", "cjjjg",
        "ckjjg", "djjjg", "dkjjg", "ejjjg", "ekjjg", "fjjjg", "fkjjg", "gjjjg", "gkjjg",
        "hjjjg", "hkjjg", "ijjjg", "ikjjg", "ljjjg", "lkjjg", "mjjjg", "mkjjg", "njjjg",
        "nkjjg", "ojjjg", "okjjg", "pjjjg", "pkjjg", "kkjjg", "kkajg", "kkakg", "kkbjg",
        "kkbkg", "kkcjg", "kkckg", "kkdjg", "kkdkg", "kkejg", "kkekg", "kkfjg", "kkfkg",
        "kkgjg", "kkgkg", "kkhjg", "kkhkg", "kkijg", "kkikg", "kkljg", "kklkg", "kkmjg",
        "kkmkg", "kknjg", "kknkg", "kkojg", "kkokg", "kkpjg", "kkpkg", "kkkkg", "ggggx",
        "gggxx", "ggxxx", "gxxxx", "xxxxx", "xxxxy", "xxxyy", "xxyyy", "xyyyy", "yyyyy",
        "yyyyw", "yyyww", "yywww", "ywwww", "wwwww", "wwvww", "wvvww", "vvvww", "vvvwz",
        "avvwz", "aavwz", "aaawz", "aaaaz");
    List<List<String>> actualAnswer = solution.findLadders(beginWord, endWord, wordList);

    assertThat(actualAnswer).isNotNull().isNotEmpty()
        .contains(List.of("aaaaa", "aaaaz", "aaawz", "aavwz", "avvwz",
            "vvvwz", "vvvww", "wvvww", "wwvww", "wwwww", "ywwww", "yywww", "yyyww",
            "yyyyw", "yyyyy", "xyyyy", "xxyyy", "xxxyy", "xxxxy", "xxxxx", "gxxxx",
            "ggxxx", "gggxx", "ggggx", "ggggg"));
  }

}