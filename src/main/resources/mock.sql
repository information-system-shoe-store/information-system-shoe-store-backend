-- МОКИ
USE [shoe_store_db];
GO
INSERT INTO shoe_store_schema.product(name, manufacturer, amount, receipt_date, unit_price)
VALUES ('Кроссовки красивые', 'Nike', 100, '2021-12-11', 3500.05),
       ('Кроссовки крутые', 'Adidas', 1, '2021-10-11', 6000),
       ('Обувь удобная', 'Reebok', 4, '2021-10-11', 2000.5);

INSERT INTO shoe_store_schema.provider(name, phone, address, contact_person)
VALUES ('OOO Поставщик красивых кросовок', '88005553535', 'улица Пушкина 37', 'Дмитриев Павел Сергеевич'),
       ('OOO Поставщик крутых кросовок', '89224321423', 'улица Суворов 23', 'Шилов Михаил Сергеевич'),
       ('OOO Поставщик удобной обуви', '89372134211', 'Гагаринский дом 3', 'Пушин Сергей Иванович');

INSERT INTO shoe_store_schema.sale(sale_date, price, amount_sold)
VALUES ('2021-12-13', 175002.5, 50),
       ('2021-10-15', 6000, 1),
       ('2021-12-16', 6001.5, 3);