package com.exemplo.app.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Size(max=100)
    @Column(nullable = false,length = 100)
    private String nome;

    @NotBlank
    @Size(max = 100)
    @Column(nullable = false,length = 100)
    private String sobrenome;

    @Past
    @Column(columnDefinition = "date")
    private LocalDate dataNascimento;

    @NotBlank
    @Size
    @Column(nullable = false,unique = true,length = 11, columnDefinition = "CHAR(11)")
    private String cpf;

    @Email
    @Size(max = 254)
    @Column(nullable = false, unique = true, length = 254)
    private String email;

    @Size(max = 20)
    @Column(length = 20)
    private String telefone;
}
