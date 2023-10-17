package com.bank.bank2mjee.Entities;

import com.bank.bank2mjee.Enums.CreditEtat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "credit")
@AllArgsConstructor
@NoArgsConstructor
public class DemandeDeCredit {
    @Id
    private Long numero;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Agence agence;
    private LocalDate date;
    private Double montant;
    private int duree;
    private String remarques;
    private CreditEtat creditEtat;
}
