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

-- create table teachers
CREATE TABLE IF NOT EXISTS teacher (
    teacher_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    gender CHAR(1) NOT NULL,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    credits INT UNSIGNED,
    wage DOUBLE(8 , 2 ),
    register_date DATE NOT NULL
)  ENGINE=INNODB CHARSET=UTF8;
-- DESC teacher;
-- SHOW COLUMNS FROM teacher;

-- create table groupinfo
CREATE TABLE IF NOT EXISTS groupinfo (
group_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
min_age_range INT UNSIGNED,
max_age_range INT UNSIGNED
) ENGINE=INNODB CHARSET=UTF8;

-- create table classrooms
CREATE TABLE IF NOT EXISTS classroom (
    classroom_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    classroom_name VARCHAR(10)
)  ENGINE=INNODB CHARSET=UTF8;
-- DESC classroom;
-- SHOW COLUMNS FROM classroom;

-- 1 classroom contains 3 groups at most
CREATE TABLE IF NOT EXISTS classroom_group (
    classroom_id INT UNSIGNED NOT NULL,
    group_id INT UNSIGNED NOT NULL
)  ENGINE=INNODB CHARSET=UTF8;
-- DESC classroom_group;
-- SHOW COLUMNS FROM classroom_group;

-- one group one teacher
CREATE TABLE IF NOT EXISTS group_teacher (
    group_id INT UNSIGNED NOT NULL,
    teacher_id INT UNSIGNED NOT NULL
)  ENGINE=INNODB CHARSET=UTF8;
-- DESC group_teacher;
-- SHOW COLUMNS FROM group_teacher;

-- one teacher several students, according to the rule:
-- 6-12 months: 4; 13-24 months: 5; 25-35: 6; 36-47: 8; 48-59: 12; 60+: 15
CREATE TABLE IF NOT EXISTS teacher_student (
    teacher_id INT UNSIGNED NOT NULL,
    student_id INT UNSIGNED NOT NULL
)  ENGINE=INNODB CHARSET=UTF8;
-- DESC teacher_student;
-- SHOW COLUMNS FROM teacher_student;

-- Hib, DTaP, Polio, HB, MMR, Varicella
-- 1, 2, 3, 4, 5, 6
CREATE TABLE IF NOT EXISTS vaccine (
    id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    total_dose INT UNSIGNED NOT NULL,
    valid_month INT UNSIGNED NOT NULL,
    days_between_doses_1 INT UNSIGNED,
    days_between_doses_2 INT UNSIGNED,
    days_between_doses_3 INT UNSIGNED,
    name VARCHAR(20) NOT NULL, 
    description VARCHAR(50) NOT NULL,
    is_required_s_t CHAR(1) NOT NULL
)  ENGINE=INNODB CHARSET=UTF8;
-- DESC vaccine;
-- SHOW COLUMNS FROM vaccine;

-- create table records
CREATE TABLE IF NOT EXISTS record (
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
    date_006 DATE,
    require_004 BOOLEAN NOT NULL,
    require_005 BOOLEAN NOT NULL,
    require_006 BOOLEAN NOT NULL
)  ENGINE=INNODB CHARSET=UTF8;
-- DESC record;
-- SHOW COLUMNS FROM record;