-- Escreva uma solução para deletar todos os emails duplicados, mantendo apenas um único email com o menor id.
-- Para usuários de SQL, observe que você deve escrever uma instrução DELETE e não SELECT.

-- Create tables
CREATE TABLE Person(
  Id int, 
  Email varchar(255)
);

-- First solution
WITH emailRanking AS (
	SELECT p.id, p.email, DENSE_RANK() OVER(PARTITION BY email ORDER BY id) AS 'rank' FROM Person p
) 
DELETE FROM Person p WHERE p.id IN (SELECT er.id FROM emailRanking er WHERE er.rank != 1);

-- Second solution
DELETE p1 FROM Person p1 JOIN Person p2 ON p1.email = p2.email AND p1.id > p2.id;