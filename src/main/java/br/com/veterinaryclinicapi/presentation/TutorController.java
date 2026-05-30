package br.com.veterinaryclinicapi.presentation;

import br.com.veterinaryclinicapi.application.dto.request.TutorRequest;
import br.com.veterinaryclinicapi.application.dto.response.TutorResponse;
import br.com.veterinaryclinicapi.application.service.TutorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller REST responsavel por expor as operacoes de cadastro e consulta de tutores.
 * <p>
 * A classe centraliza os endpoints HTTP relacionados ao recurso {@code /tutors} e delega
 * as regras de negocio para {@link TutorService}.
 */
@RequestMapping("/tutors")
@RestController
public class TutorController {

    private final TutorService tutorService;

    /**
     * Cria uma instancia do controller com o service necessario para manipular tutores.
     *
     * @param tutorService service responsavel pelas regras de negocio de tutores
     */
    public TutorController(TutorService tutorService) {
        this.tutorService = tutorService;
    }

    /**
     * Cadastra um novo tutor.
     *
     * @param tutorRequest dados do tutor que sera cadastrado
     * @return dados do tutor cadastrado
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TutorResponse addTutor(@RequestBody TutorRequest tutorRequest) {
        return this.tutorService.save(tutorRequest);
    }

    /**
     * Lista todos os tutores cadastrados.
     *
     * @return lista de tutores cadastrados
     */
    @GetMapping
    public List<TutorRequest> getAllTutors() {
        return this.tutorService.findAll();
    }

    /**
     * Busca um tutor pelo identificador.
     *
     * @param id identificador do tutor
     * @return dados do tutor encontrado
     */
    @GetMapping("/{id}")
    public TutorRequest findById(@PathVariable Long id) {
        return this.tutorService.findByIdAsRequest(id);
    }

    /**
     * Atualiza parcialmente os dados de um tutor.
     * <p>
     * Apenas os campos enviados no corpo da requisicao sao alterados.
     *
     * @param id identificador do tutor que sera atualizado
     * @param tutorRequest campos do tutor que devem ser alterados
     * @return dados do tutor atualizado
     */
    @PatchMapping("/{id}")
    public TutorResponse patchTutor(@PathVariable Long id, @RequestBody TutorRequest tutorRequest) {
        return this.tutorService.patch(id, tutorRequest);
    }

    /**
     * Remove um tutor pelo identificador.
     *
     * @param id identificador do tutor que sera removido
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTutor(@PathVariable Long id) {
        this.tutorService.delete(id);
    }

}
