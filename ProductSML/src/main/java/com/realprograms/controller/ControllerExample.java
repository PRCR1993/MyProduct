package com.realprograms.controller;



import com.realprograms.model.StudentDetails;
import com.realprograms.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerExample {

        @Autowired
        StudentServiceImpl serviceImpl;


        @RequestMapping("/hello/world")
        public String  firstSample()
        {
        return "First REST API Implementation";
        }


        @GetMapping("/getstudentdetails")
        public List<StudentDetails>  getAllStudentDetails(){
                return serviceImpl.getStudentList();
        }

        @PostMapping("/addStudent")
        public String addStudent(@RequestBody StudentDetails studentDetails){
                serviceImpl.addStudentValues(studentDetails);
                return "Student Added Successfully";
        }

        @PutMapping("/updateStudentDetails/{id}")
        public String updateStudent(@RequestBody StudentDetails studentDetails,
                                    @PathVariable String id){
            serviceImpl.updateStudentValues(studentDetails,id);
            return "Updated Successfully";
        }

        @DeleteMapping("/deleteStudent/{id}")
        public String deleteStudent(
                @PathVariable String id){
            serviceImpl.deleteStudent(id);
            System.out.println("deleted student record");
            return "Deleted Successfully";
        }

}

