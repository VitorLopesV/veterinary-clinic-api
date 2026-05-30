package br.com.veterinaryclinicapi.application.service;

import br.com.veterinaryclinicapi.application.dto.request.TutorRequest;
import br.com.veterinaryclinicapi.application.dto.response.TutorResponse;
import br.com.veterinaryclinicapi.domain.model.Tutor;
import br.com.veterinaryclinicapi.domain.repository.TutorRespository;
import org.springframework.stereotype.Service;

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
            System.out.println("cpf já está sendo utilizado");
        }

        repository.save(this.toDomain(tutor));
        return toResponse(tutor);
    }

    public void delete(TutorRequest tutor) {
        if (this.verifyTutorExists(tutor.getCpf())) {
            repository.delete(toDomain(tutor));
        }
        System.out.println("Tutor does not exist");
    }

    public List<TutorRequest> findAll() {
        List<TutorRequest> tutors = new ArrayList<>();
        for (Tutor tutorRequest : this.repository.findAll()){
            tutors.add(this.toRequest(tutorRequest));
        }
        return tutors;
    }

    public Tutor findById(Long id) {
        Tutor tutor = this.repository.findById(id);
        if (tutor == null) {
            System.out.println("Tutor with id " + id + " does not exist");
            return null;
        }
        return tutor;
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

    private TutorResponse toResponse(TutorRequest tutorRequest) {
        return new TutorResponse(tutorRequest.getName(), tutorRequest.getEmail(), tutorRequest.getCpf(),
                tutorRequest.getPhone(), tutorRequest.getAddress());
    }
    private TutorRequest toRequest(Tutor tutor) {
        return new TutorRequest(tutor.getId(), tutor.getName(), tutor.getEmail(), tutor.getCpf(), tutor.getPhone(),
                tutor.getAddress());
    }

}
