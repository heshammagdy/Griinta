package com.verinder.dao.income;

import com.verinder.domain.Income;
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
public class IncomeDAOImpl implements IncomeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Transactional
    public List<Income> getAllIncome() {
        return getCurrentSession().getNamedQuery("findAllIncome").list();
    }

    @Transactional
    public List<Income> getAllIncomeBetweenDates(Date startInvoiceDate, Date endInvoiceDate, Date startPaymentDate, Date endPaymentDate) {
        return null;
    }

    @Transactional
    public Income getIncomeById(Integer id) {
        return (Income)getCurrentSession().get(Income.class, id);
    }

    @Transactional
    public void saveOrUpdate(Income income) {
        getCurrentSession().saveOrUpdate(income);
    }

    @Transactional
    public void delete(Income income) {
        getCurrentSession().delete(income);
    }


}
