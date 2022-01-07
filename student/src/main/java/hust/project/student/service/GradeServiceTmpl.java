package hust.project.student.service;

import hust.project.student.entity.Grade;
import hust.project.student.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GradeServiceTmpl implements GradeService {
    @Autowired
    private GradeRepository gradeRepository;

    @Override
    public List<Grade> findAll() {
        return (List<Grade>) gradeRepository.findAll();
    }

    public void saveGrade(Grade grade) {
        gradeRepository.save(grade);
    }

    public void deleteGrade(Long id) {
        gradeRepository.deleteById(id);
    }

    public Optional<Grade> findGradeById(Long id) { return gradeRepository.findById(id); }

    @Override
    public Grade findbyCode(String code) {
        return gradeRepository.findByCode(code);
    }

    public Grade findByCode(String code){
        return gradeRepository.findByCode(code);
    }
}
