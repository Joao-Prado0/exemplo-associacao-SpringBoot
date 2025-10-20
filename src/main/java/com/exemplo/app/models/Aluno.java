package com.exemplo.app.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("ALUNO")

public class Aluno extends Usuario {

    // relacionamento 1:N com Curso
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_curso", nullable = false, foreignKey = @ForeignKey(name = "fk_usuario_curso"))
    private Curso curso;
}
