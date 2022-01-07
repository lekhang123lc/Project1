package hust.project.student.service;

import hust.project.student.entity.Result;
import hust.project.student.entity.Subject;
import hust.project.student.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResultServiceTmpl implements ResultService {
    @Autowired
    private ResultRepository resultRepository;
    @Autowired
    private SemesterService semesterService;

    @Override
    public List<Result> findAll() {
        return (List<Result>) resultRepository.findAll();
    }

    public List<Result> findBySubject(long subject_id) {
        return (List<Result>) resultRepository.findBySubject(subject_id);
    }

    public List<Result> findBySubjectAndSemester(long subject_id, long semester){
        return (List<Result>) resultRepository.findBySubjectAndSemester(subject_id, semester);
    }
    
    public List<Result> findByStudentAndSemester(long semester, long student_id) {
        return (List<Result>) resultRepository.findByStudentAndSemester(semester, student_id);
    }

    public void saveResult(Result result) {
        if ( result.getFinal_result() != null && result.getProcess_result() != null ){
            result.calcSummary();
        }
        resultRepository.save(result);
        semesterService.updateResult(result);
    }

    public void deleteResult(Long id) {
        resultRepository.deleteById(id);
    }

    public Optional<Result> findResultById(Long id) {
        return resultRepository.findById(id);
    }

    public void updateSubject(Subject subject){
        List<Result> results = resultRepository.findBySubject(subject.getId());
        for (Result r : results) {
            saveResult(r);
        }
    }

    public void saveListResult(List<Result> results){
        for(Result r : results){
            saveResult(r);
        }
    }

}
