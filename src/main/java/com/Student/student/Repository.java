package com.Student.student;

import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Student,Integer> {
}
