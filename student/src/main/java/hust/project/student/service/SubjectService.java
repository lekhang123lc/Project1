package hust.project.student.service;

import hust.project.student.entity.Subject;
import hust.project.student.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SubjectService {
    List<Subject> findAll();

    void saveSubject(Subject subject);

    void deleteSubject(Long id);

    Optional<Subject> findSubjectById(Long id);
}
