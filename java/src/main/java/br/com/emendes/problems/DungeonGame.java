package br.com.emendes.problems;

/**
 * Os demônios capturaram a princesa e a aprisionaram no canto inferior direito de uma masmorra.
 * A masmorra consiste em m x n salas dispostas em uma grade 2D.
 * Nosso valente cavaleiro foi inicialmente posicionado na sala superior esquerda e deve abrir caminho
 * pela masmorra para resgatar a princesa.<br>
 * <br>
 * O cavaleiro possui um ponto de saúde inicial representado por um número inteiro positivo.
 * Se a qualquer momento seu ponto de saúde cair para 0 ou menos, ele morre imediatamente.<br>
 * <br>
 * Algumas das salas são guardadas por demônios (representados por números inteiros negativos),
 * então o cavaleiro perde saúde ao entrar nessas salas; outras salas estão vazias (representadas como 0) ou
 * contêm orbes mágicos que aumentam a saúde do cavaleiro (representadas por números inteiros positivos).<br>
 * <br>
 * Para alcançar a princesa o mais rápido possível, o cavaleiro decide mover-se apenas para a direita ou
 * para baixo em cada passo.<br>
 * Devolva a saúde inicial mínima do cavaleiro para que ele possa resgatar a princesa.<br>
 * <br>
 * Observe que qualquer sala pode conter ameaças ou power-ups, até mesmo a primeira sala em que o cavaleiro entra e
 * a sala inferior direita onde a princesa está aprisionada.<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>m == dungeon.length</li>
 *   <li>n == dungeon[i].length</li>
 *   <li>1 <= m, n <= 200</li>
 *   <li>-1000 <= dungeon[i][j] <= 1000</li>
 * </ul>
 */
public class DungeonGame {

  private int m;
  private int n;
  private int[][] dungeon;
  private int[][] minimumHP;

  public int calculateMinimumHP(int[][] dungeon) {
    m = dungeon.length;
    n = dungeon[0].length;
    this.dungeon = dungeon;
    this.minimumHP = new int[m][n];

    minimumHP[m - 1][n - 1] = 1;
    if (dungeon[m - 1][n - 1] < 0) {
      minimumHP[m - 1][n - 1] += (dungeon[m - 1][n - 1] * -1);
    }
    fillLastLine();
    fillLastColumn();

    return getMinimumHP(0, 0);
  }

  private int getMinimumHP(int i, int j) {
    if (minimumHP[i][j] == 0) {
      int right = calculateHP(getMinimumHP(i, j + 1), dungeon[i][j]);
      int bottom = calculateHP(getMinimumHP(i + 1, j), dungeon[i][j]);
      minimumHP[i][j] = Math.min(right, bottom);
    }

    return minimumHP[i][j];
  }

  private int calculateHP(int nextHP, int damage) {
    if (damage <= 0) {
      return nextHP + (damage * -1);
    }
    int hp = nextHP - damage;
    return hp <= 0 ? 1 : hp;
  }

  private void fillLastLine() {
    int i = m - 1;
    for (int j = n - 2; j >= 0; j--) {
      if (dungeon[i][j] <= 0) {
        minimumHP[i][j] += (dungeon[i][j] * -1) + minimumHP[i][j + 1];
      } else {
        minimumHP[i][j] = minimumHP[i][j + 1] - dungeon[i][j];
        if (minimumHP[i][j] <= 0) minimumHP[i][j] = 1;
      }
    }
  }

  private void fillLastColumn() {
    int j = n - 1;
    for (int i = m - 2; i >= 0; i--) {
      if (dungeon[i][j] <= 0) {
        minimumHP[i][j] += (dungeon[i][j] * -1) + minimumHP[i + 1][j];
      } else {
        minimumHP[i][j] = minimumHP[i + 1][j] - dungeon[i][j];
        if (minimumHP[i][j] <= 0) minimumHP[i][j] = 1;
      }
    }
  }

}
