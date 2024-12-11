/**
 * Dado um array de strings words e uma largura maxWidth, formate o texto de modo que cada linha
 * tenha exatamente maxWidth caracteres e seja totalmente justificada (esquerda e direita).
 *
 * Você deve colocar suas palavras de forma gananciosa; ou seja,
 * colocar o máximo de palavras possível em cada linha. Insira espaços extras ' '
 * quando necessário para que cada linha tenha exatamente maxWidth caracteres.
 *
 * Espaços extras entre palavras devem ser distribuídos o mais uniformemente possível.
 * Se o número de espaços em uma linha não for dividido uniformemente entre as palavras,
 * os slots vazios à esquerda receberão mais espaços do que os slots à direita.
 *
 * A última linha do texto deve ser justificada à esquerda e
 * nenhum espaço extra deve ser inserido entre as palavras.
 *
 * Nota:
 *
 * Uma palavra é definida como uma sequência de caracteres que consiste apenas de caracteres sem espaços.
 *
 * O comprimento de cada palavra é garantido como maior que 0 e não excede maxWidth.
 *
 * A matriz de entrada words contém pelo menos uma palavra.
 *
 * Restrições:
 *
 * 1 <= words.length <= 300
 *
 * 1 <= words[i].length <= 20
 *
 * words[i] consiste de letras e símbolos.
 *
 * 1 <= maxWidth <= 100
 *
 * words[i].length <= maxWidth
 *
 * @param {string[]} words
 * @param {number} maxWidth
 * @return {string[]}
 */
const fullJustify = function (words, maxWidth) {
  let currWidth = 0;
  let nextLine = [];
  const justifiedText = [];
  for (const word of words) {
    if (currWidth + word.length < maxWidth) {
      nextLine.push(word);
      currWidth += word.length + 1;
    } else if (currWidth + word.length === maxWidth) {
      nextLine.push(word);
      justifiedText.push(nextLine.join(" "));
      currWidth = 0;
      nextLine = [];
    } else {
      justifiedText.push(createLine(nextLine, currWidth - 1, maxWidth));
      nextLine = [word];
      currWidth = word.length + 1;
    }
  }
  if (nextLine.length > 0) {
    let lastLine = nextLine.join(" ") + " ".repeat(maxWidth - currWidth + 1);
    justifiedText.push(lastLine);
  }
  return justifiedText;
};

const createLine = (words, currWidth, maxWidth) => {
  if (words.length === 1) return words[0] + " ".repeat(maxWidth - currWidth);
  const length = words.length - 1;
  const minSpace = 1 + Math.floor((maxWidth - currWidth) / length);
  const spaces = new Array(length).fill(minSpace);
  if (minSpace > 1) currWidth += length * (minSpace - 1);
  let i = 0;
  while (currWidth < maxWidth) {
    spaces[i++]++;
    if (i === spaces.length) i = 0;
    currWidth++;
  }
  let line = words[0];
  i = 1;
  let j = 0;
  while (i < words.length) {
    line += " ".repeat(spaces[j++]) + words[i++];
  }
  return line;
};
