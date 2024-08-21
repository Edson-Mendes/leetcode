-- Escreva um solução para encontrar o empregados que ganham mais que seus gerentes.
-- Retorne a tabela de resultado em qualquer ordem.

-- Create tables
CREATE TABLE Employee (
  id int, 
  name varchar(255), 
  salary int, 
  managerId int
);

-- First Solution
SELECT e.name AS 'Employee' FROM Employee e, Employee m 
	WHERE e.managerId IS NOT NULL
	AND e.managerId = m.id
	AND e.salary > m.salary;

-- Second Solution
SELECT e.name AS 'Employee' FROM Employee e 
	JOIN Employee m ON e.managerId = m.id
	WHERE e.salary > m.salary;