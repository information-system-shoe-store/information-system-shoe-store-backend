IF NOT EXISTS(SELECT *
              FROM INFORMATION_SCHEMA.TABLES
              WHERE TABLE_SCHEMA = 'shoe_store_schema'
                AND TABLE_NAME = 'product')
CREATE TABLE product
(
    id                 BIGINT IDENTITY PRIMARY KEY,
    name               VARCHAR(255),
    manufacturer       VARCHAR(255),
    amount             INT,
    receipt_date       DATE,
    unit_price         FLOAT,
    created_date       DATETIME,
    last_modified_date DATETIME
);

IF NOT EXISTS(SELECT *
              FROM INFORMATION_SCHEMA.TABLES
              WHERE TABLE_SCHEMA = 'shoe_store_schema'
                AND TABLE_NAME = 'provider')
CREATE TABLE provider
(
    id                 BIGINT IDENTITY PRIMARY KEY,
    name               VARCHAR(255),
    phone              VARCHAR(55),
    address            VARCHAR(255),
    contact_person     VARCHAR(255),
    created_date       DATETIME,
    last_modified_date DATETIME
);

IF NOT EXISTS(SELECT *
              FROM INFORMATION_SCHEMA.TABLES
              WHERE TABLE_SCHEMA = 'shoe_store_schema'
                AND TABLE_NAME = 'sale')
CREATE TABLE sale
(
    id                 BIGINT IDENTITY PRIMARY KEY,
    sale_date          DATE,
    price              FLOAT,
    amount_sold        INT,
    created_date       DATETIME,
    last_modified_date DATETIME
);