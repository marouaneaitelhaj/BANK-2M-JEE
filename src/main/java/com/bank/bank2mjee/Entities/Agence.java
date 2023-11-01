package com.bank.bank2mjee.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "agence")
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String code;
    @Column(name = "name")
    private String nom;
    @Column(name = "address")
    private String adresse;
    @Column(name = "numero")
    private String numero;

    @OneToMany
    private List<DemandeDeCredit> demandeDeCredits;

    public Agence(String code) {
        this.code = code;
    }
}
