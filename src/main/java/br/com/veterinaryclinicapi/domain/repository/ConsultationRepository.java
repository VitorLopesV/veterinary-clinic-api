package br.com.veterinaryclinicapi.domain.repository;

import br.com.veterinaryclinicapi.domain.model.Consultation;

import java.util.List;

public interface ConsultationRepository {

    Consultation save(Consultation consultation);

    void delete(Consultation consultation);

    List<Consultation> findAll();

    Consultation findById(Long id);

}
