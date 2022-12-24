package com.example.DiningReviewAPI.restaurant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="RESTAURANTS")
@Getter @Setter @NoArgsConstructor
public class Restaurant {
    
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;
    
    @Column
    private int peanutScore;
    
    @Column
    private int eggScore;
    
    @Column
    private int dairyScore;
    
    @Column
    private Long overallScore; // average of three other reviews
}