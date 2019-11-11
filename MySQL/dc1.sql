-- create database
CREATE DATABASE IF NOT EXISTS daycare;
SHOW DATABASES;
SHOW SCHEMAS;
SHOW CREATE DATABASE daycare;
USE daycare;
SELECT DATABASE();
SELECT SCHEMA();

-- create table student
CREATE TABLE IF NOT EXISTS student(
stu_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
teacher_id INT UNSIGNED DEFAULT '1',
first_name VARCHAR(20) NOT NULL,
last_name VARCHAR(20) NOT NULL,
age TINYINT UNSIGNED NOT NULL,
gender ENUM('M','F','S') NOT NULL,
gpa DOUBLE(5,2),
register_date DATE NOT NULL
)ENGINE=INNODB CHARSET=UTF8;
DESC student;
SHOW COLUMNS FROM student;

-- insert data
INSERT student(stu_id, first_name, last_name, age, gender, register_date) VALUES(1, 'Jimmy', 'Green', '12', '1', '2019-09-04'),
(2, 'Sally', 'Smith', '23', '2', '2018-09-04'),
(3, 'Lizzy', 'Johnson', '62', '1', '2017-09-04'),
(NULL, 'Markie', 'Williams', '32', '2', '2016-09-04'),
(NULL, 'Johnny', 'Jones', '12', '1', '2017-09-04'),
(NULL, 'Bobby', 'Brown', '48', '1', '2018-09-04')
;

-- create table teacher
CREATE TABLE IF NOT EXISTS teacher(
teacher_id INT UNSIGNED KEY AUTO_INCREMENT,
first_name VARCHAR(20) NOT NULL,
last_name VARCHAR(20) NOT NULL,
age TINYINT UNSIGNED NOT NULL,
gender ENUM('M','F','S') NOT NULL,
credits INT UNSIGNED,
wage DOUBLE(8,2),
register_date DATE NOT NULL
)ENGINE=INNODB CHARSET=UTF8;
DESC teacher;
SHOW COLUMNS FROM teacher;

-- create table parent
CREATE TABLE IF NOT EXISTS parent(
id INT UNSIGNED KEY AUTO_INCREMENT,
first_name VARCHAR(20) NOT NULL,
last_name VARCHAR(20) NOT NULL,
age TINYINT UNSIGNED NOT NULL,
gender ENUM('M','F','S') NOT NULL,
phone VARCHAR(10) NOT NULL,
address VARCHAR(50) NOT NULL
)ENGINE=INNODB CHARSET=UTF8;
DESC parent;
SHOW COLUMNS FROM parent;

-- create table classroom
CREATE TABLE IF NOT EXISTS classroom(
classroom_id INT UNSIGNED KEY AUTO_INCREMENT,
classroom_name VARCHAR(10)
)ENGINE=INNODB CHARSET=UTF8;
DESC classroom;
SHOW COLUMNS FROM classroom;

-- create table classroom
CREATE TABLE IF NOT EXISTS teacher_classroom(
classroom_id INT UNSIGNED KEY AUTO_INCREMENT,
teacher_id INT UNSIGNED
)ENGINE=INNODB CHARSET=UTF8;
DESC teacher_classroom;
SHOW COLUMNS FROM teacher_classroom;

-- create table record
CREATE TABLE IF NOT EXISTS record(
stu_id INT UNSIGNED,
dose_001 TINYINT UNSIGNED,
date_001 DATE,
dose_002 TINYINT UNSIGNED,
date_002 DATE,
dose_003 TINYINT UNSIGNED,
date_003 DATE,
dose_004 TINYINT UNSIGNED,
date_004 DATE,
dose_005 TINYINT UNSIGNED,
date_005 DATE,
dose_006 TINYINT UNSIGNED,
date_006 DATE
)ENGINE=INNODB CHARSET=UTF8;
DESC record;
SHOW COLUMNS FROM record;

-- Hib, DTaP, Polio, HB, MMR, Varicella
-- 1, 2, 3, 
CREATE TABLE IF NOT EXISTS vaccine(
vaccine_id INT UNSIGNED,
vaccine_name CHAR(10)
)ENGINE=INNODB CHARSET=UTF8;
DESC vaccine;
SHOW COLUMNS FROM vaccine;