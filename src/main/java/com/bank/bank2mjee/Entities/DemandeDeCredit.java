package com.bank.bank2mjee.Entities;


import com.bank.bank2mjee.Enums.CreditEtat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "credit")
public class DemandeDeCredit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    @ManyToOne
    @JoinColumn(name = "client")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "agence")
    private Agence agence;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "montant")
    private Double montant;

    @Column(name = "duree")
    private int duree;

    @Column(name = "remarques")
    private String remarques;

    @Column(name = "creditEtat")
    private CreditEtat creditEtat;
}
