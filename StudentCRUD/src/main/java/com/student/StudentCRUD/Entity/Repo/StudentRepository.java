package com.student.StudentCRUD.Entity.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.StudentCRUD.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
