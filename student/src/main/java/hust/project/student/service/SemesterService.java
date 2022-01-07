package hust.project.student.service;

import hust.project.student.entity.Result;
import hust.project.student.entity.Semester;
import hust.project.student.entity.Subject;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SemesterService {
    List<Semester> findAll();

    List<Semester> findByStudent(long id);

    void saveSemester(Semester semester);

    void deleteSemester(Long id);

    Optional<Semester> findSemesterById(Long id);

    void updateSubject(Subject subject);

    void updateResult(Result result);

    Double calcCPA(List<Semester> s);

    Integer findStt(long semester, long student_id);
}
