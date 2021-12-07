IF NOT EXISTS (SELECT *
               FROM INFORMATION_SCHEMA.TABLES
               WHERE TABLE_SCHEMA = 'shoe_store_schema'
                 AND TABLE_NAME = 'product')
CREATE TABLE product
(
    id           BIGINT IDENTITY PRIMARY KEY,
    name         VARCHAR(255),
    manufacturer VARCHAR(255),
    amount       INT,
    receipt_date DATE,
    unit_price   FLOAT,
    created_date  DATETIME,
    last_modified_date DATETIME
);