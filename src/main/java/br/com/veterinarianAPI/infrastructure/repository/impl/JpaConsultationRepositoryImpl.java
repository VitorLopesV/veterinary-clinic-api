package br.com.veterinarianAPI.infrastructure.repository.impl;

import br.com.veterinarianAPI.domain.model.Consultation;
import br.com.veterinarianAPI.domain.repository.ConsultationRepository;

import java.util.List;

public class JpaConsultationRepositoryImpl implements ConsultationRepository {

    @Override
    public void save(Consultation consultation) {

    }

    @Override
    public void delete(Consultation consultation) {

    }

    @Override
    public List<Consultation> findAll() {
        return List.of();
    }

    @Override
    public Consultation findById(Long id) {
        return null;
    }
}
