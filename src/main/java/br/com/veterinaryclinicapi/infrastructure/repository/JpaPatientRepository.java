package br.com.veterinaryclinicapi.infrastructure.repository;

import br.com.veterinaryclinicapi.infrastructure.bd.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPatientRepository extends JpaRepository<PatientEntity, Long> {

}
