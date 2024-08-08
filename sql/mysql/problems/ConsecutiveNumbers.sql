-- Encontre todos os números que aparecem ao menos três vezes consecutivamente.
-- Retorne o resulta em qualquer ordem.

-- Create tables
CREATE TABLE Logs (id int, num int);

-- First Solution
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

-- Second Solution
SELECT DISTINCT 
	lc.num AS ConsecutiveNums 
FROM Logs lc 
JOIN Logs lp ON lc.num = lp.num AND lc.id = (lp.id + 1)
JOIN Logs ln ON lc.num = ln.num AND lc.id = (ln.id - 1);

-- Third Solution
SELECT DISTINCT
	lc.num as ConsecutiveNums 
FROM Logs lc, Logs lp, Logs ln
WHERE 
	lc.num = lp.num AND lc.id = lp.id + 1 AND 
	lc.num = ln.num AND lc.id = ln.id - 1;