-- inserting students:
-- 6-12: 2		20181125-20190525
INSERT student(student_id, gender, first_name, last_name, gpa, birth_date, register_date, 
parent_first_name, parent_last_name, parent_phone, parent_email, parent_address, parent_gender) 
VALUES(NULL, 'F', 'Linda', 'Li', '82', '2019-03-28', '2019-09-04',
'Yuan', 'Li', '111-411-1111', 'yuanli@gmail.com', '19 Blue Street, Boston, MA', 'F'),
(NULL, 'F', 'Jane', 'Zhang', '92', '2019-01-18', '2019-09-04',
'Bruce', 'Zhang', '111-511-1111', 'brucez@gmail.com', '39 Blue Street, Boston, MA', 'M'),


-- 48-59: 6		20141125-20151125
(NULL, 'M', 'Blank', 'Que', '90', '2015-10-28', '2019-09-04',
'Frank', 'Que', '111-411-1111', 'que@gmail.com', '109 Blue Street, Boston, MA', 'M'),
(NULL, 'M', 'Mark', 'Yu', '80', '2015-09-18', '2019-09-04',
'Stefen', 'Yu', '111-511-1111', 'yustefen@gmail.com', '309 Blue Street, Boston, MA', 'M'),
(NULL, 'F', 'Anna', 'Zang', '79', '2015-08-28', '2019-09-04',
'Amanda', 'Zang', '111-611-1111', 'amanda@gmail.com', '19 White Street, Boston, MA', 'F'),
(NULL, 'F', 'Rose', 'Bai', '77', '2015-07-18', '2019-09-04',
'Lia', 'Bai', '111-711-1111', 'liabai@gmail.com', '39 White Street, Boston, MA', 'F'),
(NULL, 'F', 'Mary', 'Lian', '66', '2015-06-28', '2019-09-04',
'Patricia', 'Lian', '111-811-1111', 'patricia@gmail.com', '109 White Street, Boston, MA', 'F'),
(NULL, 'M', 'Jack', 'Chen', '88', '2015-05-18', '2018-09-04',
'Chandler', 'Chen', '111-911-1111', 'chandler@gmail.com', '309 White Street, Boston, MA', 'M');
-- all this year, 1-2 last year

INSERT group_info(group_info_id, low, high) VALUES(NULL, 6, 12),
(NULL, 48, 59);

INSERT classroom_group_info(cg_record_id, classroom_id, group_info_id) VALUES(NULL, '3','7'), (NULL, '3','8');

INSERT teacher_student(teacher_id, student_id) VALUES('7','36'),('7','37'),('8','38'),('8','39'),('8','40'),('8','41'),('8','42'),('8','43');
