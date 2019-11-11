-- create database
CREATE DATABASE IF NOT EXISTS DayCare;
SHOW DATABASES;
SHOW SCHEMAS;
SHOW CREATE DATABASE DayCare;
USE DayCare;
SELECT DATABASE();
SELECT SCHEMA();

-- create table student
CREATE TABLE IF NOT EXISTS student(
stuId INT UNSIGNED KEY AUTO_INCREMENT,
teacherId INT UNSIGNED UNIQUE,
firstName VARCHAR(20) NOT NULL,
lastName VARCHAR(20) NOT NULL,
age TINYINT UNSIGNED NOT NULL,
gender ENUM('M','F','S') NOT NULL,
gpa DOUBLE(5,2),
registerDate DATE NOT NULL
)ENGINE=INNODB CHARSET=UTF8;
DESC student;
SHOW COLUMNS FROM student;

-- insert data
INSERT student(stuId, id, firstName, lastName, age, gender, registerDate) VALUES(NULL, '1', 'Jimmy', 'Green', '12', '1', '2019-09-04'),
(NULL, '2', 'Sally', 'Smith', '23', '2', '2018-09-04'),
(NULL, '3', 'Lizzy', 'Johnson', '62', '1', '2017-09-04'),
(NULL, '4', 'Markie', 'Williams', '32', '2', '2016-09-04'),
(NULL, '5', 'Johnny', 'Jones', '12', '1', '2017-09-04'),
(NULL, '6', 'Bobby', 'Brown', '48', '1', '2018-09-04')
;

-- create table teacher
CREATE TABLE IF NOT EXISTS teacher(
teacherId INT UNSIGNED KEY AUTO_INCREMENT,
firstName VARCHAR(20) NOT NULL,
lastName VARCHAR(20) NOT NULL,
age TINYINT UNSIGNED NOT NULL,
gender ENUM('M','F','S') NOT NULL,
credits INT UNSIGNED,
wage DOUBLE(8,2),
registerDate DATE NOT NULL
)ENGINE=INNODB CHARSET=UTF8;
DESC teacher;
SHOW COLUMNS FROM teacher;

-- create table parent
CREATE TABLE IF NOT EXISTS parent(
stuId INT UNSIGNED KEY AUTO_INCREMENT,
firstName VARCHAR(20) NOT NULL,
lastName VARCHAR(20) NOT NULL,
age TINYINT UNSIGNED NOT NULL,
gender ENUM('M','F','S') NOT NULL,
phone VARCHAR(10) NOT NULL,
address VARCHAR(50) NOT NULL
)ENGINE=INNODB CHARSET=UTF8;
DESC parent;
SHOW COLUMNS FROM parent;

-- create table classroom
CREATE TABLE IF NOT EXISTS classroom(
classroomId INT UNSIGNED KEY AUTO_INCREMENT,
classroomName VARCHAR(10)
)ENGINE=INNODB CHARSET=UTF8;
DESC classroom;
SHOW COLUMNS FROM classroom;

-- create table classroom
CREATE TABLE IF NOT EXISTS teacher_classroom(
classroomId INT UNSIGNED KEY AUTO_INCREMENT,
teacherId INT UNSIGNED
)ENGINE=INNODB CHARSET=UTF8;
DESC teacher_classroom;
SHOW COLUMNS FROM teacher_classroom;

-- create table record
CREATE TABLE IF NOT EXISTS record(
stuId INT UNSIGNED,
dose001 TINYINT UNSIGNED,
dose002 TINYINT UNSIGNED,
dose003 TINYINT UNSIGNED,
dose004 TINYINT UNSIGNED,
dose005 TINYINT UNSIGNED,
dose006 TINYINT UNSIGNED,
date001 DATE,
dose002 DATE,
dose003 DATE,
date004 DATE,
dose005 DATE,
dose006 DATE
)ENGINE=INNODB CHARSET=UTF8;
DESC record;
SHOW COLUMNS FROM record;

-- Hib, DTaP, Polio, HB, MMR, Varicella
-- 1, 2, 3, 
CREATE TABLE IF NOT EXISTS vaccine(
vaccineId INT UNSIGNED,
vaccineName CHAR(10)
)ENGINE=INNODB CHARSET=UTF8;
DESC vaccine;
SHOW COLUMNS FROM vaccine;