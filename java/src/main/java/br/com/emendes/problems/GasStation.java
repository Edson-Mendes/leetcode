package br.com.emendes.problems;

/**
 * Existem n postos de gasolina ao longo de uma rota circular, onde a quantidade de gasolina na i-ésima estação é gás[i].<br>
 * <br>
 * Você tem um carro com tanque de gasolina ilimitado e custa cost[i] de gasolina para viajar
 * do i-ésimo posto até o próximo (i + 1)-ésimo posto. Você começa a viagem com o tanque vazio em um dos postos de gasolina.<br>
 * <br>
 * Dado dois arrays de inteiros gas e cost, retorne o índice do posto de gasolina inicial
 * se você puder percorrer o circuito uma vez no sentido horário, caso contrário retorne -1.
 * Se existir uma solução, é garantido que ela seja única.<br>
 * <br>
 * Restrições:
 * <ul>
 *   <li>n == gas.length == cost.length</li>
 *   <li>1 <= n <= 10⁵</li>
 *   <li>0 <= gas[i], cost[i] <= 10⁴</li>
 * </ul>
 */
public class GasStation {

  private int length;
  private int[] diff;

  public int canCompleteCircuit(int[] gas, int[] cost) {
    if (gas.length == 1) {
      return gas[0] - cost[0] >= 0 ? 0 : -1;
    }
    length = gas.length;
    diff = new int[length];
    if (!isPossibleCompleteCircuit(gas, cost)) return -1;

    if (diff[0] >= 0 && diff[length - 1] <= 0 && isGoodStart(0)) {
      return 0;
    }
    int i = 1;
    while (i < length) {
      if (diff[i] >= 0 && diff[i - 1] < 0 && isGoodStart(i)) {
        return i;
      }
      i++;
    }
    return -1;
  }

  private boolean isGoodStart(int index) {
    int visited = 1;
    int tank = diff[index];
    index = index + 1 == length ? 0 : index + 1;

    while (tank >= 0 && visited < length) {
      tank += diff[index];
      index = index + 1 == length ? 0 : index + 1;
      visited++;
    }
    return visited == length;
  }

  private boolean isPossibleCompleteCircuit(int[] gas, int[] cost) {
    int remainderGas = 0;
    for (int i = 0; i < length; i++) {
      diff[i] = gas[i] - cost[i];
      remainderGas += diff[i];
    }

    return remainderGas >= 0;
  }

}
