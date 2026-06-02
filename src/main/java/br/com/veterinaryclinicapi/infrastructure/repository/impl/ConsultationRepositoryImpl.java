package br.com.veterinaryclinicapi.infrastructure.repository.impl;

import br.com.veterinaryclinicapi.domain.model.Consultation;
import br.com.veterinaryclinicapi.domain.repository.ConsultationRepository;
import br.com.veterinaryclinicapi.infrastructure.bd.ConsultationEntity;
import br.com.veterinaryclinicapi.infrastructure.mapper.ConsultationMapper;
import br.com.veterinaryclinicapi.infrastructure.repository.JpaConsultationRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ConsultationRepositoryImpl implements ConsultationRepository {

    private final JpaConsultationRepository jpaConsultationRepository;

    private final ConsultationMapper consultationMapper;

    public ConsultationRepositoryImpl(JpaConsultationRepository jpaConsultationRepository,
                                      ConsultationMapper consultationMapper) {
        this.jpaConsultationRepository = jpaConsultationRepository;
        this.consultationMapper = consultationMapper;
    }

    @Override
    public Consultation save(Consultation consultation) {
        ConsultationEntity saved = this.jpaConsultationRepository.save(consultationMapper.toEntity(consultation));
        return consultationMapper.toDomain(saved);
    }

    @Override
    public void delete(Consultation consultation) {
        this.jpaConsultationRepository.delete(consultationMapper.toEntity(consultation));
    }

    @Override
    public List<Consultation> findAll() {
        return this.jpaConsultationRepository.findAll().stream().map(consultationMapper::toDomain).collect(
                Collectors.toList());
    }

    @Override
    public Consultation findById(Long id) {
        return this.jpaConsultationRepository.findById(id).map(consultationMapper::toDomain).orElse(null);
    }
}
