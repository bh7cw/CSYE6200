-- already exist students
-- 6-12: 4 20191125now 	 20181125-20190525
INSERT student(student_id, gender, first_name, last_name, gpa, birth_date, register_date, 
parent_first_name, parent_last_name, parent_phone, parent_email, parent_address, parent_gender) 
VALUES(NULL, 'M', 'Jimmy', 'Green', '85', '2018-12-03', '2019-03-04',
'Lily', 'Green', '111-111-1111', 'lily@gmail.com', '9 Washington Street, Boston, MA', 'F'),
(NULL, 'F', 'Sally', 'Smith', '90', '2019-01-05', '2019-03-04', 
'Lucy', 'Smith', '222-111-1111', 'lucy@gmail.com', '19 Washington Street, Boston, MA', 'F'),
(NULL, 'F', 'Lizzy', 'Johnson', '78', '2019-02-23', '2019-03-04', 
'Mary', 'Johnson', '333-111-1111', 'mary@gmail.com', '29 Washington Street, Boston, MA', 'F'),
(NULL, 'M', 'Markie', 'Williams', '96', '2019-03-19', '2019-03-04', 
'Bill', 'Williams', '444-111-1111', 'bill@gmail.com', '7 Green Street, Boston, MA', 'M'),
-- 13-24: 5 	20171125-20181125
(NULL, 'M', 'Johnny', 'Jones', '72', '2018-08-08', '2019-03-04',
'Daniel', 'Jones', '555-111-1111', 'daniel@gmail.com', '29 Green Street, Boston, MA', 'M'),
(NULL, 'M', 'Bobby', 'Brown', '86', '2018-06-01', '2019-03-04',
'Bonnie', 'Brown', '666-111-1111', 'bonnie@gmail.com', '19 Green Street, Boston, MA', 'F'),
(NULL, 'M', 'Bill', 'Miller', '76', '2018-04-08', '2019-03-04',
'Stefan', 'Miller', '777-111-1111', 'stefan@gmail.com', '129 Huntington Street, Boston, MA', 'M'),
(NULL, 'M', 'Bear', 'Moore', '88', '2018-01-01', '2019-03-04',
'Ava', 'Moore', '888-111-1111', 'ava@gmail.com', '109 Huntington Street, Boston, MA', 'F'),
(NULL, 'M', 'Dameon', 'Taylor', '79', '2017-12-29', '2019-03-04',
'Dan', 'Taylor', '999-111-1111', 'dan@gmail.com', '209 Green Street, Boston, MA', 'M'),
-- 25-35: 6		20161125-20171125
(NULL, 'F', 'Emma', 'Thomas', '92', '2017-09-08', '2019-03-04',
'Olivia', 'Thomas', '111-311-1111', 'olivia@gmail.com', '29 Shill Street, Boston, MA', 'F'),
(NULL, 'F', 'Ava', 'Jackson', '89', '2017-08-08', '2019-03-04',
'Isabella', 'Jackson', '111-411-1111', 'isebella@gmail.com', '209 Shill Street, Boston, MA', 'F'),
(NULL, 'F', 'Sophia', 'White', '99', '2017-07-08', '2019-03-04',
'Amelia', 'White', '111-511-1111', 'amelia@gmail.com', '99 Shill Street, Boston, MA', 'F'),
(NULL, 'F', 'Emily', 'Harris', '77', '2017-05-08', '2019-03-04',
'Elizabeth', 'Harris', '111-611-1111', 'elizabeth@gmail.com', '29 Robison Street, Boston, MA', 'F'),
(NULL, 'F', 'Mila', 'Martin', '66', '2017-04-08', '2019-03-04',
'Ella', 'Martin', '111-711-1111', 'ella@gmail.com', '9 Robison Street, Boston, MA', 'F'),
(NULL, 'F', 'Avery', 'Thompson', '82', '2017-03-08', '2019-03-04',
'Sofia', 'Thompson', '111-811-1111', 'sofia@gmail.com', '109 Robison Street, Boston, MA', 'F'),
-- 36-47: 8		20151125-20161125
(NULL, 'M', 'Aaron', 'Garcia', '92', '2016-04-08', '2019-03-04',
'Abe', 'Garcia', '111-911-1111', 'abe@gmail.com', '209 Robison Street, Boston, MA', 'M'),
(NULL, 'M', 'Abram', 'Martinez', '76', '2016-10-08', '2019-03-04',
'Allen', 'Martinez', '111-121-1111', 'allen@gmail.com', '29 Snell Street, Boston, MA', 'M'),
(NULL, 'M', 'Alva', 'Robinson', '90', '2016-09-08', '2019-03-04',
'Amado', 'Robinson', '111-131-1111', 'amado@gmail.com', '109 Snell Street, Boston, MA', 'M'),
(NULL, 'M', 'Anderson', 'Clark', '72', '2016-07-08', '2019-03-04',
'Ali', 'Clark', '111-141-1111', 'ali@gmail.com', '209 Snell Street, Boston, MA', 'M'),
(NULL, 'M', 'Antone', 'Lewis', '72', '2016-06-08', '2019-03-04',
'Ariel', 'Lewis', '111-151-1111', 'ariel@gmail.com', '309 Snell Street, Boston, MA', 'M'),
(NULL, 'M', 'Aron', 'Lee', '72', '2016-03-08', '2019-03-04',
'Martin', 'Lee', '111-161-1111', 'martin@gmail.com', '369 Snell Street, Boston, MA', 'M'),
(NULL, 'M', 'Noe', 'Walker', '72', '2016-02-08', '2019-03-04',
'Nick', 'Walker', '111-171-1111', 'nick@gmail.com', '29 Dino Street, Boston, MA', 'M'),
(NULL, 'M', 'Neil', 'Allen', '72', '2016-01-08', '2019-03-04',
'Ned', 'Allen', '111-181-1111', 'ned@gmail.com', '109 Dino Street, Boston, MA', 'M'),
-- 48-59: 6		20141125-20151125
(NULL, 'M', 'Leo', 'Young', '72', '2015-09-08', '2019-03-04',
'Lou', 'Young', '111-191-1111', 'lou@gmail.com', '69 Dino Street, Boston, MA', 'M'),
(NULL, 'M', 'Larry', 'King', '72', '2015-08-08', '2019-03-04',
'Lane', 'King', '111-112-1111', 'lane@gmail.com', '209 Dino Street, Boston, MA', 'M'),
(NULL, 'M', 'Lacy', 'Wright', '72', '2015-07-08', '2019-03-04',
'Larry', 'Wright', '111-113-1111', 'larry@gmail.com', '309 Dino Street, Boston, MA', 'M'),
(NULL, 'M', 'Hollis', 'Hill', '72', '2015-04-08', '2019-03-04',
'Henry', 'Hill', '111-114-1111', 'henry@gmail.com', '409 Dino Street, Boston, MA', 'M'),
(NULL, 'F', 'Sophia', 'Anderson', '80', '2015-02-01', '2019-03-04',
'Mia', 'Anderson', '111-211-1111', 'mia@gmail.com', '19 Shill Street, Boston, MA', 'F'),

-- 60+: 6		20121125-20141125
(NULL, 'F', 'Lucy', 'Roberts', '72', '2014-08-08', '2019-03-04',
'Anna', 'Roberts', '111-111-1111', 'anna@gmail.com', '29 Red Street, Boston, MA', 'F'),
(NULL, 'F', 'Caroline', 'Turner', '72', '2014-06-08', '2019-03-04',
'Nova', 'Turner', '111-311-1111', 'nova@gmail.com', '19 Red Street, Boston, MA', 'F'),
(NULL, 'F', 'Everly', 'Phillips', '72', '2013-10-08', '2019-03-04',
'Emilia', 'Phillips', '111-311-1111', 'emilia@gmail.com', '39 Red Street, Boston, MA', 'F'),
(NULL, 'F', 'Maya', 'Parker', '72', '2013-04-08', '2018-09-04',
'Willow', 'Parker', '111-311-1111', 'willow@gmail.com', '49 Red Street, Boston, MA', 'F'),
(NULL, 'F', 'Naomi', 'Evans', '72', '2013-01-08', '2018-09-04',
'Elena', 'Evans', '111-311-1111', 'elena@gmail.com', '109 Red Street, Boston, MA', 'F');

-- 10 teacher registered this year, 1 last yer
INSERT teacher(teacher_id, gender, first_name, last_name, credits, wage, register_date) 
VALUES(NULL, 'M', 'Adam', 'Smith', '99','20000.00','2019-09-04'),
(NULL, 'M', 'Noah', 'Johnson', '89','15000.00','2019-08-04'),
(NULL, 'F', 'Kathy', 'Williams', '97','19000.00','2019-07-04'),
(NULL, 'F', 'Emma', 'Brown', '69','10300.00','2019-06-04'),
(NULL, 'M', 'Logan', 'Davis', '79','10010.00','2019-05-04'),
(NULL, 'F', 'Olivia', 'Wilson', '92','10020.00','2019-04-04'),
(NULL, 'F', 'Emy', 'Thompson', '82','10060.00','2019-03-04'),
(NULL, 'F', 'Penny', 'White', '72','10120.00','2019-02-04'),
(NULL, 'F', 'Monica', 'Roberts', '99','11120.00','2019-01-04'),
(NULL, 'F', 'Leah', 'Wang', '59','13120.00','2018-09-04');

-- half students with immune info
INSERT group_info(group_info_id, low, high) VALUES(NULL, 6, 12),
(NULL, 13, 24),
(NULL, 25, 35),
(NULL, 36, 47),
(NULL, 48, 59),
(NULL, 60, 90);

INSERT classroom(classroom_id) VALUES(NULL),(NULL),(NULL);
-- SELECT * FROM classroom;

INSERT classroom_group_info(cg_record_id, classroom_id, group_info_id) VALUES(NULL, '1','1'), (NULL, '1','2'), (NULL, '1','3'),(NULL, '2','4'),(NULL,'2','5'),(NULL, '2','6');

-- SELECT * FROM classroom_group;

INSERT group_info_teacher(gt_record_id,group_info_id, teacher_id) VALUES(NULL, '1', '1'),(NULL, '2','2'),(NULL,'3','3'),(NULL,'4','4'),(NULL,'5','5'),(NULL,'6','6'),
(NULL,'7','7'),(NULL,'8','8'),(NULL,'9','9'),(NULL,'10','10');

-- SELECT * FROM group_teacher;

-- one teacher several students, according to the rule:
-- 6-12 months: 4; 13-24 months: 5; 25-35: 6; 36-47: 8; 48-59: 12; 60+: 15
-- 4 5 6 8 6 6
-- 4 9 15 23 29 35

INSERT teacher_student(teacher_id, student_id) VALUES('1','1'),('1','2'),('1','3'),('1','4'),('2','5'),('2','6'),('2','7'),('2','8'),('2','9'),
('3','10'),('3','11'),('3','12'),('3','13'),('3','14'),('3','15'),('4','16'),('4','17'),('4','18'),('4','19'),('4','20'),('4','21'),('4','22'),('4','23'),
('5','24'),('5','25'),('5','26'),('5','27'),('5','28'),('5','29'),('6','30'),('6','31'),('6','32'),('6','33'),('6','34'),('6','35');

-- SELECT * FROM teacher_student;

-- Hib, DTaP, Polio, HB, MMR, Varicella
-- 1, 2, 3, 4, 5, 6

INSERT vaccine(id, total_dose, valid_month, days_between_doses_1, days_between_doses_2, days_between_doses_3, name, description, is_required_s_t) 
VALUES(NULL, '2', '12', '15', NULL, NULL, 'Hib', 'Other details of vaccine', 'F'),
(NULL, '4', '24', '17', '17', '25', 'DTaP', 'Other details of vaccine', 'F'), 
(NULL, '3', '15', '20', '20', NULL, 'Polio', 'Other details of vaccine', 'F'), 
(NULL, '3', '16', '30', '30', '35', 'HB', 'Other details of vaccine', 'T'), 
(NULL, '1', '8', NULL, NULL, NULL, 'MMR', 'Other details of vaccine', 'T'),
(NULL, '1', '6', NULL, NULL, NULL, 'Varicella', 'Other details of vaccine', 'T');

-- SELECT * FROM vaccine;

insert record(stu_id, dose_001, date_001, dose_002, date_002, dose_003, date_003, dose_004, date_004, dose_005, date_005, dose_006, date_006, require_004, require_005, require_006) 
VALUES('1', '0', NULL, '1', '2019-08-06', '1', '2018-08-06', '2', '2017-08-05', '3', '2018-08-06', '2', '2019-08-05', '0', '1', '0'),
('2', '0', NULL, '1', '2019-08-06', '1', '2017-08-06', '1', '2017-08-05', '2', '2018-08-06', '2', '2019-08-05', '0', '1', '0'),
('3', '0', NULL, '1', '2019-08-06', '1', '2018-08-06', '2', '2017-08-05', '1', '2018-08-06', '1', '2019-08-05', '0', '1', '0'),
('4', '0', NULL, '1', '2019-08-06', '1', '2018-08-06', '2', '2019-08-05', '3', '2018-08-06', '2', '2019-08-05', '0', '1', '0'),
('5', '0', NULL, '1', '2019-08-06', '1', '2017-08-06', '1', '2017-08-05', '2', '2018-08-06', '2', '2019-08-05', '0', '1', '0'),
('6', '0', NULL, '1', '2019-08-06', '1', '2018-08-06', '2', '2017-08-05', '1', '2018-08-06', '1', '2019-08-05', '0', '1', '0'),
('7', '0', NULL, '1', '2019-08-06', '1', '2018-08-06', '2', '2018-08-05', '3', '2018-08-06', '2', '2019-08-05', '0', '1', '0'),
('8', '0', NULL, '1', '2019-08-06', '1', '2017-08-06', '1', '2017-08-05', '2', '2018-08-06', '2', '2019-08-05', '0', '1', '0'),
('9', '0', NULL, '1', '2019-08-06', '1', '2018-08-06', '2', '2017-08-05', '1', '2018-08-06', '1', '2019-08-05', '0', '1', '0'),
('10', '0', NULL, '1', '2019-08-06', '1', '2018-08-06', '2', '2017-08-05', '3', '2018-08-06', '2', '2019-08-05', '0', '1', '0'),
('11', '0', NULL, '1', '2019-08-06', '1', '2017-08-06', '1', '2017-08-05', '2', '2018-08-06', '2', '2019-08-05', '0', '1', '0'),
('12', '0', NULL, '1', '2019-08-06', '1', '2018-08-06', '2', '2017-09-05', '1', '2018-08-06', '1', '2019-08-05', '0', '1', '0'),
('13', '0', NULL, '1', '2019-08-06', '1', '2018-08-06', '2', '2019-08-05', '3', '2018-08-06', '2', '2019-08-05', '0', '1', '0'),
('14', '0', NULL, '1', '2019-08-06', '1', '2017-08-06', '1', '2017-08-05', '2', '2018-08-06', '2', '2019-08-05', '0', '1', '0'),
('15', '0', NULL, '1', '2019-08-06', '1', '2018-08-06', '2', '2017-08-05', '1', '2018-08-06', '1', '2019-08-05', '0', '1', '0'),
('16', '0', NULL, '1', '2019-08-06', '1', '2018-08-06', '2', '2017-08-05', '3', '2018-08-06', '2', '2019-08-05', '0', '1', '0');
