package com.exemplo.app.models;

import com.exemplo.app.models.enums.StatusEmprestimo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name = "data_inicio", nullable = false, columnDefinition = "datetime")
    private LocalDateTime dateInicio;

    @NotNull
    @Column(name = "data_devolucao", nullable = false, columnDefinition = "datetime")
    private LocalDateTime dataPrevistaDevolucao;

    @Column(name = "data_fim", nullable = false, columnDefinition = "datetime")
    private LocalDateTime dataDevolucao;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private StatusEmprestimo statusEmprestimo = StatusEmprestimo.ABERTO;

    @Column(precision = 10, scale = 2)
    private BigDecimal multa;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", nullable = false, foreignKey = @ForeignKey(name = "fk_emprestimo_usuario"))
    private Usuario usuario;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_exemplar", nullable = false, foreignKey = @ForeignKey(name = "fk_emprestimo_exemplar"))
    private Exemplar exemplar;
}
