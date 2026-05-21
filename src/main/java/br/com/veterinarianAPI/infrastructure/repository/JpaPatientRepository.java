package br.com.veterinarianAPI.infrastructure.repository;

import br.com.veterinarianAPI.infrastructure.bd.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPatientRepository extends JpaRepository<PatientEntity, Long> {

}
