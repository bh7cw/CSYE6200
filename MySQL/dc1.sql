-- create database
CREATE DATABASE IF NOT EXISTS daycare;
-- SHOW DATABASES;
-- SHOW SCHEMAS;
-- SHOW CREATE DATABASE daycare;
USE daycare;
-- SELECT DATABASE();
-- SELECT SCHEMA();

-- create table student
CREATE TABLE IF NOT EXISTS students (
    stu_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    teacher_id INT UNSIGNED DEFAULT '1',
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    age TINYINT UNSIGNED NOT NULL,
    gender ENUM('M', 'F', 'S') NOT NULL,
    gpa DOUBLE(5 , 2 ),
    register_date DATE NOT NULL
)  ENGINE=INNODB CHARSET=UTF8;
-- DESC students;
-- SHOW COLUMNS FROM students;

-- insert data
INSERT students(stu_id, first_name, last_name, age, gender, register_date) VALUES(NULL, 'Jimmy', 'Green', '12', '1', '2019-09-04'),
(NULL, 'Sally', 'Smith', '23', '2', '2018-09-04'),
(NULL, 'Lizzy', 'Johnson', '62', '1', '2017-09-04'),
(NULL, 'Markie', 'Williams', '32', '2', '2016-09-04'),
(NULL, 'Johnny', 'Jones', '12', '1', '2017-09-04'),
(NULL, 'Bobby', 'Brown', '48', '1', '2018-09-04')
;

-- SELECT * FROM students;

-- create table teacher
CREATE TABLE IF NOT EXISTS teachers (
    teacher_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    age TINYINT UNSIGNED NOT NULL,
    gender ENUM('M', 'F', 'S') NOT NULL,
    credits INT UNSIGNED,
    wage DOUBLE(8 , 2 ),
    register_date DATE NOT NULL
)  ENGINE=INNODB CHARSET=UTF8;
-- DESC teachers;
-- SHOW COLUMNS FROM teachers;

INSERT teachers(teacher_id, first_name, last_name, age, gender, credits, wage, register_date) VALUES(NULL,'Dan','Peter','18','M','20','1000.00','2006-09-04'),
(NULL,'Lee','Green','28','F','30','1500.00','2008-09-04');

-- SELECT * FROM teachers;


-- create table parent
CREATE TABLE IF NOT EXISTS parents (
    id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    age TINYINT UNSIGNED NOT NULL,
    gender ENUM('M', 'F', 'S') NOT NULL,
    phone VARCHAR(12) NOT NULL,
    address VARCHAR(50) NOT NULL
)  ENGINE=INNODB CHARSET=UTF8;
-- DESC parents;
-- SHOW COLUMNS FROM parents;

INSERT parents(id, first_name, last_name, age, gender, phone, address) VALUES(NULL, 'Linda', 'Green', '42', 'F', '111-111-1111','Boston, MA'),
(NULL, 'Lily', 'Smith', '43', '1', '222-222-2222','Boston, MA'),
(NULL, 'Lucy', 'Johnson', '32', '1', '333-333-3333','Boston, MA'),
(NULL, 'Jack', 'Williams', '46', '2', '444-444-4444','Boston, MA'),
(NULL, 'Tom', 'Jones', '37', '2', '555-555-5555','Boston, MA'),
(NULL, 'Kat', 'Brown', '40', '2', '666-666-6666','Boston, MA')
;

-- SELECT * FROM parents;

-- create table classroom
CREATE TABLE IF NOT EXISTS classrooms (
    classroom_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    classroom_name VARCHAR(10)
)  ENGINE=INNODB CHARSET=UTF8;
-- DESC classrooms;
-- SHOW COLUMNS FROM classrooms;

INSERT classrooms(classroom_id, classroom_name) VALUES(NULL, 'CLASS1'),(NULL,'CLASS2');
-- SELECT * FROM classrooms;

-- create table classroom
CREATE TABLE IF NOT EXISTS teacher_classroom (
    classroom_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    teacher_id INT UNSIGNED
)  ENGINE=INNODB CHARSET=UTF8;
-- DESC teacher_classroom;
-- SHOW COLUMNS FROM teacher_classroom;

INSERT teacher_classroom(classroom_id, teacher_id) VALUES('1','1'),('2','2');
-- SELECT * FROM teacher_classroom;

-- Hib, DTaP, Polio, HB, MMR, Varicella
-- 1, 2, 3, 
CREATE TABLE IF NOT EXISTS vaccines (
    vaccine_id INT UNSIGNED PRIMARY KEY,
    vaccine_name CHAR(10)
)  ENGINE=INNODB CHARSET=UTF8;
-- DESC vaccines;
-- SHOW COLUMNS FROM vaccines;

INSERT vaccines(vaccine_id, vaccine_name) VALUES('1', 'Hib'),('2','DTaP'), ('3','Polio'), ('4', 'HB'), ('5','MMR'),('6', 'Varicella');
-- SELECT * FROM vaccines;

-- create table record
CREATE TABLE IF NOT EXISTS records (
    stu_id INT UNSIGNED PRIMARY KEY,
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
)  ENGINE=INNODB CHARSET=UTF8;
-- DESC records;
-- SHOW COLUMNS FROM records;

insert records(stu_id, dose_001, date_001, dose_002, date_002, dose_003, date_003, dose_004, date_004, dose_005, date_005, dose_006, date_006) 
VALUES('1', '0', NULL, '1', '2019-08-06', '1', '2018-08-06', '2', '2017-08-05', '3', '2018-08-06', '2', '2019-08-05');
-- SELECT * FROM records;