package com.bank.bank2mjee.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@Table(name = "Person")
public abstract class Person {
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "birthDate")
    private LocalDate birthDate;
    @Column(name = "mobile")
    private String mobile;
}
