IF NOT EXISTS (SELECT TOP 1 name FROM shoe_store_schema.product
                   WHERE name = 'Кроссовки красивые')
INSERT INTO shoe_store_schema.product(name, manufacturer, amount, receipt_date, unit_price, created_date, last_modified_date)
VALUES ('Кроссовки красивые', 'Nike', 100, '2021-12-11', 3500.05, SYSDATETIME(), SYSDATETIME()),
       ('Кроссовки крутые', 'Adidas', 1, '2021-10-11', 6000, SYSDATETIME(), SYSDATETIME()),
       ('Обувь удобная', 'Reebok', 4, '2021-10-11', 2000.5, SYSDATETIME(), SYSDATETIME());

IF NOT EXISTS (SELECT TOP 1 name FROM shoe_store_schema.provider
                   WHERE name = 'OOO Поставщик красивых кросcовок')
INSERT INTO shoe_store_schema.provider(name, phone, address, contact_person, created_date, last_modified_date)
VALUES ('OOO Поставщик красивых кросcовок', '88005553535', 'улица Пушкина 37', 'Дмитриев Павел Сергеевич', SYSDATETIME(), SYSDATETIME()),
       ('OOO Поставщик крутых кросcовок', '89224321423', 'улица Суворов 23', 'Шилов Михаил Сергеевич', SYSDATETIME(), SYSDATETIME()),
       ('OOO Поставщик удобной обуви', '89372134211', 'Гагаринский дом 3', 'Пушин Сергей Иванович', SYSDATETIME(), SYSDATETIME());

IF NOT EXISTS (SELECT TOP 1 sale_date FROM shoe_store_schema.sale
                   WHERE sale_date = '2021-12-13')
INSERT INTO shoe_store_schema.sale(sale_date, price, amount_sold, created_date, last_modified_date)
VALUES ('2021-12-13', 175002.5, 50, SYSDATETIME(), SYSDATETIME()),
       ('2021-10-15', 6000, 1, SYSDATETIME(), SYSDATETIME()),
       ('2021-12-16', 6001.5, 3, SYSDATETIME(), SYSDATETIME());