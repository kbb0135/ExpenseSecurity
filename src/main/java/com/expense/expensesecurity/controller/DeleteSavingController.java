package com.expense.expensesecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteSavingController {
    @GetMapping("/deletesaving")
    public String getDeleteSaving() {
        return "This is delete saving controller";
    }
}
