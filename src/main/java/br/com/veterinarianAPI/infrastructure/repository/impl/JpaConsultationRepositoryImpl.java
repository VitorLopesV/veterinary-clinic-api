package br.com.veterinarianAPI.infrastructure.repository.impl;

import br.com.veterinarianAPI.domain.model.Consultation;
import br.com.veterinarianAPI.domain.repository.ConsultationRepository;
import br.com.veterinarianAPI.infrastructure.bd.ConsultationEntity;
import br.com.veterinarianAPI.infrastructure.repository.JpaConsultationRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class JpaConsultationRepositoryImpl implements ConsultationRepository {

    private final JpaConsultationRepository repository;

    public JpaConsultationRepositoryImpl(JpaConsultationRepository repository) {
        this.repository = repository;
    }

    @Override
    public Consultation save(Consultation consultation) {
        ConsultationEntity saved = this.repository.save(this.toEntity(consultation));
        return toDomain(saved);
    }

    @Override
    public void delete(Consultation consultation) {
        this.repository.delete(this.toEntity(consultation));
    }

    @Override
    public List<Consultation> findAll() {
        return this.repository.findAll().stream().map(this::toDomain).collect(Collectors.toList());
    }

    @Override
    public Consultation findById(Long id) {
        return this.repository.findById(id).map(this::toDomain).orElse(null);
    }

    private ConsultationEntity toEntity(Consultation consultation) {
        ConsultationEntity entity = new ConsultationEntity();
        entity.setId(consultation.getId());
        entity.setPatientId(consultation.getPatientId());
        entity.setVeterinarianName(consultation.getVeterinarianName());
        entity.setCrmv(consultation.getCrmv());
        entity.setDescription(consultation.getDescription());
        entity.setConsultationDate(consultation.getConsultationDate());

        return entity;
    }

    private Consultation toDomain(ConsultationEntity entity) {
        return new Consultation(entity.getId(), entity.getPatientId(), entity.getVeterinarianName(), entity.getCrmv(),
                entity.getDescription(), entity.getConsultationDate());
    }
}
