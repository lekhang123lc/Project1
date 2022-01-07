package hust.project.student.repository;

import hust.project.student.entity.Institute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstituteRepository extends JpaRepository<Institute, Long> {
    @Query(value ="SELECT * FROM khoa_vien", nativeQuery = true)
    List<Institute> findAll();
}
