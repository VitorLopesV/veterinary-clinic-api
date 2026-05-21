package br.com.veterinarianAPI.domain.repository;

import br.com.veterinarianAPI.domain.model.Consultation;

import java.util.List;

public interface ConsultationRepository {

    void save(Consultation consultation);

    void delete(Consultation consultation);

    List<Consultation> findAll();

    Consultation findById(Long id);

}
