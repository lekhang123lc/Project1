package hust.project.student.repository;

import hust.project.student.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {
    @Query(value ="SELECT * FROM ket_qua_hoc_tap", nativeQuery = true)
    List<Result> findAll();

    @Query(value ="SELECT * FROM ket_qua_hoc_tap WHERE mon = :subject_id", nativeQuery = true)
    List<Result> findBySubject(long subject_id);

    @Query(value ="SELECT * FROM ket_qua_hoc_tap WHERE mon = :subject_id and ky_hoc = :semester", nativeQuery = true)
    List<Result> findBySubjectAndSemester(long subject_id, long semester);

    @Query(value ="SELECT * FROM ket_qua_hoc_tap WHERE mssv = :student_id and ky_hoc = :semester", nativeQuery = true)
    List<Result> findByStudentAndSemester(long student_id, long semester);

    @Query(value ="SELECT stt FROM ket_qua_hoc_tap WHERE mssv = :student_id and mon = :subject_id and ky_hoc = :semester", nativeQuery = true)
    Long findStt(long student_id, long subject_id, int semester);
}
