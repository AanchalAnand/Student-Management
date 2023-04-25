package com.Student.student;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Repository repository;

    //getting student of given id
    public Student getStudent(int id){
        Student student = repository.findById(id).get();
        return student;
    }

    //adding new student
    public void addStudent(Student student){
        repository.save(student);

    }

    //updating student's mobile number
    public void updateStudent(int id,String mobno){
        Student student = repository.findById(id).get();
        student.setMobileNumber(mobno);
        repository.save(student);
    }

    //deleting student of given id
    public void deleteStudent(int id){
        repository.deleteById(id);
    }
}
