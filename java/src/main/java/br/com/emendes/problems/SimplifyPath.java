package br.com.emendes.problems;

import java.util.LinkedList;

/**
 * Dado uma string path, que é um path absoluto (começando com '/') para um arquivo ou diretório em estilo Unix de
 * sistema de arquivos, converta-o para o path canônico simplificado.<br><br>
 * <p>
 * No estilo Unix de sistema de arquivos, o ponto '.' refere-se ao diretório atual, pontos duplos refere-se ao
 * diretório um nível acima, e barras '/' consecutivas ('//') são tratadas como uma única barra '/'.
 * Para este problema, qualquer outro formato de pontos ('...') são tradatos como nome de arquivo/diretório.<br><br>
 * <p>
 * O path canonico deve ter o seguinte formato:<br>
 * - O path começa com uma única barra '/'.<br>
 * - qualquer dois diretórios são separados por uma única barra '/'.<br>
 * - O path não termina com '/'.<br>
 * - O caminho contém apenas os diretórios no caminho do diretório raiz para o arquivo ou
 * diretório de destino (ou seja, sem ponto '.' ou ponto duplo '..')<br><br>
 * <p>
 * Retorne o path canonico simplificado.<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= path.length <= 3000<br>
 * path consiste de letras inglesas, digitos, pontos, barras ou underscore (_).<br>
 * path é um Unix path absoluto válido.
 */
public class SimplifyPath {

  public String simplifyPath(String path) {
    String[] splitPath = path.split("/+");
    LinkedList<String> simplifyPath = new LinkedList<>();

    for (String curr : splitPath) {
      switch (curr) {
        case ".", "":
          break;
        case "..":
          if (!simplifyPath.isEmpty()) {
            simplifyPath.removeLast();
            simplifyPath.removeLast();
          }
          break;
        default:
          simplifyPath.add("/");
          simplifyPath.add(curr);
      }
    }

    return simplifyPath.isEmpty() ? "/" : String.join("", simplifyPath);
  }

}
