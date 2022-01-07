package hust.project.student.service;

import hust.project.student.entity.Institute;
import hust.project.student.repository.InstituteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface InstituteService {
    List<Institute> findAll();

    void saveInstitute(Institute institude);

    void deleteInstitute(Long id);

    Optional<Institute> findInstituteById(Long id);
}
