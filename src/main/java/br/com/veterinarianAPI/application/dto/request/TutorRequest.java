package br.com.veterinarianAPI.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TutorRequest {

    private Long id;

    /** Nome do tutor. */
    private String name;

    /** Email do tutor. */
    private String email;

    /** CPF do tutor. */
    private String cpf;

    /** Telefone do tutor. */
    private String phone;

    /** Endereco do tutor. */
    private String address;
}
