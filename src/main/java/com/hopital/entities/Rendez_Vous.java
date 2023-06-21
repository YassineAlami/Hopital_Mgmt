package com.hopital.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "Rendez_Vous")
public class Rendez_Vous {

    @Id
    @GeneratedValue
    private long id;
    @NonNull
    private Date daterdv;
    @NonNull
    private LocalTime heurerdv;
    @NonNull
    private boolean confirmed;
    @ManyToOne()
    private Patient patient;
}
