package br.com.veterinaryclinicapi.infrastructure.repository.impl;

import br.com.veterinaryclinicapi.domain.model.Tutor;
import br.com.veterinaryclinicapi.domain.repository.TutorRespository;
import br.com.veterinaryclinicapi.infrastructure.bd.TutorEntity;
import br.com.veterinaryclinicapi.infrastructure.mapper.TutorMapper;
import br.com.veterinaryclinicapi.infrastructure.repository.JpaTutorRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TutorRepositoryImpl implements TutorRespository {

    private final JpaTutorRepository jpaTutorRepository;

    private final TutorMapper tutorMapper;

    public TutorRepositoryImpl(JpaTutorRepository jpaTutorRepository, TutorMapper tutorMapper) {
        this.jpaTutorRepository = jpaTutorRepository;
        this.tutorMapper = tutorMapper;
    }

    @Override
    public Tutor save(Tutor tutor) {
        TutorEntity saved = this.jpaTutorRepository.save(tutorMapper.toEntity(tutor)); // Transforma o tutor em
        // tutorEntity
        return tutorMapper.toDomain(saved);// Está voltando o tipo para Tutor
        // Esse procedimento é feito pois não estou usando
        // Tutor como minha entidade mas sim o TutorEntity para isolar o uso de tecnologias externas)

    }

    @Override
    public void delete(Tutor tutor) {
        this.jpaTutorRepository.delete(tutorMapper.toEntity(tutor));
    }

    @Override
    public List<Tutor> findAll() {
        return this.jpaTutorRepository.findAll().stream().map(tutorMapper::toDomain).collect(Collectors.toList());
    }

    @Override
    public Tutor findById(Long id) {
        return this.jpaTutorRepository.findById(id).map(tutorMapper::toDomain).orElse(null);
    }
}
