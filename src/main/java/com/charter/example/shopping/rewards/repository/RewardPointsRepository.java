package com.charter.example.shopping.rewards.repository;

import com.charter.example.shopping.rewards.model.RewardPoints;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardPointsRepository extends JpaRepository<RewardPoints,Long> {
}
