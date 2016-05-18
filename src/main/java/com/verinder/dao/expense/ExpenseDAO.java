package com.verinder.dao.expense;

import com.verinder.domain.Expense;

import java.util.Date;
import java.util.List;

/**
 * Created by versim on 1/06/2015.
 */
public interface ExpenseDAO {

    List<Expense> getAllExpenses();

    List<Expense> getAllExpensesBetweenDates(Date startInvoiceDate, Date endInvoiceDate,
                                             Date startExpenseDate, Date endExpenseDate);
    Expense getExpenseById(Integer id);

    void saveOrUpdate(Expense expense);

    void delete(Expense expense);
}
