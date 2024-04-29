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

  public int canCompleteCircuit(int[] gas, int[] cost) {
    int length = gas.length;
    int remainderGas = 0;
    for (int i = 0; i < length; i++) {
      remainderGas += gas[i] - cost[i];
    }
    if (remainderGas < 0) return -1;

    int index = 0;
    int sum = 0;
    for (int i = 0; i < length; i++) {
      sum += gas[i] - cost[i];
      if (sum < 0) {
        sum = 0;
        index = i + 1;
      }
    }

    return index;
  }

}
