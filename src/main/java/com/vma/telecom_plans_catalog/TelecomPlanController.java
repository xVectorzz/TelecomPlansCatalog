package com.vma.telecom_plans_catalog;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/plan")
public class TelecomPlanController {
    private final TelecomPlanService telecomPlanService;

    public TelecomPlanController(TelecomPlanService telecomPlanService) {
        this.telecomPlanService = telecomPlanService;
    }
    @GetMapping
    public List<TelecomPlanDTO> getTelecomPlans(){
        return telecomPlanService.getAllTelecomPlans();
    }
    @PostMapping
    public void addNewTelecomPlan(@Valid
            @RequestBody TelecomPlan telecomPlan){
        telecomPlanService.insertTelecomPlan(telecomPlan);
    }
    @PutMapping("{id}")
    public void updateTelecomPlan(@PathVariable Long id,@RequestBody TelecomPlan telecomPlan){
        telecomPlanService.updateTelecomPlan(id, telecomPlan);
    }
    @DeleteMapping("{id}")
    public void deleteTelecomPlan(@PathVariable Long id){
        telecomPlanService.deleteTelecomPlan(id);
    }

}
