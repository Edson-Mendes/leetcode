-- Create tables
CREATE TABLE Person(
	personId int NOT NULL AUTO_INCREMENT,
	lastName varchar(255),
	firstName varchar(255),
	PRIMARY KEY (personId)
);

CREATE TABLE Address(
	addressId int NOT NULL AUTO_INCREMENT,
	personId int NOT NULL,
	city varchar(255),
	state varchar(255),
	PRIMARY KEY (addressId)
);

-- Insert data
INSERT INTO Person(lastName,firstName) VALUES ('Wang', 'Allen'), ('Alice', 'Bob');
INSERT INTO Address(personId, city, state) VALUES (2, 'New York City', 'New York'), (3, 'Leetcode', 'California');

---------------------------------------------
-- Solution
select p.firstName, p.lastName, a.city, a.state from Person p LEFT JOIN Address a ON p.personId = a.personId;