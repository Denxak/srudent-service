package ait.cohort46.student.dao;

import ait.cohort46.student.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.stream.Stream;

public interface StudentRepository extends CrudRepository<Student, Long> {
    Stream<Student> findByNameIgnoreCase(String name);
}
