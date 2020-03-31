CREATE DATABASE CodeGym;

USE CodeGym;
CREATE TABLE HocVien (
    name VARCHAR(255) PRIMARY,
    age int
);

INSERT INTO HocVien(name,age) values ('Tung',31);
INSERT INTO HocVien(name,age) values ('Duc',32);

SELECT * FROM HocVien;

UPDATE HocVien SET name = 'Trung' , age = 34 WHERE name = 'Tung'; 
