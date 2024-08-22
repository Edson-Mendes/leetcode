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

-- First Solution
SELECT c.name AS 'Customers' FROM Customers c 
  WHERE c.id NOT IN (SELECT o.customerId FROM Orders o);

-- Second Solution
SELECT c.name AS 'Customers' FROM Customers c 
  LEFT JOIN Orders o ON c.id = o.customerId 
  WHERE o.id IS NULL;