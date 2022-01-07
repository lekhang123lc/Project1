package hust.project.student.repository;

import hust.project.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value ="SELECT * FROM sinh_vien where ten LIKE %:name% order by mssv", nativeQuery = true)
    List<Student> findAll(String name);
    @Query(value ="SELECT * FROM sinh_vien where mssv=:id", nativeQuery = true)
    Student findById(long id);
}
