package com.vma.telecom_plans_catalog;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelecomPlanService {
    private final TelecomPlanRepository telecomPlanRepository;

    public TelecomPlanService(TelecomPlanRepository telecomPlanRepository) {
        this.telecomPlanRepository = telecomPlanRepository;
    }
    public List<TelecomPlan> getAllTelecomPlans(){
        return telecomPlanRepository.findAll();
    }
    public void insertTelecomPlan(TelecomPlan telecomPlan){
        telecomPlanRepository.save(telecomPlan);
    }
}
