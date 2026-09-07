package com.vma.telecom_plans_catalog;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TelecomPlanService {
    private final TelecomPlanRepository telecomPlanRepository;

    public TelecomPlanService(TelecomPlanRepository telecomPlanRepository) {
        this.telecomPlanRepository = telecomPlanRepository;
    }
    public List<TelecomPlanDTO> getAllTelecomPlans(){
        return telecomPlanRepository.findAll().stream().map(plan -> new TelecomPlanDTO(
                plan.getId(),
                plan.getName(),
                plan.getPrice(),
                plan.getDataGb()
        )).collect(Collectors.toList());
    }
    public void insertTelecomPlan(TelecomPlan telecomPlan){
        telecomPlanRepository.save(telecomPlan);
    }

    public void updateTelecomPlan(Long id, TelecomPlan updatedPlan) {
        TelecomPlan existingPlan = telecomPlanRepository.findById(id).orElseThrow(()-> new IllegalStateException("Plan with id " + id + "does not exist"));
        existingPlan.setName(updatedPlan.getName());
        existingPlan.setPrice(updatedPlan.getPrice());
        existingPlan.setDataGb(updatedPlan.getDataGb());
        telecomPlanRepository.save(existingPlan);
    }

    public void deleteTelecomPlan(Long id) {
        telecomPlanRepository.deleteById(id);
    }
}
