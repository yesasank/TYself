package com.tyself.tyself.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyself.tyself.entity.SavingsGoal;

public interface SavingsGoalRepository extends JpaRepository<SavingsGoal, Long> {

}