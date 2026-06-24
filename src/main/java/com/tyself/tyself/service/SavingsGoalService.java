package com.tyself.tyself.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tyself.tyself.entity.SavingsGoal;
import com.tyself.tyself.repository.SavingsGoalRepository;

@Service
public class SavingsGoalService {

    private final SavingsGoalRepository savingsGoalRepository;

    public SavingsGoalService(SavingsGoalRepository savingsGoalRepository) {
        this.savingsGoalRepository = savingsGoalRepository;
    }
    public SavingsGoal saveGoal(SavingsGoal goal) {
    
        return savingsGoalRepository.save(goal);
    }
    public List<SavingsGoal> getAllGoals() {
        return savingsGoalRepository.findAll();
    }
    public SavingsGoal getGoalById(Long id) {
        return savingsGoalRepository.findById(id).orElse(null);
    }
    public SavingsGoal updateGoal(Long id, SavingsGoal updatedGoal) {

    SavingsGoal existingGoal =
            savingsGoalRepository.findById(id).orElse(null);

      if (existingGoal != null) {

        existingGoal.setGoalName(updatedGoal.getGoalName());
        existingGoal.setTargetAmount(updatedGoal.getTargetAmount());
        existingGoal.setCurrentAmount(updatedGoal.getCurrentAmount());
        existingGoal.setCreatedDate(updatedGoal.getCreatedDate());
        existingGoal.setTargetDate(updatedGoal.getTargetDate());

        return savingsGoalRepository.save(existingGoal);
      }

      return null;
    }
    public void deleteGoal(Long id) {
    
      savingsGoalRepository.deleteById(id);
    }
}