package br.com.veterinarianAPI.infrastructure.repository;

import br.com.veterinarianAPI.infrastructure.bd.TutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTutorRepository extends JpaRepository<TutorEntity, Long> {

}
