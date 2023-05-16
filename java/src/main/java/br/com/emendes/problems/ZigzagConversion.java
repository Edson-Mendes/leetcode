package br.com.emendes.problems;

/**
 * A string "PAYPALISHIRING" é escrita em zigzag pattern em um determinado número de linhas como este:
 * P   A   H   N
 * A P L S I I G
 * Y   i   R
 * E então leia linha por linha: "PAHNAPLSIIGYIR"
 * Escreva o código que pegará uma string e fará essa conversão dado um número de linhas.
 */
public class ZigzagConversion {

  // Boa solução, executou em 2ms.
  public String convert(String s, int numRows) {
    char[] sArray = s.toCharArray();
    int sLength = sArray.length;

    if (numRows == 1 || sLength <= numRows) return s;

    char[] answer = new char[sLength];

    int ci = 0;   // current index de sArray.
    int cr = 0;   // current row
    int ansIndex = 0;   // index do array de resposta.
    int constant = (numRows << 1) - 2;
    int doubleCR;

    while (ci < sLength) { // calcula todos os indices da primeira row.
      answer[ansIndex++] = sArray[ci];
      ci = constant + ci;
    }
    cr++;

    while (cr < numRows - 1) { //calcula da segunda row até a penúltima.
      ci = cr;
      doubleCR = cr << 1;
      while (ci < sLength) {
        answer[ansIndex++] = sArray[ci];
        ci = constant - doubleCR + ci;

        if (ci >= sLength) break; // Após o calculo do próximo index, se ci >= sLength, então saí do loop.

        answer[ansIndex++] = sArray[ci];
        ci = doubleCR + ci;
      }
      cr++;
    }

    ci = cr;
    doubleCR = cr << 1;
    while (ci < sLength) { // Calcula para a última row.
      answer[ansIndex++] = sArray[ci];
      ci = doubleCR + ci;
    }


    return String.valueOf(answer);
  }

}
