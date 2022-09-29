CREATE TABLE inventory (
	id serial PRIMARY KEY,
	"name" varchar(20),
	price money,
	description varchar (255),
	quantity int
);

INSERT INTO inventory
VALUES
	(1001, 'Hershey Bar', 3.45, 'A small chocolate bar', 50),
	(1002,	'Skittles',	3.05,	'A bag of rainbow colored candies',	100),
	(2003,	'Gummy Bears',	5.55,	'A large bag of chewy fruit-flavored bears',	48),
	(2005,	'Sour Gummy Worms',	9.55,	'A very large bag of gelatin worms',	20),
	(3008,	'Lollipop',	2.25,	'A hard candy atop a stick',	268),
	(9007,	'M&Ms',	1.95,	'A bag of small chocolate candies',	58);
	
SELECT * FROM inventory;
	
UPDATE inventory SET quantity = 48 WHERE id = 1001;

SELECT description FROM inventory;

SELECT "name", price FROM inventory;

UPDATE inventory SET description = 'A very large, delicious bag of worms' WHERE id = 2005;

UPDATE inventory SET quantity = 100 WHERE id = 9007;

UPDATE inventory SET price = 2.50 WHERE id = 3008;

CREATE TABLE employees_ex (
	id serial UNIQUE,
	"name" varchar(20),
	favorite_candy int REFERENCES inventory
)

INSERT INTO employees_ex 
VALUES 
	(4001,	'Willy Wonka',	2005),
	(4002,	'Milton Hershey',	1001),
	(4003,	'Franklin Mars',	9007),
	(4004,	'John Cadbury', NULL);

SELECT "name",
 price*quantity  AS total_price
FROM inventory WHERE "name" = 'M&Ms';

SELECT "name", price AS lowest FROM inventory WHERE price = (SELECT MIN(price) FROM inventory);


