package com.verinder.dao.income;

import com.verinder.domain.Income;


import java.util.Date;
import java.util.List;

/**
 * Created by versim on 1/06/2015.
 */
public interface IncomeDAO {

    List<Income> getAllIncome();

    List<Income> getAllIncomeBetweenDates(Date startInvoiceDate, Date endInvoiceDate,
                                             Date startPaymentDate, Date endPaymentDate);
    Income getIncomeById(Integer id);

    void saveOrUpdate(Income income);

    void delete(Income income);
    
}
