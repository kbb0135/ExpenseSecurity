package com.expense.expensesecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/helloworld")
    public String getMessage() {
        return "Hello World";
    }
}
