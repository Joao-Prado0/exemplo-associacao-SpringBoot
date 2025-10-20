package com.exemplo.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 120)
    @Column(name = "logradouro", nullable = false, length = 120)
    private String logradouro;

    @Size(max = 10)
    @Column(name = "numero", length = 10)
    private String numero;

    @Size(max = 80)
    @Column(name = "complemento", length = 80)
    private String complemento;

    @NotBlank
    @Size(max = 80)
    @Column(name = "bairro", nullable = false, length = 80)
    private String bairro;

    @NotBlank
    @Size(max = 80)
    @Column(name = "cidade", nullable = false, length = 80)
    private String cidade;

    @NotBlank
    @Size(max = 2)
    @Column(name = "uf", nullable = false, length = 2)
    private String uf;

    @NotBlank
    @Size(max = 9)
    @Column(name = "cep", nullable = false, length = 9)
    private String cep;
}
