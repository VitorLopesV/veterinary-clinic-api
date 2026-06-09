package br.com.veterinaryclinicapi.presentation;

import br.com.veterinaryclinicapi.application.dto.request.PatientRequest;
import br.com.veterinaryclinicapi.application.dto.response.PatientResponse;
import br.com.veterinaryclinicapi.application.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PatientResponse addPatient(@RequestBody PatientRequest patientRequest) {
        return this.patientService.save(patientRequest);
    }

    @GetMapping
    public List<PatientResponse> getAllPatients() {
        return this.patientService.findAll();
    }

    @GetMapping("/{id}")
    public PatientResponse findById(@PathVariable Long id) {
        return this.patientService.findById(id);
    }

    @PutMapping("/{id}")
    public PatientResponse updatePatient(@PathVariable Long id, @RequestBody PatientRequest patientRequest) {
        return this.patientService.update(id, patientRequest);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePatient(@PathVariable Long id) {
        this.patientService.remove(id);
    }

}
