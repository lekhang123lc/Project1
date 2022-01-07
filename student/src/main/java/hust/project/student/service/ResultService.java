package hust.project.student.service;

import hust.project.student.entity.Result;
import hust.project.student.entity.Subject;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ResultService {
    List<Result> findAll();

    List<Result> findBySubject(long id);

    List<Result> findByStudentAndSemester(long semester, long student_id);

    List<Result> findBySubjectAndSemester(long subject_id, long semester);

    void saveResult(Result result);

    void deleteResult(Long id);

    Optional<Result> findResultById(Long id);

    void updateSubject(Subject subject);

    void saveListResult(List<Result> results);
}
