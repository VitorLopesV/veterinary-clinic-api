package br.com.veterinarianAPI.infrastructure.repository.impl;

import br.com.veterinarianAPI.domain.model.Patient;
import br.com.veterinarianAPI.domain.repository.PatientRepository;
import br.com.veterinarianAPI.infrastructure.bd.PatientEntity;
import br.com.veterinarianAPI.infrastructure.repository.JpaPatientRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PatientRepositoryImpl implements PatientRepository {

    private final JpaPatientRepository jpaPatientRepository;

    public PatientRepositoryImpl(JpaPatientRepository jpaPatientRepository) {
        this.jpaPatientRepository = jpaPatientRepository;
    }

    @Override
    public Patient save(Patient patient) {
        PatientEntity saved = this.jpaPatientRepository.save(toEntity(patient));
        return toDomain(saved);
    }

    @Override
    public void delete(Patient patient) {
        this.jpaPatientRepository.delete(toEntity(patient));
    }

    @Override
    public List<Patient> findAll() {
        return this.jpaPatientRepository.findAll().stream().map(this::toDomain).collect(Collectors.toList());
    }

    @Override
    public Patient findById(Long id) {
        return this.jpaPatientRepository.findById(id).map(this::toDomain).orElse(null);
    }

    private PatientEntity toEntity(Patient patient) {
        PatientEntity entity = new PatientEntity();
        entity.setName(patient.getName());
        entity.setTutorId(patient.getTutorId());
        entity.setDateOfBirth(patient.getDateOfBirth());
        entity.setWeight(patient.getWeight());
        entity.setRace(patient.getRace());
        entity.setClassification(patient.getClassification());
        entity.setCastrated(patient.isCastrated());
        entity.setSex(patient.getSex());
        return entity;
    }

    private Patient toDomain(PatientEntity entity) {

        return new Patient(entity.getId(), entity.getName(), entity.getTutorId(), entity.getDateOfBirth(),
                entity.getWeight(), entity.getRace(), entity.getClassification(), entity.isCastrated(),
                entity.getSex());
    }
}
