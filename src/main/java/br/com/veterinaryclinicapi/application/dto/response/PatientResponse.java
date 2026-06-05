package br.com.veterinaryclinicapi.application.dto.response;

import br.com.veterinaryclinicapi.domain.enums.Classifications;

import java.time.LocalDateTime;
import java.util.Date;

public record PatientResponse(Long id, String name, Long tutorId, Date dateOfBirth, double weight, String race,
                              Classifications classification, boolean isCastrated, String sex) {

}
