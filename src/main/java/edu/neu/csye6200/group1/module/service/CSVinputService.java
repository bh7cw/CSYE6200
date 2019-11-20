package edu.neu.csye6200.group1.module.service;

import edu.neu.csye6200.group1.module.dao.FileUtil;
import edu.neu.csye6200.group1.module.dao.ImmunizationRecord;
import edu.neu.csye6200.group1.module.dao.Student;
import edu.neu.csye6200.group1.module.dao.Teacher;
import edu.neu.csye6200.group1.module.mapper.StudentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CSVinputService {

    @Autowired
    StudentsMapper studentsMapper;

    public void getStudent(String filename){
        FileUtil fileUtil = new FileUtil();
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        List<ImmunizationRecord> immunizationRecords = new ArrayList<>();

            List<String> list = fileUtil.readTextfile(filename);

            // to check if the csv file is student csv file
            if(filename.toLowerCase().contains(FileUtil.student)){
                for(String csvStudent : list) {
                    Student student = new Student(csvStudent);
                    students.add(student);
                    studentsMapper.addStudent(student.getGender(),student.getFirstName(),student.getLastName(),student.getGpa(),
                            student.getBirthDate(), student.getRegisterDate(),student.getParentFirstName(),student.getParentLastName(),
                            student.getParentPhone(),student.getParentEmail(),student.getParentAddress(),student.getParentGender());
                }
            }
            // to check if the csv file is teacher csv file
            else if(filename.toLowerCase().contains(FileUtil.teacher)){
                for(String csvTeacher : list) teachers.add(new Teacher(csvTeacher));
            }
            // to check if the csv file is immunization record file
            else if(filename.toLowerCase().contains(FileUtil.immunization)){
                for(String csvVaccine : list) immunizationRecords.add(new ImmunizationRecord(csvVaccine));
            }



    }





}

