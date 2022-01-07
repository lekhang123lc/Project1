package hust.project.student.service;

import hust.project.student.entity.Grade;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface GradeService {
    List<Grade> findAll();

    void saveGrade(Grade grade);

    void deleteGrade(Long id);

    Optional<Grade> findGradeById(Long id);

    Grade findbyCode(String code);

}
