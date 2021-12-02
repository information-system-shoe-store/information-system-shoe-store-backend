IF NOT EXISTS(SELECT *
              FROM sys.databases
              WHERE name = 'shoe_store_db')
    BEGIN
        CREATE DATABASE shoe_store_db;
    END;
GO
USE [shoe_store_db]
GO
IF (NOT EXISTS(SELECT *
               FROM sys.schemas
               WHERE name = 'shoe_store_schema'))
    BEGIN
        EXEC ('CREATE SCHEMA [shoe_store_schema] AUTHORIZATION [dbo]')
    END;