-- Encontre todos os números que aparecem ao menos três vezes consecutivamente.
-- Retorne o resulta em qualquer ordem.

-- Create tables
CREATE TABLE Logs (id int, num int);

-- Solution
WITH LogsNeighbors AS (
	SELECT 
		*, 
		LAG(num) OVER(ORDER BY id) AS prev_num,
		LAG(id) OVER(ORDER BY id) AS prev_id,
		LEAD(num) OVER(ORDER BY id) AS next_num,
		LEAD(id) OVER(ORDER BY id) AS next_id
	FROM Logs
)
SELECT DISTINCT 
  num AS ConsecutiveNums 
FROM LogsNeighbors 
WHERE num = prev_num AND num = next_num AND id = (prev_id + 1) AND id = (next_id - 1);