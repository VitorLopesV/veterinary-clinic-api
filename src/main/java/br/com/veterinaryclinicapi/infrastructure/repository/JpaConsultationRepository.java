package br.com.veterinaryclinicapi.infrastructure.repository;

import br.com.veterinaryclinicapi.infrastructure.bd.ConsultationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaConsultationRepository extends JpaRepository<ConsultationEntity, Long> {

}
