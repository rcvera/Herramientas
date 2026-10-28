CREATE TABLE IF NOT EXISTS productos (
    id BIGSERIAL PRIMARY KEY,
    nombre VARCHAR(150),
    description VARCHAR(1000),
    price DOUBLE PRECISION
);
