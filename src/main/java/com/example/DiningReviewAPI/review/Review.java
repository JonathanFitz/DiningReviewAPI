package com.example.DiningReviewAPI.review;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="REVIEWS")
@Getter @Setter @NoArgsConstructor
public class Review {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private Long restaurant;
    
    @Column
    private Integer peanutScore = null;

    @Column
    private Integer eggScore = null;

    @Column
    private Integer dairyScore = null;

    @Column
    private String commentary = null;
}
