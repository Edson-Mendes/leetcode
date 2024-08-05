-- Escreva uma solução para encontrar o rank dos scores. O ranking deve ser calculado de acordo com as regras abaixo:
-- - Os scores devem ser rankeados do maior para o menor.
-- - Se dois ranks tiverem o mesmo score, ambos devem ter o mesmo rank.
-- - Depois de um empate, o próximo rank deve ser o próximo número consecutivo. 
-- Em outras palavras, não devem ter buracos entre ranks.
--
-- Retorne o resultado da tabela ordenado por scores em modo decrescente.

-- Create tables
CREATE TABLE Scores(
  id int, 
  score DECIMAL(3,2)
);

-- Solution
SELECT score, DENSE_RANK() OVER (ORDER BY score DESC) AS 'rank' FROM Scores s ORDER BY score DESC;
