package com.verinder.dao.expense;

import com.verinder.domain.Expense;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by versim on 1/06/2015.
 */

@Repository
public class ExpenseDAOImpl implements ExpenseDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Transactional
    public List<Expense> getAllExpenses() {
        return getCurrentSession().getNamedQuery("findAllExpenses").list();
    }

    @Transactional
    public List<Expense> getAllExpensesBetweenDates(Date startInvoiceDate, Date endInvoiceDate, Date startExpenseDate, Date endExpenseDate) {
        return null;
    }

    @Transactional
    public Expense getExpenseById(Integer id) {
        return (Expense)getCurrentSession().get(Expense.class, id);
    }

    @Transactional
    public void saveOrUpdate(Expense expense) {
        getCurrentSession().saveOrUpdate(expense);
    }

    @Transactional
    public void delete(Expense expense) {
        getCurrentSession().delete(expense);
    }
}
