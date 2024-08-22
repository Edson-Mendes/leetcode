-- Escreva um solução para encontrar todos os customers que nunca pediram nada.
-- Retorne a tabela resultado em qualquer ordem.

-- Create tables
CREATE TABLE Customers(
  id int, 
  name varchar(255)
);

CREATE TABLE Orders(
  id int, 
  customerId int
);

-- Solution
SELECT c.name AS 'Customers' FROM Customers c 
  WHERE c.id NOT IN (SELECT o.customerId FROM Orders o);