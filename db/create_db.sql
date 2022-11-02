DROP SCHEMA IF EXISTS coffee_shop CASCADE;
CREATE SCHEMA coffee_shop;

DROP TABLE IF EXISTS coffee_shop."categories";
DROP TABLE IF EXISTS coffee_shop."order";
DROP TABLE IF EXISTS coffee_shop."orders";
DROP TABLE IF EXISTS coffee_shop."product";
DROP TABLE IF EXISTS coffee_shop."users";

CREATE TABLE coffee_shop."categories" (
	category_name VARCHAR(100) NOT NULL,
	PRIMARY KEY (category_name)
);
CREATE TABLE coffee_shop."product" (
	product_name VARCHAR(100) NOT NULL,
	product_id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY,
	product_cost NUMERIC NOT NULL,
	category_name VARCHAR(100) NOT NULL,
	PRIMARY KEY (product_id),
	FOREIGN KEY(category_name) REFERENCES coffee_shop."categories"(category_name) ON DELETE CASCADE ON UPDATE CASCADE
);
CREATE TABLE coffee_shop."order" (
	order_id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY,
	product_id INTEGER NOT NULL,
	amount	INTEGER NOT NULL,
	PRIMARY KEY (order_id),
	FOREIGN KEY (product_id) REFERENCES coffee_shop."product"(product_id) ON DELETE CASCADE ON UPDATE CASCADE
);
DROP TYPE IF EXISTS coffee_shop."order_state";

CREATE TYPE coffee_shop."order_state" AS ENUM (
	'ACTIVE',
	'CANCELLED',
	'PAID'
);
CREATE TABLE coffee_shop."users" (
	user_name VARCHAR(100) NOT NULL,
	user_id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY,
	PRIMARY KEY (user_id)
);
CREATE TABLE coffee_shop."orders" (
	order_id INTEGER NOT NULL,
	total NUMERIC NOT NULL,
	state order_state NOT NULL,
	issue_date DATE NOT NULL,
	user_id INTEGER NOT NULL,
	PRIMARY KEY (order_id),
	FOREIGN KEY (order_id) REFERENCES coffee_shop."order"(order_id) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY (user_id) REFERENCES coffee_shop."users"(user_id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO coffee_shop."categories"(category_name) VALUES ('Coffee');
INSERT INTO coffee_shop."categories"(category_name) VALUES ('Hot Drink');
INSERT INTO coffee_shop."categories"(category_name) VALUES ('Dessert');

INSERT INTO coffee_shop."product"(product_name, product_cost, category_name) VALUES ('Americano', 3, 'Coffee');
INSERT INTO coffee_shop."product"(product_name, product_cost, category_name) VALUES ('Cappuccino', 3, 'Coffee');
INSERT INTO coffee_shop."product"(product_name, product_cost, category_name) VALUES ('Macchiato', 3, 'Coffee');
INSERT INTO coffee_shop."product"(product_name, product_cost, category_name) VALUES ('Espresso', 2, 'Coffee');
INSERT INTO coffee_shop."product"(product_name, product_cost, category_name) VALUES ('Mocha', 2.5, 'Coffee');
INSERT INTO coffee_shop."product"(product_name, product_cost, category_name) VALUES ('Hot Chocolate', 3, 'Hot Drink');
INSERT INTO coffee_shop."product"(product_name, product_cost, category_name) VALUES ('White Chocolate', 3.5, 'Hot Drink');
INSERT INTO coffee_shop."product"(product_name, product_cost, category_name) VALUES ('Vanila Tea', 2.5, 'Hot Drink');
INSERT INTO coffee_shop."product"(product_name, product_cost, category_name) VALUES ('Green Tea', 2.5, 'Hot Drink');
INSERT INTO coffee_shop."product"(product_name, product_cost, category_name) VALUES ('Sweets', 3.5, 'Dessert');
INSERT INTO coffee_shop."product"(product_name, product_cost, category_name) VALUES ('Cupcake', 2, 'Dessert');
INSERT INTO coffee_shop."product"(product_name, product_cost, category_name) VALUES ('Doughnut', 2.5, 'Dessert');
INSERT INTO coffee_shop."product"(product_name, product_cost, category_name) VALUES ('Croissant', 3, 'Dessert');
INSERT INTO coffee_shop."product"(product_name, product_cost, category_name) VALUES ('Cheesecake', 4, 'Dessert');

INSERT INTO coffee_shop."users"(user_name) VALUES ('Thanasis');
INSERT INTO coffee_shop."users"(user_name) VALUES ('Dimitra');

