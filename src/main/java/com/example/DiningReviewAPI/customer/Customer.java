package com.example.DiningReviewAPI.customer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="CUSTOMERS")
@Getter @Setter @NoArgsConstructor
public class Customer {
    
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private String zipcode;

    @Column
    private boolean interestedInPeanutAllergies;

    @Column
    private boolean interestedInEggAllergies;

    @Column
    private boolean interestedInDairyAllergies;
}