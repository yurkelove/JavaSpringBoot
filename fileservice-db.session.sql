DROP TABLE IF EXISTS users;
CREATE TABLE users (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    birth DATE,
    age INT
);
INSERT INTO users (name, email, birth, age)
VALUES ('Юрий', 'yuriy@gmail.com', '1996-03-28', 30);