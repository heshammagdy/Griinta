package com.verinder.services.rest;

import com.verinder.dao.expense.ExpenseDAO;
import com.verinder.dao.expensecategory.ExpenseCategoryDAO;
import com.verinder.domain.Expense;
import com.verinder.domain.ExpenseCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by versim on 1/06/2015.
 */

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseDAO expenseDAO;

    @Autowired
    private ExpenseCategoryDAO expenseCategoryDAO;

    @Transactional
    public List<Expense> getAllExpenses() {

        return expenseDAO.getAllExpenses();
    }

    @Transactional
    public List<Expense> getAllExpensesBetweenDates(Date startInvoiceDate, Date endInvoiceDate, Date startExpenseDate,
                                                    Date endExpenseDate) {
        return expenseDAO.getAllExpensesBetweenDates(startInvoiceDate, endInvoiceDate, startExpenseDate, endExpenseDate);
    }

    @Transactional
    public Expense getExpenseById(Integer id) {

        return expenseDAO.getExpenseById(id);
    }

    @Transactional
    public List<ExpenseCategory> getAllExpenseCategories() {

        return expenseCategoryDAO.getAllCategories();
    }

    @Transactional
    public ExpenseCategory getExpenseCategoryById(Integer id) {

        return expenseCategoryDAO.getCategoryById(id);
    }

    @Transactional
    public void saveOrUpdateExpenseCategory(ExpenseCategory expenseCategory) {

        expenseCategoryDAO.saveOrUpdate(expenseCategory);
    }

    @Transactional
    public void saveOrUpdateExpense(Expense expense) {

        expenseDAO.saveOrUpdate(expense);
    }

    @Transactional
    public void deleteExpenseCategory(ExpenseCategory expenseCategory) {

        expenseCategoryDAO.delete(expenseCategory);
    }

    @Transactional
    public void deleteExpense(Expense expense) {

        expenseDAO.delete(expense);
    }
}
