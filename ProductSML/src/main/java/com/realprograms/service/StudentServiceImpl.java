package com.realprograms.service;

import com.realprograms.model.StudentDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceImpl {

    private List<StudentDetails> studentList = new ArrayList<>(Arrays.asList(


            new StudentDetails("s01", "Malli", "Micro Services"),
            new StudentDetails("s02", "Anil", "Rest Api"),
            new StudentDetails("s03","Kalyan","Spring Boot")

    ));

    public List<StudentDetails> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<StudentDetails> studentList) {
        this.studentList = studentList;
    }

    public void addStudentValues(StudentDetails studentDetails)
    {
        studentList.add(studentDetails);

    }

    public void updateStudentValues(StudentDetails studentDetails, String id) {
        int value = 0;
        for(StudentDetails details  : studentList){
            if(details.getId().equals(id)){
                studentList.set(value,studentDetails);
            }
            value++;
        }
    }

    public void deleteStudent(String studid) {
        System.out.println("entered into loop - " +studid);
        studentList.removeIf(studentDetails -> studentDetails.getId().equals(studid));
    }
}
