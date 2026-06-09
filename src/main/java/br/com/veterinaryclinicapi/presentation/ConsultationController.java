package br.com.veterinaryclinicapi.presentation;

import br.com.veterinaryclinicapi.application.dto.request.ConsultationRequest;
import br.com.veterinaryclinicapi.application.dto.response.ConsultationResponse;
import br.com.veterinaryclinicapi.application.service.ConsultationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultations")
public class ConsultationController {

    private final ConsultationService consultationService;

    public ConsultationController(ConsultationService consultationService) {
        this.consultationService = consultationService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ConsultationResponse addConsultation(@RequestBody ConsultationRequest consultationRequest) {
        return this.consultationService.save(consultationRequest);
    }

    @GetMapping
    public List<ConsultationRequest> getAllConsultations() {
        return this.consultationService.findAll();
    }

    @GetMapping("/{id}")
    public ConsultationResponse findById(@PathVariable Long id) {
        return this.consultationService.findById(id);
    }

    @PutMapping("/{id}")
    public ConsultationResponse updateConsultation(@PathVariable Long id,
                                                   @RequestBody ConsultationRequest consultationRequest) {
        return this.consultationService.update(id, consultationRequest);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteConsultation(@PathVariable Long id) {
        this.consultationService.remove(id);
    }

}
