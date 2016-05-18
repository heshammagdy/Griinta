package com.verinder.services.rest;

import com.verinder.domain.Income;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by versim on 1/06/2015.
 */


@Service
public interface IncomeService {

    List<Income> getAllIncome();

    List<Income> getAllIncomeBetweenDates(Date startInvoiceDate, Date endInvoiceDate,
                                          Date startPaymentDate, Date endPaymentDate);
    Income getIncomeById(Integer id);

    void saveOrUpdateIncome(Income income);

    void deleteIncome(Income income);

}
