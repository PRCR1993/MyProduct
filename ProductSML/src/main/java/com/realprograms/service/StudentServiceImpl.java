package com.realprograms.service;

import com.realprograms.model.StudentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl {


    private List<StudentDetails> studentList = new ArrayList<>(Arrays.asList(


            new StudentDetails("s01", "Malli", "Micro Services"),
            new StudentDetails("s02", "Anil", "Rest Api"),
            new StudentDetails("s03","Kalyan","Spring Boot"),
            new StudentDetails("s04","Ram","azure"),
            new StudentDetails("s05","jyothi","Spring Boot"),
            new StudentDetails("s06","kiran","python"),
            new StudentDetails("s07","sudha",".Net"),
            new StudentDetails("s08","lee","Spring boot")

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

    public  void validateFun(){

        List<String> listStr =studentList.stream()
                .filter(s -> s.getCourse().equalsIgnoreCase("Spring Boot"))
                .map(id -> id.getId())
                .collect(Collectors.toList());
        System.out.println("Filter list of stream -->  "+listStr);
    }

    public void newForeachMethod (){

        List<String> list = new ArrayList<String>();   // creating a list

        list.add("car");
        list.add("BUS");
        list.add("vAn");
        list.add("BIke");
        list.add("cyclE");
        list.add("car");

        list.forEach(xlist ->
                System.out.println("print all list of values .."
                        +xlist.toUpperCase()));   //printing the list values

    }
}
