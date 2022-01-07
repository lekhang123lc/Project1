package hust.project.student.service;

import hust.project.student.entity.Subject;
import hust.project.student.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectServiceTmpl implements SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;
    @Autowired
    private ResultService resultService;

    @Override
    public List<Subject> findAll() {
        return (List<Subject>) subjectRepository.findAll();
    }

    public void saveSubject(Subject subject) {
        subjectRepository.save(subject);
        resultService.updateSubject(subject);
    }

    public void deleteSubject(Long id) {
        subjectRepository.deleteById(id);
    }

    public Optional<Subject> findSubjectById(Long id) {
        return subjectRepository.findById(id);
    }
}
