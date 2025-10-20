package com.exemplo.app.models;

import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;

@Entity
@Getter
@Setter
@DiscriminatorValue("FUNCIONARIO")
public class Funcionario extends Usuario {

}