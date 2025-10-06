package com.exemplo.app.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("ALUNO")

public class Aluno extends Usuario {


}
