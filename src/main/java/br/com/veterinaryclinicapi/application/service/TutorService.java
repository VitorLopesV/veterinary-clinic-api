package br.com.veterinaryclinicapi.application.service;

import br.com.veterinaryclinicapi.application.dto.request.TutorRequest;
import br.com.veterinaryclinicapi.application.dto.response.TutorResponse;
import br.com.veterinaryclinicapi.domain.model.Tutor;
import br.com.veterinaryclinicapi.domain.repository.TutorRespository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class TutorService {

    private final TutorRespository repository;

    public TutorService(TutorRespository repository) {
        this.repository = repository;
    }

    public TutorResponse save(TutorRequest tutor) {
        if (this.verifyTutorExists(tutor.getCpf())) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "CPF already in use");
        }

        Tutor savedTutor = repository.save(this.toDomain(tutor));
        return toResponse(savedTutor);
    }

    public void delete(Long id) {
        Tutor tutor = this.findById(id);
        repository.delete(tutor);
    }

    public List<TutorRequest> findAll() {
        List<TutorRequest> tutors = new ArrayList<>();
        for (Tutor tutorRequest : this.repository.findAll()) {
            tutors.add(this.toRequest(tutorRequest));
        }
        return tutors;
    }

    public Tutor findById(Long id) {
        Tutor tutor = this.repository.findById(id);
        if (tutor == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Tutor with id " + id + " does not exist");
        }
        return tutor;
    }

    public TutorRequest findByIdAsRequest(Long id) {
        return toRequest(findById(id));
    }

    public TutorResponse patch(Long id, TutorRequest tutorRequest) {
        Tutor tutor = this.findById(id);

        if (tutorRequest.getName() != null) {
            tutor.setName(tutorRequest.getName());
        }
        if (tutorRequest.getEmail() != null) {
            tutor.setEmail(tutorRequest.getEmail());
        }
        if (tutorRequest.getCpf() != null) {
            tutor.setCpf(tutorRequest.getCpf());
        }
        if (tutorRequest.getPhone() != null) {
            tutor.setPhone(tutorRequest.getPhone());
        }
        if (tutorRequest.getAddress() != null) {
            tutor.setAddress(tutorRequest.getAddress());
        }

        Tutor savedTutor = repository.save(tutor);
        return toResponse(savedTutor);
    }

    private boolean verifyTutorExists(String cpf) {
        for (Tutor verificadedTutor : repository.findAll()) {
            if (verificadedTutor.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    private Tutor toDomain(TutorRequest tutorRequest) {
        return new Tutor(tutorRequest.getName(), tutorRequest.getEmail(), tutorRequest.getCpf(),
                tutorRequest.getPhone(), tutorRequest.getAddress());
    }

    private TutorResponse toResponse(Tutor tutor) {
        return new TutorResponse(tutor.getName(), tutor.getEmail(), tutor.getCpf(), tutor.getPhone(),
                tutor.getAddress());
    }

    private TutorRequest toRequest(Tutor tutor) {
        return new TutorRequest(tutor.getId(), tutor.getName(), tutor.getEmail(), tutor.getCpf(), tutor.getPhone(),
                tutor.getAddress());
    }

}
