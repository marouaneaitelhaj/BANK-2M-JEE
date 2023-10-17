package com.bank.bank2mjee.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Client")
public final class Client extends Person{
    @Column(name = "code")
    private String code;
    @Column(name = "address")
    private String address;
}
