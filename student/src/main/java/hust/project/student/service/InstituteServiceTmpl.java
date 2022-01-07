package hust.project.student.service;

import hust.project.student.entity.Institute;
import hust.project.student.repository.InstituteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstituteServiceTmpl implements InstituteService {
    @Autowired
    private InstituteRepository institudeRepository;

    @Override
    public List<Institute> findAll() {
        return (List<Institute>) institudeRepository.findAll();
    }

    public void saveInstitute(Institute institude) {
        institudeRepository.save(institude);
    }

    public void deleteInstitute(Long id) {
        institudeRepository.deleteById(id);
    }

    public Optional<Institute> findInstituteById(Long id) {
        return institudeRepository.findById(id);
    }
}
