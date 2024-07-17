package br.com.emendes.problems;

/**
 * Dado duas strings version1 e version2, compare eles. Uma versão como string consiste de revisões separadas por
 * pontos '.'. O valor da revisão é uma conversão inteira ignorando zeros a esquerda.<br>
 * <br>
 * Para comparar version strings, compare os valores de revisão da esquerda para a direita.
 * Se uma das strings de versão tiver menos revisões, trate os valores de revisão ausentes como 0.<br>
 * <br>
 * Retorne o seguinte:
 * <ul>
 *   <li>Se version1 < version2, retorne -1</li>
 *   <li>Se version1 > version2, retorne 1</li>
 *   <li>Caso contrário, retorne zero.</li>
 * </ul>
 * Restrições:
 * <ul>
 *   <li>1 <= version1.length, version2.length <= 500</li>
 *   <li>version1 e version2 contém apenas digitos e '.'.</li>
 *   <li>version1 e version2 são números de versão válidos.</li>
 *   <li>Todos os números de revisão em version1 e version2 podem ser armazenados em inteiros 32-bits.</li>
 * </ul>
 */
public class CompareVersionNumbers {

  int i;
  int j;
  String version1;
  String version2;

  private int nextRevision1() {
    if (i >= version1.length()) return 0;
    int start = i;
    while (i < version1.length() && version1.charAt(i) != '.') i++;

    return Integer.parseInt(version1.substring(start, i++));
  }

  private int nextRevision2() {
    if (j >= version2.length()) return 0;
    int start = j;
    while (j < version2.length() && version2.charAt(j) != '.') j++;

    return Integer.parseInt(version2.substring(start, j++));
  }

  public int secondSolution(String version1, String version2) {
    i = 0;
    j = 0;
    this.version1 = version1;
    this.version2 = version2;

    while (i < version1.length() || j < version2.length()) {
      int rev1 = nextRevision1();
      int rev2 = nextRevision2();
      if (rev1 == rev2) continue;
      return Integer.compare(rev1, rev2);
    }

    return 0;
  }

  /**
   * First solution.
   */
  public int compareVersion(String version1, String version2) {
    String[] revisions1 = version1.split("\\.");
    String[] revisions2 = version2.split("\\.");
    int length = Math.max(version1.length(), version2.length());
    for (int i = 0; i < length; i++) {
      int revision1 = i < revisions1.length ? Integer.parseInt(revisions1[i]) : 0;
      int revision2 = i < revisions2.length ? Integer.parseInt(revisions2[i]) : 0;
      int compare = Integer.compare(revision1, revision2);
      if (compare != 0) return compare;
    }

    return 0;
  }

}
