INSERT INTO public.categories(category_name) VALUES ('Coffee');
INSERT INTO public.categories(category_name) VALUES ('Hot Drink');
INSERT INTO public.categories(category_name) VALUES ('Dessert');

INSERT INTO public.product(product_name, product_cost, category_name) VALUES ('Americano', 3, 'Coffee');
INSERT INTO public.product(product_name, product_cost, category_name) VALUES ('Cappuccino', 3, 'Coffee');
INSERT INTO public.product(product_name, product_cost, category_name) VALUES ('Macchiato', 3, 'Coffee');
INSERT INTO public.product(product_name, product_cost, category_name) VALUES ('Espresso', 2, 'Coffee');
INSERT INTO public.product(product_name, product_cost, category_name) VALUES ('Mocha', 2.5, 'Coffee');
INSERT INTO public.product(product_name, product_cost, category_name) VALUES ('Hot Chocolate', 3, 'Hot Drink');
INSERT INTO public.product(product_name, product_cost, category_name) VALUES ('White Chocolate', 3.5, 'Hot Drink');
INSERT INTO public.product(product_name, product_cost, category_name) VALUES ('Vanila Tea', 2.5, 'Hot Drink');
INSERT INTO public.product(product_name, product_cost, category_name) VALUES ('Green Tea', 2.5, 'Hot Drink');
INSERT INTO public.product(product_name, product_cost, category_name) VALUES ('Sweets', 3.5, 'Dessert');
INSERT INTO public.product(product_name, product_cost, category_name) VALUES ('Cupcake', 2, 'Dessert');
INSERT INTO public.product(product_name, product_cost, category_name) VALUES ('Doughnut', 2.5, 'Dessert');
INSERT INTO public.product(product_name, product_cost, category_name) VALUES ('Croissant', 3, 'Dessert');
INSERT INTO public.product(product_name, product_cost, category_name) VALUES ('Cheesecake', 4, 'Dessert');

INSERT INTO public.users(user_name) VALUES ('Thanasis');
INSERT INTO public.users(user_name) VALUES ('Dimitra');

