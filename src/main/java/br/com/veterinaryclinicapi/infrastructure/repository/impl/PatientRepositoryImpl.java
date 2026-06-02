package br.com.veterinaryclinicapi.infrastructure.repository.impl;

import br.com.veterinaryclinicapi.domain.model.Patient;
import br.com.veterinaryclinicapi.domain.repository.PatientRepository;
import br.com.veterinaryclinicapi.infrastructure.bd.PatientEntity;
import br.com.veterinaryclinicapi.infrastructure.mapper.PatientMapper;
import br.com.veterinaryclinicapi.infrastructure.repository.JpaPatientRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PatientRepositoryImpl implements PatientRepository {

    private final JpaPatientRepository jpaPatientRepository;

    private final PatientMapper patientMapper;

    public PatientRepositoryImpl(JpaPatientRepository jpaPatientRepository, PatientMapper patientMapper) {
        this.jpaPatientRepository = jpaPatientRepository;
        this.patientMapper = patientMapper;
    }

    @Override
    public Patient save(Patient patient) {
        PatientEntity saved = this.jpaPatientRepository.save(patientMapper.toEntity(patient));
        return patientMapper.toDomain(saved);
    }

    @Override
    public void delete(Patient patient) {
        this.jpaPatientRepository.delete(patientMapper.toEntity(patient));
    }

    @Override
    public List<Patient> findAll() {
        return this.jpaPatientRepository.findAll().stream().map(patientMapper::toDomain).collect(Collectors.toList());
    }

    @Override
    public Patient findById(Long id) {
        return this.jpaPatientRepository.findById(id).map(patientMapper::toDomain).orElse(null);
    }
}
