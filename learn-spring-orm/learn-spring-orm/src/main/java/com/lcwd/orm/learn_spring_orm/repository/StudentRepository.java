package com.lcwd.orm.learn_spring_orm.repository;

import com.lcwd.orm.learn_spring_orm.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
