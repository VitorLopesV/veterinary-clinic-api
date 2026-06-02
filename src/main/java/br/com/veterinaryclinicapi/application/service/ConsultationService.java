package br.com.veterinaryclinicapi.application.service;

import br.com.veterinaryclinicapi.domain.repository.ConsultationRepository;
import org.springframework.stereotype.Service;

@Service
public class ConsultationService {

    private ConsultationRepository repository;

    public ConsultationService(ConsultationRepository repository) {
        this.repository = repository;
    }

}
