package br.com.veterinarianAPI.infrastructure.bd;

import jakarta.persistence.*;

@Table(name="tutors")
@Entity
public class TutorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
