package com.charter.example.shopping.rewards.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RewardPoints {
    @Id
    @GeneratedValue
    private Long Id;
    private String name;
    private int totalPoints;
    private Map<String,Integer> monthlyPoints;


}
