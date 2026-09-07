package com.vma.telecom_plans_catalog;

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
    public List<TelecomPlan> getTelecomPlans(){
        return telecomPlanService.getAllTelecomPlans();
    }
    @PostMapping
    public void addNewTelecomPlan(@RequestBody TelecomPlan telecomPlan){
        telecomPlanService.insertTelecomPlan(telecomPlan);
    }

}
