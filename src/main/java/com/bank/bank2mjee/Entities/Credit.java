package com.bank.bank2mjee.Entities;

import com.bank.bank2mjee.Enums.CreditEtat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.ws.rs.client.Client;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "credit")
public class Credit {
    @Id
    private Long numero;
    //private Client client;
    //private Agence agence;
    private LocalDate date;
    private Double montant;
    private int duree;
    private String remarques;
    private CreditEtat creditEtat;
}
