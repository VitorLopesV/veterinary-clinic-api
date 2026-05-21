package br.com.veterinarianAPI.infrastructure.repository.impl;

import br.com.veterinarianAPI.domain.model.Tutor;
import br.com.veterinarianAPI.domain.repository.TutorRespository;

import java.util.List;

public class TutorRepositoryImpl implements TutorRespository {

    @Override
    public void save(Tutor tutor) {

    }

    @Override
    public void delete(Tutor tutor) {

    }

    @Override
    public List<Tutor> findAll() {
        return List.of();
    }

    @Override
    public Tutor findById(Long id) {
        return null;
    }
}
