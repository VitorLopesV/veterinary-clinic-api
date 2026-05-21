package br.com.veterinarianAPI.infrastructure.repository;

import br.com.veterinarianAPI.infrastructure.bd.ConsultationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaConsultationRepository extends JpaRepository<ConsultationEntity, Long> {

}
