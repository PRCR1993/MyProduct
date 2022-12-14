package com.realprograms.controller;



import com.realprograms.j8features.Integration;
import com.realprograms.j8features.OptionalclassExample;
import com.realprograms.model.StudentDetails;
import com.realprograms.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerExample {

        @Autowired
        StudentServiceImpl serviceImpl;

        Integration integration ;

        OptionalclassExample optional = new OptionalclassExample();


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

        @RequestMapping("/valid/foreach")
        public String  firstForEach()
        {
                serviceImpl.newForeachMethod();
                return "List of filters added...";
        }

        @RequestMapping("/valid/jv8")
        public String  validstreamApi()
        {
                serviceImpl.validateFun();
                optional.joiner();
                return "validating stream and filters";
        }

        @RequestMapping("/features/added")
        public String  newFeaturesj8()
        {
                integration = new Integration();     // intilization of object;
                //integration.sampleMethod();
                optional.Optionalmethod();
                return "success";
        }

        @RequestMapping("/date/time")
        public String  dateandtime()
        {
                integration = new Integration();
                integration.dateAndTimeApiExample();
                integration.sampleMethod();
                return "printing date and time";
        }

}

