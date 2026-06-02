package br.com.veterinaryclinicapi.infrastructure.mapper;

import br.com.veterinaryclinicapi.domain.model.Tutor;
import br.com.veterinaryclinicapi.infrastructure.bd.TutorEntity;
import org.springframework.stereotype.Component;

@Component
public class TutorMapper {

    public TutorEntity toEntity(Tutor tutor) {
        return new TutorEntity(tutor.getId(), tutor.getName(), tutor.getEmail(), tutor.getCpf(), tutor.getPhone(),
                tutor.getAddress());
    }

    public Tutor toDomain(TutorEntity entity) {
        return new Tutor(entity.getId(), entity.getName(), entity.getEmail(), entity.getCpf(), entity.getPhone(),
                entity.getAddress());
    }

}
