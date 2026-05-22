package br.com.veterinarianAPI.presentation;

import br.com.veterinarianAPI.application.dto.request.TutorRequest;
import br.com.veterinarianAPI.application.dto.response.TutorResponse;
import br.com.veterinarianAPI.application.useCase.tutor.CreateTutorUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/tutors")
@RestController
public class TutorController {

    private final CreateTutorUseCase createTutorUseCase;

    public TutorController(CreateTutorUseCase createTutorUseCase) {
        this.createTutorUseCase = createTutorUseCase;
    }


    // Exemplo e estudar mais sobre requisições POST
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TutorResponse addTutor(@RequestBody TutorRequest tutorRequest) {
        return createTutorUseCase.execute(tutorRequest);
    }

}
