/**
 * Você recebe um caminho absoluto para um sistema de arquivos no estilo Unix,
 * que sempre começa com uma barra '/'. Sua tarefa é transformar esse caminho
 * absoluto em seu caminho canônico simplificado.
 *
 * As regras de um sistema de arquivos no estilo Unix são as seguintes:
 *
 * - Um único ponto '.' representa o diretório atual.
 *
 * - Um ponto duplo '..' representa o diretório anterior/pai.
 *
 * - Várias barras consecutivas, como '//' e '///', são tratadas como uma única barra '/'.
 *
 * - Qualquer sequência de pontos que não corresponda às regras acima deve ser tratada
 * como um diretório ou nome de arquivo válido. Por exemplo, '...' e '....' são nomes
 * de diretório ou arquivo válidos.
 *
 * O caminho canônico simplificado deve seguir estas regras:
 *
 * - O caminho deve começar com uma única barra '/'.
 *
 * - Os diretórios dentro do caminho devem ser separados por exatamente uma barra '/'.
 *
 * - O caminho não deve terminar com uma barra '/', a menos que seja o diretório raiz.
 *
 * - O caminho não deve ter pontos simples ou duplos ('.' e '..')
 * usados ​​para indicar diretórios atuais ou pais.
 *
 * Retorna o caminho canônico simplificado.
 *
 * Restrições:
 *
 * 1 <= path.length <= 3000
 *
 * path consiste de letras, digitos, pontos '.', barras '/', ou '_'
 *
 * path é um caminho Unix absoluto válido.
 *
 * @param {string} path
 * @return {string}
 */
const simplifyPath = function (path) {
  const simplifiedPath = [];
  const pathArray = path.split("/");
  for (const element of pathArray) {
    if (element === "" || element === ".") continue;
    if (element === "..") {
      simplifiedPath.pop();
    } else {
      simplifiedPath.push(element);
    }
  }
  return "/" + simplifiedPath.join("/");
};
