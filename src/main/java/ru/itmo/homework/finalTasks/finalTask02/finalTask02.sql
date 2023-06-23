CREATE TABLE IF NOT EXISTS purchaser (
	purchaser_id SERIAL PRIMARY KEY,
	lastName VARCHAR(30) NOT NULL,
	firstName VARCHAR(30) NOT NULL,
	email VARCHAR(30) UNIQUE NOT NULL,
	address VARCHAR(200) NOT NULL
);

CREATE TABLE IF NOT EXISTS item (
	item_id SERIAL PRIMARY KEY,
	description TEXT NOT NULL,
	price INTEGER NOT NULL;
);

CREATE TABLE IF NOT EXISTS basket (
	basket_id SERIAL PRIMARY KEY,
	purchaser_id INTEGER REFERENCES purchaser (purchaser_id),
);

CREATE TABLE IF NOT EXISTS order (
	order_id INTEGER,
	basket_id INTEGER REFERENCES basket (basket_id),
	item_id INTEGER REFERENCES item (item_id),
	amount INTEGER
	CONSTRAINT order_pk PRIMARY KEY (basket_id, item_id);
);
