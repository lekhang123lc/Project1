package hust.project.student.service;

import hust.project.student.entity.Grade;
import hust.project.student.entity.Student;
import hust.project.student.repository.GradeRepository;
import hust.project.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceTmpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private GradeRepository gradeRepository;

    public List<Student> findByName(String name) {
        return (List<Student>) studentRepository.findAll(name);
    }

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Optional<Student> findStudentById(Long id) { return studentRepository.findById(id); }

    public void saveListStudent(List<Student> students){
        for(Student student : students){
            Grade g = gradeRepository.findByCode(student.getGrade().getCode());
            student.setGrade(g);
            saveStudent(student);
        }
    }

    @Override
    public List<Student> findAll() { return studentRepository.findAll(); }
}
