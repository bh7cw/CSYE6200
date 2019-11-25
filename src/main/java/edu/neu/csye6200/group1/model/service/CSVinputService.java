package edu.neu.csye6200.group1.model.service;

import edu.neu.csye6200.group1.model.dao.FileUtil;
import edu.neu.csye6200.group1.model.dao.ImmunizationRecord;
import edu.neu.csye6200.group1.model.dao.Student;
import edu.neu.csye6200.group1.model.dao.Teacher;
import edu.neu.csye6200.group1.model.mapper.StudentsMapper;
import edu.neu.csye6200.group1.model.mapper.TeacherMapper;
import edu.neu.csye6200.group1.model.mapper.VaccineRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The Service for csv file input
 */
@Service
public class CSVinputService {

    @Autowired
    StudentsMapper studentsMapper;

    @Autowired
    TeacherMapper teacherMapper;

    @Autowired
    VaccineRecordMapper vaccineRecordMapper;

    /**
     * create objects based on the input csv file
     * @param filename the file injected
     */
    public void injectCSV(String filename){
        FileUtil fileUtil = new FileUtil();

            List<String> list = fileUtil.readTextfile(filename);

            // to check if the csv file is student csv file
            if(filename.toLowerCase().contains(FileUtil.student)){
                for(String csvStudent : list) {
                    Student student = new Student(csvStudent);
                    Integer id = studentsMapper.findStuByName(student.getFirstName(),student.getLastName(),
                            student.getParentFirstName(),student.getParentLastName());
                    System.out.println(id);
//                    students.add(student);
                    if(id != null)
                        studentsMapper.updateStudent(student.getGender(),student.getGpa(),
                                student.getParentPhone(), student.getParentEmail(),student.getParentAddress(),
                                student.getBirthDate(),student.getRegisterDate(),id);
                    else
                        studentsMapper.addStudent(student.getGender(),student.getFirstName(),student.getLastName(),student.getGpa(),
                                student.getBirthDate(), student.getRegisterDate(),student.getParentFirstName(),student.getParentLastName(),
                                student.getParentPhone(),student.getParentEmail(),student.getParentAddress(),student.getParentGender());
                }
            }
            // to check if the csv file is teacher csv file
            else if(filename.toLowerCase().contains(FileUtil.teacher)){
                for(String csvTeacher : list) {
                    Teacher teacher = new Teacher(csvTeacher);
                    Integer id = teacherMapper.findTeacherByName(teacher.getFirstName(),teacher.getLastName());
                    if(id != null)
                        teacherMapper.updateTeacher(teacher.getGender(),teacher.getCredits(),teacher.getWage(),
                                teacher.getRegisterDate(),id);
                    else
                        teacherMapper.addTeacher(teacher.getGender(),teacher.getFirstName(),teacher.getLastName(),
                                teacher.getCredits(),teacher.getWage(),teacher.getRegisterDate());
                }
            }
            // to check if the csv file is immunization record file
            else if(filename.toLowerCase().contains(FileUtil.immunization)){
                for(String csvVaccine : list) {
                    ImmunizationRecord immunizationRecord = new ImmunizationRecord(csvVaccine);
                    Integer id = immunizationRecord.getStuID();
                    if(studentsMapper.findStuById(id) != null) {
                        if (vaccineRecordMapper.getStuVaccine(id) != null)
                            vaccineRecordMapper.updateAllVaccineRc(id,immunizationRecord.getDose001(),immunizationRecord.getDate001(),
                                    immunizationRecord.getDose002(),immunizationRecord.getDate002(),immunizationRecord.getDose003(),
                                    immunizationRecord.getDate003(),immunizationRecord.getDose004(),immunizationRecord.getDate004(),
                                    immunizationRecord.getDose005(),immunizationRecord.getDate005(),immunizationRecord.getDose006(),
                                    immunizationRecord.getDate006(),immunizationRecord.isRequire004(),immunizationRecord.isRequire005(),
                                    immunizationRecord.isRequire006());
                        else
                            vaccineRecordMapper.addrecord(id,immunizationRecord.getDose001(),immunizationRecord.getDate001(),
                                    immunizationRecord.getDose002(),immunizationRecord.getDate002(),immunizationRecord.getDose003(),
                                    immunizationRecord.getDate003(),immunizationRecord.getDose004(),immunizationRecord.getDate004(),
                                    immunizationRecord.getDose005(),immunizationRecord.getDate005(),immunizationRecord.getDose006(),
                                    immunizationRecord.getDate006(), immunizationRecord.isRequire004(),immunizationRecord.isRequire005(),
                                    immunizationRecord.isRequire006());
                    }
                    else continue;
                };
            }



    }





}

