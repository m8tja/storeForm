--DROP TABLE IF EXISTS obrazec;
DROP TABLE IF EXISTS store;

CREATE TABLE store (
name VARCHAR(50), address VARCHAR(50), phone VARCHAR(50), PRIMARY KEY(name)
);

INSERT INTO store (name, address, phone)
VALUES ("DM", "Reska cesta 6", "+386 7214859");

INSERT INTO store (name, address, phone)
VALUES ("C&C", "Trzaska cesta 7", "+386 7314850");

CREATE TABLE IF NOT EXISTS obrazec (
id BIGINT NOT NULL AUTO_INCREMENT, name VARCHAR(50), date VARCHAR(20), served_by VARCHAR(100), email VARCHAR(30), bt_broadband VARCHAR(30),
bttv_package VARCHAR(30), handy_information VARCHAR(30), sport_package VARCHAR(30), total_payment INTEGER(5), PRIMARY KEY(id)
);
