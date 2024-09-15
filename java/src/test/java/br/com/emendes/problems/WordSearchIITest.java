package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class WordSearchIITest {

  @Test
  void test01() {
    WordSearchII solution = new WordSearchII();

    char[][] board = {
        {'a'}
    };
    String[] words = {"a", "b", "c", "d"};
    List<String> actualAnswer = solution.findWords(board, words);

    assertThat(actualAnswer).isNotNull().hasSize(1).contains("a");
  }

  @Test
  void test02() {
    WordSearchII solution = new WordSearchII();

    char[][] board = {
        {'o', 'a', 'a', 'n'},
        {'e', 't', 'a', 'e'},
        {'i', 'h', 'k', 'r'},
        {'i', 'f', 'l', 'v'}
    };
    String[] words = {"oath", "pea", "eat", "rain"};
    List<String> actualAnswer = solution.findWords(board, words);

    assertThat(actualAnswer).isNotNull().hasSize(2).contains("eat", "oath");
  }

  @Test
  void test03() {
    WordSearchII solution = new WordSearchII();

    char[][] board = {
        {'a', 'b'},
        {'c', 'd'}
    };
    String[] words = {"abcb"};
    List<String> actualAnswer = solution.findWords(board, words);

    assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test04() {
    WordSearchII solution = new WordSearchII();

    char[][] board = {
        {'o', 'a', 'a', 'n'},
        {'e', 't', 'a', 'e'},
        {'i', 'h', 'k', 'r'},
        {'i', 'f', 'l', 'v'}
    };
    String[] words = {"oath", "pea", "eat", "rain", "oate", "oata"};
    List<String> actualAnswer = solution.findWords(board, words);

    assertThat(actualAnswer).isNotNull().hasSize(4).contains("eat", "oath", "oate", "oata");
  }

  @Test
  void test05() {
    WordSearchII solution = new WordSearchII();

    char[][] board = {
        {'a', 'b'},
        {'c', 'd'}
    };
    String[] words = {"abcb", "acdb"};
    List<String> actualAnswer = solution.findWords(board, words);

    assertThat(actualAnswer).isNotNull().hasSize(1).contains("acdb");
  }

  @Test
  void test06() {
    WordSearchII solution = new WordSearchII();

    char[][] board = {
        {'m', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l'},
        {'n', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
        {'o', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
        {'p', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
        {'q', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
        {'r', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
        {'s', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
        {'t', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
        {'u', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
        {'v', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
        {'w', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
        {'x', 'y', 'z', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'}
    };
    String[] words = {"aaaaaaaaaa", "baaaaaaaaa", "caaaaaaaaa", "daaaaaaaaa", "eaaaaaaaaa", "faaaaaaaaa",
        "gaaaaaaaaa", "haaaaaaaaa", "iaaaaaaaaa", "jaaaaaaaaa", "kaaaaaaaaa", "laaaaaaaaa", "maaaaaaaaa",
        "naaaaaaaaa", "oaaaaaaaaa", "paaaaaaaaa", "qaaaaaaaaa", "raaaaaaaaa", "saaaaaaaaa", "taaaaaaaaa",
        "uaaaaaaaaa", "vaaaaaaaaa", "waaaaaaaaa", "xaaaaaaaaa", "yaaaaaaaaa", "zaaaaaaaaa", "abaaaaaaaa",
        "bbaaaaaaaa", "cbaaaaaaaa", "dbaaaaaaaa", "ebaaaaaaaa", "fbaaaaaaaa", "gbaaaaaaaa", "hbaaaaaaaa",
        "ibaaaaaaaa", "jbaaaaaaaa", "kbaaaaaaaa", "lbaaaaaaaa", "mbaaaaaaaa", "nbaaaaaaaa", "obaaaaaaaa",
        "pbaaaaaaaa", "qbaaaaaaaa", "rbaaaaaaaa", "sbaaaaaaaa", "tbaaaaaaaa", "ubaaaaaaaa", "vbaaaaaaaa",
        "wbaaaaaaaa", "xbaaaaaaaa", "ybaaaaaaaa", "zbaaaaaaaa", "acaaaaaaaa", "bcaaaaaaaa", "ccaaaaaaaa",
        "dcaaaaaaaa", "ecaaaaaaaa", "fcaaaaaaaa", "gcaaaaaaaa", "hcaaaaaaaa", "icaaaaaaaa", "jcaaaaaaaa",
        "kcaaaaaaaa", "lcaaaaaaaa", "mcaaaaaaaa", "ncaaaaaaaa", "ocaaaaaaaa", "pcaaaaaaaa", "qcaaaaaaaa",
        "rcaaaaaaaa", "scaaaaaaaa", "tcaaaaaaaa", "ucaaaaaaaa", "vcaaaaaaaa", "wcaaaaaaaa", "xcaaaaaaaa",
        "ycaaaaaaaa", "zcaaaaaaaa", "adaaaaaaaa", "bdaaaaaaaa", "cdaaaaaaaa", "ddaaaaaaaa", "edaaaaaaaa",
        "fdaaaaaaaa", "gdaaaaaaaa", "hdaaaaaaaa", "idaaaaaaaa", "jdaaaaaaaa", "kdaaaaaaaa", "ldaaaaaaaa",
        "mdaaaaaaaa", "ndaaaaaaaa", "odaaaaaaaa", "pdaaaaaaaa", "qdaaaaaaaa", "rdaaaaaaaa", "sdaaaaaaaa",
        "tdaaaaaaaa", "udaaaaaaaa", "vdaaaaaaaa", "wdaaaaaaaa", "xdaaaaaaaa", "ydaaaaaaaa", "zdaaaaaaaa",
        "aeaaaaaaaa", "beaaaaaaaa", "ceaaaaaaaa", "deaaaaaaaa", "eeaaaaaaaa", "feaaaaaaaa", "geaaaaaaaa",
        "heaaaaaaaa", "ieaaaaaaaa", "jeaaaaaaaa", "keaaaaaaaa", "leaaaaaaaa", "meaaaaaaaa", "neaaaaaaaa",
        "oeaaaaaaaa", "peaaaaaaaa", "qeaaaaaaaa", "reaaaaaaaa", "seaaaaaaaa", "teaaaaaaaa", "ueaaaaaaaa",
        "veaaaaaaaa", "weaaaaaaaa", "xeaaaaaaaa", "yeaaaaaaaa", "zeaaaaaaaa", "afaaaaaaaa", "bfaaaaaaaa",
        "cfaaaaaaaa", "dfaaaaaaaa", "efaaaaaaaa", "ffaaaaaaaa", "gfaaaaaaaa", "hfaaaaaaaa", "ifaaaaaaaa",
        "jfaaaaaaaa", "kfaaaaaaaa", "lfaaaaaaaa", "mfaaaaaaaa", "nfaaaaaaaa", "ofaaaaaaaa", "pfaaaaaaaa",
        "qfaaaaaaaa", "rfaaaaaaaa", "sfaaaaaaaa", "tfaaaaaaaa", "ufaaaaaaaa", "vfaaaaaaaa", "wfaaaaaaaa",
        "xfaaaaaaaa", "yfaaaaaaaa", "zfaaaaaaaa", "agaaaaaaaa", "bgaaaaaaaa", "cgaaaaaaaa", "dgaaaaaaaa",
        "egaaaaaaaa", "fgaaaaaaaa", "ggaaaaaaaa", "hgaaaaaaaa", "igaaaaaaaa", "jgaaaaaaaa", "kgaaaaaaaa",
        "lgaaaaaaaa", "mgaaaaaaaa", "ngaaaaaaaa", "ogaaaaaaaa", "pgaaaaaaaa", "qgaaaaaaaa", "rgaaaaaaaa",
        "sgaaaaaaaa", "tgaaaaaaaa", "ugaaaaaaaa", "vgaaaaaaaa", "wgaaaaaaaa", "xgaaaaaaaa", "ygaaaaaaaa",
        "zgaaaaaaaa", "ahaaaaaaaa", "bhaaaaaaaa", "chaaaaaaaa", "dhaaaaaaaa", "ehaaaaaaaa", "fhaaaaaaaa",
        "ghaaaaaaaa", "hhaaaaaaaa", "ihaaaaaaaa", "jhaaaaaaaa", "khaaaaaaaa", "lhaaaaaaaa", "mhaaaaaaaa",
        "nhaaaaaaaa", "ohaaaaaaaa", "phaaaaaaaa", "qhaaaaaaaa", "rhaaaaaaaa", "shaaaaaaaa", "thaaaaaaaa",
        "uhaaaaaaaa", "vhaaaaaaaa", "whaaaaaaaa", "xhaaaaaaaa", "yhaaaaaaaa", "zhaaaaaaaa", "aiaaaaaaaa",
        "biaaaaaaaa", "ciaaaaaaaa", "diaaaaaaaa", "eiaaaaaaaa", "fiaaaaaaaa", "giaaaaaaaa", "hiaaaaaaaa",
        "iiaaaaaaaa", "jiaaaaaaaa", "kiaaaaaaaa", "liaaaaaaaa", "miaaaaaaaa", "niaaaaaaaa", "oiaaaaaaaa",
        "piaaaaaaaa", "qiaaaaaaaa", "riaaaaaaaa", "siaaaaaaaa", "tiaaaaaaaa", "uiaaaaaaaa", "viaaaaaaaa",
        "wiaaaaaaaa", "xiaaaaaaaa", "yiaaaaaaaa", "ziaaaaaaaa", "ajaaaaaaaa", "bjaaaaaaaa", "cjaaaaaaaa",
        "djaaaaaaaa", "ejaaaaaaaa", "fjaaaaaaaa", "gjaaaaaaaa", "hjaaaaaaaa", "ijaaaaaaaa", "jjaaaaaaaa",
        "kjaaaaaaaa", "ljaaaaaaaa", "mjaaaaaaaa", "njaaaaaaaa", "ojaaaaaaaa", "pjaaaaaaaa", "qjaaaaaaaa",
        "rjaaaaaaaa", "sjaaaaaaaa", "tjaaaaaaaa", "ujaaaaaaaa", "vjaaaaaaaa", "wjaaaaaaaa", "xjaaaaaaaa",
        "yjaaaaaaaa", "zjaaaaaaaa", "akaaaaaaaa", "bkaaaaaaaa", "ckaaaaaaaa", "dkaaaaaaaa", "ekaaaaaaaa",
        "fkaaaaaaaa", "gkaaaaaaaa", "hkaaaaaaaa", "ikaaaaaaaa", "jkaaaaaaaa", "kkaaaaaaaa", "lkaaaaaaaa",
        "mkaaaaaaaa", "nkaaaaaaaa", "okaaaaaaaa", "pkaaaaaaaa", "qkaaaaaaaa", "rkaaaaaaaa", "skaaaaaaaa",
        "tkaaaaaaaa", "ukaaaaaaaa", "vkaaaaaaaa", "wkaaaaaaaa", "xkaaaaaaaa", "ykaaaaaaaa", "zkaaaaaaaa",
        "alaaaaaaaa", "blaaaaaaaa", "claaaaaaaa", "dlaaaaaaaa", "elaaaaaaaa", "flaaaaaaaa", "glaaaaaaaa",
        "hlaaaaaaaa", "ilaaaaaaaa", "jlaaaaaaaa", "klaaaaaaaa", "llaaaaaaaa", "mlaaaaaaaa", "nlaaaaaaaa",
        "olaaaaaaaa", "plaaaaaaaa", "qlaaaaaaaa", "rlaaaaaaaa", "slaaaaaaaa", "tlaaaaaaaa", "ulaaaaaaaa",
        "vlaaaaaaaa", "wlaaaaaaaa", "xlaaaaaaaa", "ylaaaaaaaa", "zlaaaaaaaa", "amaaaaaaaa", "bmaaaaaaaa",
        "cmaaaaaaaa", "dmaaaaaaaa", "emaaaaaaaa", "fmaaaaaaaa", "gmaaaaaaaa", "hmaaaaaaaa", "imaaaaaaaa",
        "jmaaaaaaaa", "kmaaaaaaaa", "lmaaaaaaaa", "mmaaaaaaaa", "nmaaaaaaaa", "omaaaaaaaa", "pmaaaaaaaa",
        "qmaaaaaaaa", "rmaaaaaaaa", "smaaaaaaaa", "tmaaaaaaaa", "umaaaaaaaa", "vmaaaaaaaa", "wmaaaaaaaa",
        "xmaaaaaaaa", "ymaaaaaaaa", "zmaaaaaaaa", "anaaaaaaaa", "bnaaaaaaaa", "cnaaaaaaaa", "dnaaaaaaaa",
        "enaaaaaaaa", "fnaaaaaaaa", "gnaaaaaaaa", "hnaaaaaaaa", "inaaaaaaaa", "jnaaaaaaaa", "knaaaaaaaa",
        "lnaaaaaaaa", "mnaaaaaaaa", "nnaaaaaaaa", "onaaaaaaaa", "pnaaaaaaaa", "qnaaaaaaaa", "rnaaaaaaaa",
        "snaaaaaaaa", "tnaaaaaaaa", "unaaaaaaaa", "vnaaaaaaaa", "wnaaaaaaaa", "xnaaaaaaaa", "ynaaaaaaaa",
        "znaaaaaaaa", "aoaaaaaaaa", "boaaaaaaaa", "coaaaaaaaa", "doaaaaaaaa", "eoaaaaaaaa", "foaaaaaaaa",
        "goaaaaaaaa", "hoaaaaaaaa", "ioaaaaaaaa", "joaaaaaaaa", "koaaaaaaaa", "loaaaaaaaa", "moaaaaaaaa",
        "noaaaaaaaa", "ooaaaaaaaa", "poaaaaaaaa", "qoaaaaaaaa", "roaaaaaaaa", "soaaaaaaaa", "toaaaaaaaa",
        "uoaaaaaaaa", "voaaaaaaaa", "woaaaaaaaa", "xoaaaaaaaa", "yoaaaaaaaa", "zoaaaaaaaa", "apaaaaaaaa",
        "bpaaaaaaaa", "cpaaaaaaaa", "dpaaaaaaaa", "epaaaaaaaa", "fpaaaaaaaa", "gpaaaaaaaa", "hpaaaaaaaa",
        "ipaaaaaaaa", "jpaaaaaaaa", "kpaaaaaaaa", "lpaaaaaaaa", "mpaaaaaaaa", "npaaaaaaaa", "opaaaaaaaa",
        "ppaaaaaaaa", "qpaaaaaaaa", "rpaaaaaaaa", "spaaaaaaaa", "tpaaaaaaaa", "upaaaaaaaa", "vpaaaaaaaa",
        "wpaaaaaaaa", "xpaaaaaaaa", "ypaaaaaaaa", "zpaaaaaaaa", "aqaaaaaaaa", "bqaaaaaaaa", "cqaaaaaaaa",
        "dqaaaaaaaa", "eqaaaaaaaa", "fqaaaaaaaa", "gqaaaaaaaa", "hqaaaaaaaa", "iqaaaaaaaa", "jqaaaaaaaa",
        "kqaaaaaaaa", "lqaaaaaaaa", "mqaaaaaaaa", "nqaaaaaaaa", "oqaaaaaaaa", "pqaaaaaaaa", "qqaaaaaaaa",
        "rqaaaaaaaa", "sqaaaaaaaa", "tqaaaaaaaa", "uqaaaaaaaa", "vqaaaaaaaa", "wqaaaaaaaa", "xqaaaaaaaa",
        "yqaaaaaaaa", "zqaaaaaaaa", "araaaaaaaa", "braaaaaaaa", "craaaaaaaa", "draaaaaaaa", "eraaaaaaaa",
        "fraaaaaaaa", "graaaaaaaa", "hraaaaaaaa", "iraaaaaaaa", "jraaaaaaaa", "kraaaaaaaa", "lraaaaaaaa",
        "mraaaaaaaa", "nraaaaaaaa", "oraaaaaaaa", "praaaaaaaa", "qraaaaaaaa", "rraaaaaaaa", "sraaaaaaaa",
        "traaaaaaaa", "uraaaaaaaa", "vraaaaaaaa", "wraaaaaaaa", "xraaaaaaaa", "yraaaaaaaa", "zraaaaaaaa",
        "asaaaaaaaa", "bsaaaaaaaa", "csaaaaaaaa", "dsaaaaaaaa", "esaaaaaaaa", "fsaaaaaaaa", "gsaaaaaaaa",
        "hsaaaaaaaa", "isaaaaaaaa", "jsaaaaaaaa", "ksaaaaaaaa", "lsaaaaaaaa", "msaaaaaaaa", "nsaaaaaaaa",
        "osaaaaaaaa", "psaaaaaaaa", "qsaaaaaaaa", "rsaaaaaaaa", "ssaaaaaaaa", "tsaaaaaaaa", "usaaaaaaaa",
        "vsaaaaaaaa", "wsaaaaaaaa", "xsaaaaaaaa", "ysaaaaaaaa", "zsaaaaaaaa", "ataaaaaaaa", "btaaaaaaaa",
        "ctaaaaaaaa", "dtaaaaaaaa", "etaaaaaaaa", "ftaaaaaaaa", "gtaaaaaaaa", "htaaaaaaaa", "itaaaaaaaa",
        "jtaaaaaaaa", "ktaaaaaaaa", "ltaaaaaaaa", "mtaaaaaaaa", "ntaaaaaaaa", "otaaaaaaaa", "ptaaaaaaaa",
        "qtaaaaaaaa", "rtaaaaaaaa", "staaaaaaaa", "ttaaaaaaaa", "utaaaaaaaa", "vtaaaaaaaa", "wtaaaaaaaa",
        "xtaaaaaaaa", "ytaaaaaaaa", "ztaaaaaaaa", "auaaaaaaaa", "buaaaaaaaa", "cuaaaaaaaa", "duaaaaaaaa",
        "euaaaaaaaa", "fuaaaaaaaa", "guaaaaaaaa", "huaaaaaaaa", "iuaaaaaaaa", "juaaaaaaaa", "kuaaaaaaaa",
        "luaaaaaaaa", "muaaaaaaaa", "nuaaaaaaaa", "ouaaaaaaaa", "puaaaaaaaa", "quaaaaaaaa", "ruaaaaaaaa",
        "suaaaaaaaa", "tuaaaaaaaa", "uuaaaaaaaa", "vuaaaaaaaa", "wuaaaaaaaa", "xuaaaaaaaa", "yuaaaaaaaa",
        "zuaaaaaaaa", "avaaaaaaaa", "bvaaaaaaaa", "cvaaaaaaaa", "dvaaaaaaaa", "evaaaaaaaa", "fvaaaaaaaa",
        "gvaaaaaaaa", "hvaaaaaaaa", "ivaaaaaaaa", "jvaaaaaaaa", "kvaaaaaaaa", "lvaaaaaaaa", "mvaaaaaaaa",
        "nvaaaaaaaa", "ovaaaaaaaa", "pvaaaaaaaa", "qvaaaaaaaa", "rvaaaaaaaa", "svaaaaaaaa", "tvaaaaaaaa",
        "uvaaaaaaaa", "vvaaaaaaaa", "wvaaaaaaaa", "xvaaaaaaaa", "yvaaaaaaaa", "zvaaaaaaaa", "awaaaaaaaa",
        "bwaaaaaaaa", "cwaaaaaaaa", "dwaaaaaaaa", "ewaaaaaaaa", "fwaaaaaaaa", "gwaaaaaaaa", "hwaaaaaaaa",
        "iwaaaaaaaa", "jwaaaaaaaa", "kwaaaaaaaa", "lwaaaaaaaa", "mwaaaaaaaa", "nwaaaaaaaa", "owaaaaaaaa",
        "pwaaaaaaaa", "qwaaaaaaaa", "rwaaaaaaaa", "swaaaaaaaa", "twaaaaaaaa", "uwaaaaaaaa", "vwaaaaaaaa",
        "wwaaaaaaaa", "xwaaaaaaaa", "ywaaaaaaaa", "zwaaaaaaaa", "axaaaaaaaa", "bxaaaaaaaa", "cxaaaaaaaa",
        "dxaaaaaaaa", "exaaaaaaaa", "fxaaaaaaaa", "gxaaaaaaaa", "hxaaaaaaaa", "ixaaaaaaaa", "jxaaaaaaaa",
        "kxaaaaaaaa", "lxaaaaaaaa", "mxaaaaaaaa", "nxaaaaaaaa", "oxaaaaaaaa", "pxaaaaaaaa", "qxaaaaaaaa",
        "rxaaaaaaaa", "sxaaaaaaaa", "txaaaaaaaa", "uxaaaaaaaa", "vxaaaaaaaa", "wxaaaaaaaa", "xxaaaaaaaa",
        "yxaaaaaaaa", "zxaaaaaaaa", "ayaaaaaaaa", "byaaaaaaaa", "cyaaaaaaaa", "dyaaaaaaaa", "eyaaaaaaaa",
        "fyaaaaaaaa", "gyaaaaaaaa", "hyaaaaaaaa", "iyaaaaaaaa", "jyaaaaaaaa", "kyaaaaaaaa", "lyaaaaaaaa",
        "myaaaaaaaa", "nyaaaaaaaa", "oyaaaaaaaa", "pyaaaaaaaa", "qyaaaaaaaa", "ryaaaaaaaa", "syaaaaaaaa",
        "tyaaaaaaaa", "uyaaaaaaaa", "vyaaaaaaaa", "wyaaaaaaaa", "xyaaaaaaaa", "yyaaaaaaaa", "zyaaaaaaaa",
        "azaaaaaaaa", "bzaaaaaaaa", "czaaaaaaaa", "dzaaaaaaaa", "ezaaaaaaaa", "fzaaaaaaaa", "gzaaaaaaaa",
        "hzaaaaaaaa", "izaaaaaaaa", "jzaaaaaaaa", "kzaaaaaaaa", "lzaaaaaaaa", "mzaaaaaaaa", "nzaaaaaaaa",
        "ozaaaaaaaa", "pzaaaaaaaa", "qzaaaaaaaa", "rzaaaaaaaa", "szaaaaaaaa", "tzaaaaaaaa", "uzaaaaaaaa",
        "vzaaaaaaaa", "wzaaaaaaaa", "xzaaaaaaaa", "yzaaaaaaaa", "zzaaaaaaaa"};
    List<String> actualAnswer = solution.findWords(board, words);

    assertThat(actualAnswer).isNotNull().hasSize(69).contains(
        "mbaaaaaaaa", "mnaaaaaaaa", "bcaaaaaaaa", "baaaaaaaaa", "cdaaaaaaaa", "caaaaaaaaa",
        "cbaaaaaaaa", "deaaaaaaaa", "daaaaaaaaa", "dcaaaaaaaa", "efaaaaaaaa", "eaaaaaaaaa", "edaaaaaaaa",
        "fgaaaaaaaa", "faaaaaaaaa", "feaaaaaaaa", "ghaaaaaaaa", "gaaaaaaaaa", "gfaaaaaaaa", "hiaaaaaaaa",
        "haaaaaaaaa", "hgaaaaaaaa", "ijaaaaaaaa", "iaaaaaaaaa", "ihaaaaaaaa", "jkaaaaaaaa", "jaaaaaaaaa",
        "jiaaaaaaaa", "klaaaaaaaa", "kaaaaaaaaa", "kjaaaaaaaa", "laaaaaaaaa", "lkaaaaaaaa", "naaaaaaaaa",
        "noaaaaaaaa", "aaaaaaaaaa", "onaaaaaaaa", "oaaaaaaaaa", "opaaaaaaaa", "poaaaaaaaa", "paaaaaaaaa",
        "pqaaaaaaaa", "qpaaaaaaaa", "qaaaaaaaaa", "qraaaaaaaa", "rqaaaaaaaa", "raaaaaaaaa", "rsaaaaaaaa",
        "sraaaaaaaa", "saaaaaaaaa", "staaaaaaaa", "tsaaaaaaaa", "taaaaaaaaa", "tuaaaaaaaa", "utaaaaaaaa",
        "uaaaaaaaaa", "uvaaaaaaaa", "vuaaaaaaaa", "vaaaaaaaaa", "vwaaaaaaaa", "wvaaaaaaaa", "waaaaaaaaa",
        "azaaaaaaaa", "xwaaaaaaaa", "xyaaaaaaaa", "yaaaaaaaaa", "yzaaaaaaaa", "zaaaaaaaaa", "zyaaaaaaaa");
  }

}