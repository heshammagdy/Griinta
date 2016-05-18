package com.verinder.services.rest;

import com.verinder.domain.Expense;
import com.verinder.domain.ExpenseCategory;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by versim on 1/06/2015.
 */

@Service
public interface ExpenseService {

    List<Expense> getAllExpenses();

    List<Expense> getAllExpensesBetweenDates(Date startInvoiceDate, Date endInvoiceDate,
                                             Date startExpenseDate, Date endExpenseDate);
    Expense getExpenseById(Integer id);

    List<ExpenseCategory> getAllExpenseCategories();

    ExpenseCategory getExpenseCategoryById(Integer id);

    void saveOrUpdateExpenseCategory(ExpenseCategory expenseCategory);

    void saveOrUpdateExpense(Expense expense);

    void deleteExpenseCategory(ExpenseCategory expenseCategory);

    void deleteExpense(Expense expense);


}
