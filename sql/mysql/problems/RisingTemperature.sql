-- Escreva um solução para encontrar todos os ids das data onde a temperatura é maior 
-- comparada ao dia anterior.
-- Retorne a tabela resultado em qualquer ordem.

-- Create tables
CREATE TABLE Weather(
	id int, 
	recordDate date, 
	temperature int
);

-- First solution
SELECT w1.id FROM Weather w1, Weather w2 
  WHERE DATEDIFF(w1.recordDate, w2.recordDate) = 1 
  AND w1.temperature > w2.temperature;

-- Second solution
SELECT w1.id FROM Weather w1 
  INNER JOIN Weather w2 
  ON DATEDIFF(w1.recordDate, w2.recordDate) = 1 AND w1.temperature > w2.temperature;