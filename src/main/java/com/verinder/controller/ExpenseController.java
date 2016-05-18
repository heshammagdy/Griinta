package com.verinder.controller;

import com.verinder.domain.Expense;
import com.verinder.services.rest.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/expense")
public class ExpenseController {


    @Autowired
    private ExpenseService expenseService;


    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addNewExpense(@RequestBody Expense expense) {

        expenseService.saveOrUpdateExpense(expense);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateExpense(@RequestBody Expense expense) {

        expenseService.saveOrUpdateExpense(expense);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Expense> getAllExpenses() {

        return expenseService.getAllExpenses();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Expense getExpenseById(@PathVariable Integer id) {

        return expenseService.getExpenseById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteExpense(@PathVariable Integer id) {
        Expense expense = new Expense();
        expense.setId(id);
        expenseService.deleteExpense(expense);
    }




}
