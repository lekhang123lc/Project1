package hust.project.student.service;

import hust.project.student.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {
    List<Student> findByName(String name);

    void saveStudent(Student student);

    void deleteStudent(Long id);

    Optional<Student> findStudentById(Long id);

    void saveListStudent(List<Student> students);

    List<Student> findAll();
}
