package com.verinder.dao.expensecategory;

import com.verinder.domain.ExpenseCategory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by versim on 1/06/2015.
 */

@Repository
public class ExpenseCategoryDAOImpl implements ExpenseCategoryDAO {


    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public List<ExpenseCategory> getAllCategories() {
        return getCurrentSession().getNamedQuery("findAllExpenseCategories").list();
    }

    public ExpenseCategory getCategoryById(Integer id) {
        return (ExpenseCategory)getCurrentSession().get(ExpenseCategory.class, id);
    }

    public void saveOrUpdate(ExpenseCategory expenseCategory) {
        getCurrentSession().saveOrUpdate(expenseCategory);
    }

    public void delete(ExpenseCategory expenseCategory) {
        getCurrentSession().delete(expenseCategory);
    }

}
