package br.com.veterinarianAPI.infrastructure.repository.impl;

import br.com.veterinarianAPI.domain.model.Patient;
import br.com.veterinarianAPI.domain.repository.PatientRepository;

import java.util.List;

public class JpaPatientRepositoryImpl implements PatientRepository {

    @Override
    public void save(Patient patient) {

    }

    @Override
    public void delete(Patient patient) {

    }

    @Override
    public List<Patient> findAll() {
        return List.of();
    }

    @Override
    public Patient findById(Long id) {
        return null;
    }
}
