IF NOT EXISTS(SELECT *
              FROM sys.databases
              WHERE name = 'shoe_store_db')
    BEGIN
        CREATE DATABASE shoe_store_db COLLATE Cyrillic_General_CI_AS;
    END;
GO
USE [shoe_store_db];
GO
CREATE LOGIN nikitecc
    WITH PASSWORD = 'n_lvov1705';
GO
CREATE USER nikitecc FOR LOGIN nikitecc WITH DEFAULT_SCHEMA=shoe_store_schema;
GO
GRANT ALL PRIVILEGES TO nikitecc;
GO
IF (NOT EXISTS(SELECT *
               FROM sys.schemas
               WHERE name = 'shoe_store_schema'))
    BEGIN
        EXEC ('CREATE SCHEMA [shoe_store_schema] AUTHORIZATION [nikitecc]')
    END;