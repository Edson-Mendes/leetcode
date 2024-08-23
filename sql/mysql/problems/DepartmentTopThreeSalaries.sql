-- Os executivos de uma empresa estão interessados ​​em ver quem ganha 
-- mais dinheiro em cada um dos departamentos da empresa.
-- Um funcionário com alta remuneração em um departamento é aquele que 
-- tem um salário entre os três maiores salários exclusivos daquele departamento.
--
-- Escreva uma solução para encontrar os funcionários com altos salários em cada um dos departamentos.
-- Retorne a tabela de resultados em qualquer ordem.

-- Create tables
CREATE TABLE Employee(
  id int, 
  name varchar(255), 
  salary int,
  departmentId int
);

CREATE TABLE Department(
  id int, 
  name varchar(255)
);

-- Solution
WITH rankingByDepartment AS (
	SELECT e.name, e.salary, e.departmentId, DENSE_RANK() OVER(PARTITION BY departmentId ORDER BY salary DESC) AS 'ranking' 
	FROM Employee e)
SELECT d.name AS 'Department', r.name AS 'Employee', r.salary AS 'Salary' 
	FROM rankingByDepartment r
	JOIN Department d ON r.departmentId = d.id
	WHERE r.ranking <= 3;