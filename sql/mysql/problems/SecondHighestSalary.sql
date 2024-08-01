-- Escreva uma solução para encontrar o segundo maior salário da tabela Employee. 
-- Se não houver um segundo maior salário, retorne null.

-- Create tables
CREATE TABLE Employee(
  id int, 
  salary int,
  PRIMARY KEY (id)
);

-- Insert data
INSERT INTO Employee(salary) VALUES (100), (200), (300);

---------------------------------------------
-- Solution
SELECT MAX(salary) AS SecondHighestSalary 
	FROM (
		SELECT sd.salary FROM (SELECT DISTINCT salary FROM Employee e) AS sd ORDER BY sd.salary DESC LIMIT 1 OFFSET 1
	) AS shs;