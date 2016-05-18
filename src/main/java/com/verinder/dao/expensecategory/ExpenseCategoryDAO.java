package com.verinder.dao.expensecategory;

import com.verinder.domain.Expense;
import com.verinder.domain.ExpenseCategory;

import java.util.List;

/**
 * Created by versim on 1/06/2015.
 */
public interface ExpenseCategoryDAO {

    List<ExpenseCategory> getAllCategories();

    ExpenseCategory getCategoryById(Integer id);

    void saveOrUpdate(ExpenseCategory expenseCategory);

    void delete(ExpenseCategory expenseCategory);
}
