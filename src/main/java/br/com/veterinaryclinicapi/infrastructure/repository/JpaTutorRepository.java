package br.com.veterinaryclinicapi.infrastructure.repository;

import br.com.veterinaryclinicapi.infrastructure.bd.TutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTutorRepository extends JpaRepository<TutorEntity, Long> {

}
