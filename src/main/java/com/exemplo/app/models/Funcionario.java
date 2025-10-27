package com.exemplo.app.models;

import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;

@Entity
@Getter
@Setter
@DiscriminatorValue("FUNCIONARIO")
public class Funcionario extends Usuario {

    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name = "id_departamento", nullable = false, foreignKey = @ForeignKey(name = "fk_funcionario_departamento"))
    private Departamento departamento;
}