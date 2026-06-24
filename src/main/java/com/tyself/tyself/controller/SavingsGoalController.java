package com.tyself.tyself.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyself.tyself.entity.SavingsGoal;
import com.tyself.tyself.service.SavingsGoalService;

@RestController
@RequestMapping("/goals")
public class SavingsGoalController {
  private final SavingsGoalService savingsGoalService;

  public SavingsGoalController(SavingsGoalService savingsGoalService) {
    this.savingsGoalService = savingsGoalService;
  }
  @PostMapping
  public SavingsGoal createGoal(@RequestBody SavingsGoal goal) {
    return savingsGoalService.saveGoal(goal);
  }
  @GetMapping
  public List<SavingsGoal> getAllGoals() {
    return savingsGoalService.getAllGoals();
  }
  @GetMapping("/{id}")
    public SavingsGoal getGoalById(@PathVariable Long id) {
        return savingsGoalService.getGoalById(id);
    }
  @PutMapping("/{id}")
    public SavingsGoal updateGoal(@PathVariable Long id, @RequestBody SavingsGoal Goal) {
        return savingsGoalService.updateGoal(id, Goal);
    }
  @DeleteMapping("/{id}")
    public void deleteGoal(@PathVariable Long id) {
        savingsGoalService.deleteGoal(id);
    }
    

}