package hust.project.student.service;

import hust.project.student.entity.Semester;
import hust.project.student.entity.Subject;
import hust.project.student.entity.Result;
import hust.project.student.repository.ResultRepository;
import hust.project.student.repository.SemesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SemesterServiceTmpl implements SemesterService {
    @Autowired
    private SemesterRepository semesterRepository;
    @Autowired
    private ResultRepository resultRepository;

    @Override
    public List<Semester> findAll() {
        return (List<Semester>) semesterRepository.findAll();
    }

    @Override
    public List<Semester> findByStudent(long student_id) {
        return (List<Semester>) semesterRepository.findByStudent(student_id);
    }

    public List<Semester> findByStudent(Long student_id) {
        return (List<Semester>) semesterRepository.findByStudent(student_id);
    }

    public void saveSemester(Semester semester) {
        semesterRepository.save(semester);
    }

    public void deleteSemester(Long id) {
        semesterRepository.deleteById(id);
    }

    public Optional<Semester> findSemesterById(Long id) {
        return semesterRepository.findById(id);
    }

    public void updateSubject(Subject subject){
        
    }

    public Integer findStt(long semester, long student_id){
        Integer id = semesterRepository.findStt(semester, student_id);
        if ( id == null ) id=0;
        return id;
    }

    public void updateResult(Result result){
        List<Result> results = resultRepository.findByStudentAndSemester(result.getStudent().getId(), result.getSemester());
        int credit=0, credit_debt=0;
        double sum=0;
        for (Result r : results) {
            if ( r.getFinal_result() != null && r.getProcess_result() != null ) {
                sum += r.typeToPoint()*r.getSubject().getCredit();
                if ( r.getType() == "F" ) credit_debt+=r.getSubject().getCredit();
                else credit+=r.getSubject().getCredit();
            }
            System.out.println("mon nay co so tin: "+r.getSubject().getCredit());
        }

        if ( credit+credit_debt != 0 ){
            double point = (double) Math.round(sum*100.0/(credit+credit_debt)/100.0);
            Integer id = semesterRepository.findStt(result.getSemester(), result.getStudent().getId());
            if ( id == null ) id = 0;
            Semester s = new Semester(id, result.getSemester(), result.getStudent(), credit, credit_debt, point);
            saveSemester(s);
        }
    }

    public Double calcCPA(List<Semester> semesters){
        int credit=0;
        double sum=0;
        for (Semester s : semesters) {
            sum += s.getGPA()*(s.getCredit()+s.getCredit_debt());
            credit += s.getCredit()+s.getCredit_debt();
        }
        System.out.println("tong la:"+ sum+", so tin la: "+credit);
        return (double) Math.round(sum/credit*100.0)/100.0;
    }


}
