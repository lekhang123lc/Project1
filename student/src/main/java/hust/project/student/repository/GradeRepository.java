package hust.project.student.repository;

import hust.project.student.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {
    @Query(value ="SELECT * FROM lop", nativeQuery = true)
    List<Grade> findAll();

    @Query(value ="SELECT * FROM lop WHERE ma_lop=:code", nativeQuery = true)
    Grade findByCode(String code);
}
