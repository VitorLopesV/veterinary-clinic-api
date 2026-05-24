package br.com.veterinarianAPI.domain.model;

/**
 * Representa um tutor cadastrado no sistema.
 * <p>
 * Armazena dados basicos do tutor, como nome, email, cpf, telefone e endereco.
 */
public class Tutor {

    /** Identificador do tutor. */
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

    public Tutor(Long id, String name, String email, String cpf, String phone, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.phone = phone;
        this.address = address;
    }

    public Tutor(String name, String email, String cpf, String phone, String address) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.phone = phone;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
