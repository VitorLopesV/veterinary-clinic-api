package br.com.veterinarianAPI.domain.repository;

import br.com.veterinarianAPI.domain.model.Tutor;

import java.util.List;

public interface TutorRespository {

    void save(Tutor tutor);

    void delete(Tutor tutor);

    List<Tutor> findAll();

    Tutor findById(Long id);

}
