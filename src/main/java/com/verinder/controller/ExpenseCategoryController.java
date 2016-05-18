package com.verinder.controller;

import com.verinder.domain.ExpenseCategory;
import com.verinder.services.rest.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/expenseCategory")
public class ExpenseCategoryController {

    @Autowired
    private ExpenseService expenseService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addNewCategory(@RequestBody ExpenseCategory expenseCategory) {
        expenseService.saveOrUpdateExpenseCategory(expenseCategory);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateCategory(@RequestBody ExpenseCategory expenseCategory) {
        expenseService.saveOrUpdateExpenseCategory(expenseCategory);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ExpenseCategory> getAllCategories() {

        return expenseService.getAllExpenseCategories();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ExpenseCategory getAllCategoryById(@PathVariable Integer id) {

        return expenseService.getExpenseCategoryById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteExpenseCategoryTest(@PathVariable Integer id) {
        ExpenseCategory expenseCategory = new ExpenseCategory();
        expenseCategory.setId(id);
        expenseService.deleteExpenseCategory(expenseCategory);
    }


}
