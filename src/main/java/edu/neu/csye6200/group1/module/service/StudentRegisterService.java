package edu.neu.csye6200.group1.module.service;

import edu.neu.csye6200.group1.module.dao.Student;
import edu.neu.csye6200.group1.module.mapper.StudentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StudentRegisterService {
    @Autowired
    StudentsMapper studentsMapper;

    /**
     * student register
     * @param student
     * @param map
     * @return
     */
    public Map register(Student student, Map map){
        studentsMapper.addStudent(student.getGender(),student.getFirstName(),student.getLastName(),student.getGpa(),student.getBirthDate(),student.getRegisterDate(),
                student.getParentFirstName(),student.getParentLastName(),student.getParentPhone(),student.getParentEmail(),student.getParentAddress(),student.getParentGender());
        map.put("msg","Register Successful!");
        return map;
    }
}
