-- Escreva uma solução para encontrar os employees que possuem o maior salário que cada departamento.
-- Retorne a tabela resultado em qualquer ordem.

-- Create tables
CREATE TABLE Employee (
  id int, 
  name varchar(255), 
  salary int, 
  departmentId int
);

CREATE TABLE Department (
  id int, 
  name varchar(255)
);

-- First Solution
WITH highestSalaryByDepartament AS (SELECT d.id AS 'departmentId', MAX(e.salary) AS 'salary' FROM Employee e 
	JOIN Department d ON e.departmentId = d.id
	GROUP BY d.id)
SELECT d.name AS 'Department', e.name AS 'Employee', h.salary AS 'Salary' 
  FROM Employee e, highestSalaryByDepartament h, Department d
	WHERE h.departmentId = e.departmentId AND e.salary = h.salary AND h.departmentId = d.id;

-- Second Solution
WITH highestSalaryByDepartament AS (SELECT d.id AS 'departmentId', MAX(e.salary) AS 'salary' FROM Employee e 
	JOIN Department d ON e.departmentId = d.id
	GROUP BY d.id)
SELECT d.name AS 'Department', e.name AS 'Employee', h.salary AS 'Salary' 
	FROM Employee e
	JOIN highestSalaryByDepartament h ON e.departmentId = h.departmentId AND e.salary = h.salary
	JOIN Department d ON h.departmentId = d.id;