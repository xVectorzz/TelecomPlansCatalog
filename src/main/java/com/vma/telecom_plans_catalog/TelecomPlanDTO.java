package com.vma.telecom_plans_catalog;

public record TelecomPlanDTO(
        Long id,
        String name,
        Double price,
        Integer dataGb
) {}
