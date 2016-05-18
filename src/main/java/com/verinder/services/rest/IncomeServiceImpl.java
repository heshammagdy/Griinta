package com.verinder.services.rest;

import com.verinder.dao.income.IncomeDAO;
import com.verinder.domain.Income;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by versim on 1/06/2015.
 */
@Service
public class IncomeServiceImpl implements IncomeService {

    @Autowired
    private IncomeDAO incomeDAO;

    public List<Income> getAllIncome() {

        return incomeDAO.getAllIncome();
    }

    public List<Income> getAllIncomeBetweenDates(Date startInvoiceDate, Date endInvoiceDate, Date startPaymentDate, Date endPaymentDate) {

        return incomeDAO.getAllIncomeBetweenDates(startInvoiceDate, endInvoiceDate, startPaymentDate, endPaymentDate);
    }

    public Income getIncomeById(Integer id) {

        return incomeDAO.getIncomeById(id);
    }

    public void saveOrUpdateIncome(Income income) {
        incomeDAO.saveOrUpdate(income);
    }

    public void deleteIncome(Income income) {
        incomeDAO.delete(income);
    }
}
