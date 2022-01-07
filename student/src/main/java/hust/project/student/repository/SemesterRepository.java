package hust.project.student.repository;

import hust.project.student.entity.Semester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SemesterRepository extends JpaRepository<Semester, Long> {
    @Query(value ="SELECT * FROM ket_qua_ky_hoc order by ky_hoc desc", nativeQuery = true)
    List<Semester> findAll();

    @Query(value ="SELECT * FROM ket_qua_ky_hoc WHERE mssv = :student_id order by ky_hoc desc", nativeQuery = true)
    List<Semester> findByStudent(long student_id);

    @Query(value ="SELECT stt FROM ket_qua_ky_hoc WHERE mssv = :student_id and ky_hoc = :semester", nativeQuery = true)
    Integer findStt(long semester, long student_id);
}
