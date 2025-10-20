package com.exemplo.app.models;

import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;

@Entity
@Getter
@Setter
@DiscriminatorValue("PROFESSOR")
public class Professor extends Usuario {

}