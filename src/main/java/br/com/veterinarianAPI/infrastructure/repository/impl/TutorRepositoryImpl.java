package br.com.veterinarianAPI.infrastructure.repository.impl;

import br.com.veterinarianAPI.domain.model.Tutor;
import br.com.veterinarianAPI.domain.repository.TutorRespository;
import br.com.veterinarianAPI.infrastructure.bd.TutorEntity;
import br.com.veterinarianAPI.infrastructure.repository.JpaTutorRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TutorRepositoryImpl implements TutorRespository {

    private final JpaTutorRepository jpaTutorRepository;

    public TutorRepositoryImpl(JpaTutorRepository jpaTutorRepository) {
        this.jpaTutorRepository = jpaTutorRepository;
    }

    @Override
    public Tutor save(Tutor tutor) {
        TutorEntity saved = jpaTutorRepository.save(toEntity(tutor)); // Transforma o tutor em tutorEntity
        return toDomain(saved);// Está voltando o tipo para Tutor
        // Esse procedimento é feito pois não estou usando
        // Tutor como minha entidade mas sim o TutorEntity para isolar o uso de tecnologias externas)

    }

    @Override
    public void delete(Tutor tutor) {
        jpaTutorRepository.delete(toEntity(tutor));
    }

    @Override
    public List<Tutor> findAll() {
        return jpaTutorRepository.findAll()
                .stream()
                .map(this::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Tutor findById(Long id) {
        return jpaTutorRepository.findById(id)
                .map(this::toDomain)
                .orElse(null);
    }

    private TutorEntity toEntity(Tutor tutor) {
        TutorEntity entity = new TutorEntity();
        entity.setId(tutor.getId());
        entity.setName(tutor.getName());
        entity.setEmail(tutor.getEmail());
        entity.setCpf(tutor.getCpf());
        entity.setPhone(tutor.getPhone());
        entity.setAddress(tutor.getAddress());
        return entity;
    }

    private Tutor toDomain(TutorEntity entity) {
        return new Tutor(
                entity.getId(),
                entity.getName(),
                entity.getEmail(),
                entity.getCpf(),
                entity.getPhone(),
                entity.getAddress()
        );
    }
}
