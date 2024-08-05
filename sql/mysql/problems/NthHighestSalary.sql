-- Escreva uma solução para encontrar o Nth maior salário da tabela Employee. 
-- Se não houver Nth maior salário, retorne null.

-- Create tables
CREATE TABLE Employee(
  id int,
  salary int,
  PRIMARY KEY (id)
);

-- Insert data
insert into Employee (id, salary) values ('1', '100'), ('2', '200'), ('3', '300');

---------------------------------------------
-- Solution
delimiter //

CREATE FUNCTION getNthHighestSalary(n INT) RETURNS INT
BEGIN
	DECLARE n_highest int;
	SET n = n - 1;
	SELECT DISTINCT e.salary INTO n_highest FROM Employee e ORDER BY salary DESC LIMIT 1 OFFSET n;
	RETURN n_highest;
END; //

delimiter ;