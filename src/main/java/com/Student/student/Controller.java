package com.Student.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    Service service;

    @GetMapping("/get-student-by-id/{id}")
    public Student getStudent(@PathVariable("id") int id){
        return service.getStudent(id);
    }
    @PostMapping("/add-student")
    public String addStudent(@RequestBody Student student){
        service.addStudent(student);
        return "Student Added";
    }
    @PutMapping("/update-mobile-number")
    public String updateStudent(@RequestParam("id") int id,@RequestParam("newNumber") String mobno){
        service.updateStudent(id,mobno);
        return "Mobile Number Updated";
    }
    @DeleteMapping("/delete-student-by-id")
    public String deleteStudent(@RequestParam("id") int id){
        service.deleteStudent(id);
        return "Student Deleted";
    }
}
