package br.com.veterinarianAPI.domain.repository;

import br.com.veterinarianAPI.domain.model.Patient;

import java.util.List;

public interface PatientRepository {

    Patient save(Patient patient);

    void delete(Patient patient);

    List<Patient> findAll();

    Patient findById(Long id);

}
