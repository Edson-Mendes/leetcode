-- Escreva um solução para reportar todos os emails duplicados. Note que é garantido que o campo email não é NULL.
-- Retorne a tabela resposta em qualquer ordem.

-- Create tables
CREATE TABLE Person (
  id int, 
  email varchar(255) NOT NULL
);

-- Solution
SELECT DISTINCT p.email AS 'Email' FROM Person p, Person d 
  WHERE p.id != d.id 
  AND p.email = d.email;