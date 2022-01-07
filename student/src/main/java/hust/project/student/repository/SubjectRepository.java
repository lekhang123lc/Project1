package hust.project.student.repository;

import hust.project.student.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
    @Query(value ="SELECT * FROM mon_hoc", nativeQuery = true)
    List<Subject> findAll();

    @Query(value ="SELECT * FROM mon_hoc where ma_mon=:subject_id", nativeQuery = true)
    Subject findByCode(String subject_id);
}
