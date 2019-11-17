-- create database
CREATE DATABASE IF NOT EXISTS daycare;
-- SHOW DATABASES;
-- SHOW SCHEMAS;
-- SHOW CREATE DATABASE daycare;
USE daycare;
-- SELECT DATABASE();
-- SELECT SCHEMA();

-- create table student
CREATE TABLE IF NOT EXISTS student (
    student_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    gender CHAR(1) NOT NULL,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    gpa DOUBLE(5 , 2 ),
    birth_date DATE NOT NULL,
    register_date DATE NOT NULL,
    parent_first_name VARCHAR(20) NOT NULL,
    parent_last_name VARCHAR(20) NOT NULL,
    parent_phone VARCHAR(20) NOT NULL,
    parent_email VARCHAR(30) NOT NULL,
    parent_address VARCHAR(50) NOT NULL,
    parent_gender CHAR(1) NOT NULL
)  ENGINE=INNODB CHARSET=UTF8;
-- DESC student;
-- SHOW COLUMNS FROM student;

-- insert data
INSERT student(student_id, gender, first_name, last_name, gpa, birth_date, register_date, 
parent_first_name, parent_last_name, parent_phone, parent_email, parent_address, parent_gender
) VALUES(NULL, 'M', 'Jimmy', 'Green', '85', '2018-12-03', '2019-09-04', 
'Lily', 'Green', '111-111-1111', 'lily@gmail.com', '9 Washington Street, Boston, MA', 'F'),
(NULL, 'F', 'Sally', 'Smith', '90', '2017-08-05', '2018-09-04', 
'Lucy', 'Smith', '222-111-1111', 'lucy@gmail.com', '19 Washington Street, Boston, MA', 'F'),
(NULL, 'F', 'Lizzy', 'Johnson', '78', '2016-01-23', '2017-09-04',
'Mary', 'Johnson', '333-111-1111', 'mary@gmail.com', '29 Washington Street, Boston, MA', 'F'),
(NULL, 'M', 'Markie', 'Williams', '96', '2015-04-19', '2016-09-04',
'Bill', 'Williams', '444-111-1111', 'bill@gmail.com', '7 Green Street, Boston, MA', 'M'),
(NULL, 'M', 'Johnny', 'Jones', '72', '2016-09-08', '2017-09-04',
'Daniel', 'Jones', '555-111-1111', 'daniel@gmail.com', '29 Green Street, Boston, MA', 'M'),
(NULL, 'M', 'Bobby', 'Brown', '86', '2017-10-01', '2018-09-04',
'Bonnie', 'Brown', '666-111-1111', 'bonnie@gmail.com', '19 Green Street, Boston, MA', 'F')
;

-- SELECT * FROM student;

-- create table teacher
CREATE TABLE IF NOT EXISTS teacher (
    teacher_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    credits INT UNSIGNED,
    wage DOUBLE(8 , 2 ),
    register_date DATE NOT NULL
)  ENGINE=INNODB CHARSET=UTF8;
-- DESC teacher;
-- SHOW COLUMNS FROM teacher;

INSERT teacher(teacher_id, credits, wage, register_date) VALUES(NULL,'99','20000.00','2006-09-04'),
(NULL,'89','15000.00','2016-09-04'),
(NULL,'97','19000.00','2008-09-04'),
(NULL,'69','10300.00','2009-09-04'),
(NULL,'79','10010.00','2011-09-04'),
(NULL,'92','10020.00','2012-09-04')
;

-- SELECT * FROM teacher;

-- create table classroom
CREATE TABLE IF NOT EXISTS classroom (
    classroom_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    classroom_name VARCHAR(10)
)  ENGINE=INNODB CHARSET=UTF8;
-- DESC classroom;
-- SHOW COLUMNS FROM classroom;

INSERT classroom(classroom_id, classroom_name) VALUES(NULL, 'CLASS1'),(NULL,'CLASS2');
-- SELECT * FROM classroom;

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
-- 1, 2, 3, 4, 5, 6
CREATE TABLE IF NOT EXISTS vaccine (
    id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    total_dose INT UNSIGNED NOT NULL,
    valid_month INT UNSIGNED NOT NULL,
    days_between_doses INT UNSIGNED NOT NULL,
    name VARCHAR(20) NOT NULL, 
    description VARCHAR(50) NOT NULL,
    is_required_s_t CHAR(1) NOT NULL
)  ENGINE=INNODB CHARSET=UTF8;
-- DESC vaccine;
-- SHOW COLUMNS FROM vaccine;

-- INSERT vaccine(id, total_dose, valid_month, days_between_doses, name, description, is_required_s_t) 
-- VALUES(NULL, 'HibVaccine'),
-- (NULL, '4', 'DTaPVaccine'), 
-- (NULL,'PolioVaccine'), 
-- (NULL, 'HBVaccine'), 
-- (NULL,'MMRVaccine'),
-- (NULL, 'VaricellaVaccine');
-- SELECT * FROM vaccine;

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