package eu.ensup.gestionglasses.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Glasse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int reference;
    private String label;
    private Double price;
}