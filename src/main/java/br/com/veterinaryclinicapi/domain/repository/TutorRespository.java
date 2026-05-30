package br.com.veterinaryclinicapi.domain.repository;

import br.com.veterinaryclinicapi.domain.model.Tutor;

import java.util.List;

public interface TutorRespository {

    Tutor save(Tutor tutor);

    void delete(Tutor tutor);

    List<Tutor> findAll();

    Tutor findById(Long id);

}
