package br.com.veterinaryclinicapi.application.mapper;

import br.com.veterinaryclinicapi.application.dto.request.TutorRequest;
import br.com.veterinaryclinicapi.application.dto.response.TutorResponse;
import br.com.veterinaryclinicapi.domain.model.Tutor;
import org.springframework.stereotype.Component;

@Component
public class TutorDtoMapper {

    public Tutor toDomain(TutorRequest tutorRequest) {
        return new Tutor(tutorRequest.getName(), tutorRequest.getEmail(), tutorRequest.getCpf(),
                tutorRequest.getPhone(), tutorRequest.getAddress());
    }

    public TutorResponse toResponse(Tutor tutor) {
        return new TutorResponse(tutor.getName(), tutor.getEmail(), tutor.getCpf(), tutor.getPhone(),
                tutor.getAddress());
    }

    public TutorRequest toRequest(Tutor tutor) {
        return new TutorRequest(tutor.getId(), tutor.getName(), tutor.getEmail(), tutor.getCpf(), tutor.getPhone(),
                tutor.getAddress());
    }
}
