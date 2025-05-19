/**
 * Um endereço IP válido consiste em exatamente quatro números inteiros separados por pontos simples.
 * Cada número inteiro está entre 0 e 255 (inclusive) e não pode ter zeros à esquerda.
 *
 * - Por exemplo, "0.1.2.201" e "192.168.1.1" são endereços IP válidos,
 * mas "0.011.255.245", "192.168.1.312" e "192.168@1.1" são endereços IP inválidos.
 *
 * Dada uma string s contendo apenas dígitos, retorne todos os endereços IP válidos possíveis que podem
 * ser formados pela inserção de pontos em s. Não é permitido reordenar ou remover quaisquer dígitos em s.
 * Você pode retornar os endereços IP válidos em qualquer ordem.
 *
 * Restrições:
 *
 * - 1 <= s.length <= 20
 *
 * - s consiste apenas de dígitos.
 */
const restoreIpAddresses = function (s) {
  const ips = [];
  restore(s, 0, [], ips);

  return ips;
};

const restore = (s, sIndex, ip, ips) => {
  if (ip.length === 4) {
    if (sIndex === s.length) ips.push(ip.join("."));
    return;
  }
  if (s[sIndex] === "0") {
    ip.push("0");
    restore(s, sIndex + 1, ip, ips);
    ip.pop();
  } else
    for (let i = sIndex + 1; i <= s.length; i++) {
      const ipPart = s.substring(sIndex, i);
      if (ipPart > 255) break;
      ip.push(ipPart);
      restore(s, i, ip, ips);
      ip.pop();
    }
};
