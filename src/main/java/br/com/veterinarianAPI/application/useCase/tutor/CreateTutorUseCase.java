package br.com.veterinarianAPI.application.useCase.tutor;

import br.com.veterinarianAPI.application.dto.request.TutorRequest;
import br.com.veterinarianAPI.application.dto.response.TutorResponse;
import br.com.veterinarianAPI.domain.model.Tutor;
import br.com.veterinarianAPI.domain.repository.TutorRespository;
import org.springframework.stereotype.Service;

@Service
public class CreateTutorUseCase {

    private final TutorRespository tutorRespository;

    public CreateTutorUseCase(TutorRespository tutorRespository) {
        this.tutorRespository = tutorRespository;
    }

    public TutorResponse execute(TutorRequest tutorRequest) {
        Tutor tutor = new Tutor(
                tutorRequest.getName(),
                tutorRequest.getEmail(),
                tutorRequest.getCpf(),
                tutorRequest.getPhone(),
                tutorRequest.getAddress()
        );

        Tutor saved = tutorRespository.save(tutor);

        return new TutorResponse(
                saved.getId(),
                saved.getName(),
                saved.getEmail(),
                saved.getCpf(),
                saved.getPhone(),
                saved.getAddress()
        );
    }

}
