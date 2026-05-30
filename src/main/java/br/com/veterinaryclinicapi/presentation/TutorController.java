package br.com.veterinaryclinicapi.presentation;

import br.com.veterinaryclinicapi.application.dto.request.TutorRequest;
import br.com.veterinaryclinicapi.application.dto.response.TutorResponse;
import br.com.veterinaryclinicapi.application.service.TutorService;
import br.com.veterinaryclinicapi.domain.model.Tutor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/tutors")
@RestController
public class TutorController {

    private final TutorService tutorService;

    public TutorController(TutorService tutorService) {
        this.tutorService = tutorService;
    }


    // Exemplo e estudar mais sobre requisições POST
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TutorResponse addTutor(@RequestBody TutorRequest tutorRequest) {
        return this.tutorService.save(tutorRequest);
    }

    // Exemplo e estudar mais sobre requisições GET
    @GetMapping
    public List<TutorRequest> getAllTutors(){
        return this.tutorService.findAll();
    }

}
