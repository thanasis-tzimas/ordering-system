DROP TABLE IF EXISTS categories;
DROP TABLE IF EXISTS product_order;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS product;
DROP TABLE IF EXISTS users;

CREATE TABLE categories (
        category_name VARCHAR(100) NOT NULL,
        PRIMARY KEY (category_name)
);
CREATE TABLE product (
        product_name VARCHAR(100) NOT NULL,
        product_id SERIAL,
        product_cost NUMERIC NOT NULL,
        category_name VARCHAR(100) NOT NULL,
        PRIMARY KEY (product_id),
        FOREIGN KEY(category_name) REFERENCES categories(category_name) ON DELETE CASCADE ON UPDATE CASCADE
);
CREATE TABLE product_order (
        order_id SERIAL,
        product_id INTEGER NOT NULL,
        amount  INTEGER NOT NULL,
        PRIMARY KEY (order_id),
        FOREIGN KEY (product_id) REFERENCES product(product_id) ON DELETE CASCADE ON UPDATE CASCADE
);
DROP TYPE IF EXISTS order_state;

CREATE TYPE order_state AS ENUM (
        'ACTIVE',
        'CANCELLED',
        'PAID'
);
CREATE TABLE users (
        user_name VARCHAR(100) NOT NULL,
        user_id SERIAL,
        PRIMARY KEY (user_id)
);
CREATE TABLE orders (
        order_id INTEGER NOT NULL,
        total NUMERIC NOT NULL,
        state order_state NOT NULL,
        issue_date DATE NOT NULL,
        user_id INTEGER NOT NULL,
        PRIMARY KEY (order_id),
        FOREIGN KEY (order_id) REFERENCES product_order(order_id) ON DELETE CASCADE ON UPDATE CASCADE,
        FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO categories(category_name) VALUES ('Coffee');
INSERT INTO categories(category_name) VALUES ('Hot Drink');
INSERT INTO categories(category_name) VALUES ('Dessert');

INSERT INTO product(product_name, product_cost, category_name) VALUES ('Americano', 3, 'Coffee');
INSERT INTO product(product_name, product_cost, category_name) VALUES ('Cappuccino', 3, 'Coffee');
INSERT INTO product(product_name, product_cost, category_name) VALUES ('Macchiato', 3, 'Coffee');
INSERT INTO product(product_name, product_cost, category_name) VALUES ('Espresso', 2, 'Coffee');
INSERT INTO product(product_name, product_cost, category_name) VALUES ('Mocha', 2.5, 'Coffee');
INSERT INTO product(product_name, product_cost, category_name) VALUES ('Hot Chocolate', 3, 'Hot Drink');
INSERT INTO product(product_name, product_cost, category_name) VALUES ('White Chocolate', 3.5, 'Hot Drink');
INSERT INTO product(product_name, product_cost, category_name) VALUES ('Vanila Tea', 2.5, 'Hot Drink');
INSERT INTO product(product_name, product_cost, category_name) VALUES ('Green Tea', 2.5, 'Hot Drink');
INSERT INTO product(product_name, product_cost, category_name) VALUES ('Sweets', 3.5, 'Dessert');
INSERT INTO product(product_name, product_cost, category_name) VALUES ('Cupcake', 2, 'Dessert');
INSERT INTO product(product_name, product_cost, category_name) VALUES ('Doughnut', 2.5, 'Dessert');
INSERT INTO product(product_name, product_cost, category_name) VALUES ('Croissant', 3, 'Dessert');
INSERT INTO product(product_name, product_cost, category_name) VALUES ('Cheesecake', 4, 'Dessert');

INSERT INTO users(user_name) VALUES ('Thanasis');
INSERT INTO users(user_name) VALUES ('Dimitra');

