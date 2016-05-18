package com.verinder.controller;

import com.verinder.domain.Income;
import com.verinder.services.rest.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/income")
public class IncomeController {

    @Autowired
    private IncomeService incomeService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addNewIncome(@RequestBody Income income) {

        incomeService.saveOrUpdateIncome(income);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateIncome(@RequestBody Income income) {

        incomeService.saveOrUpdateIncome(income);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Income> getAllIncome(@PathVariable String id) {

        return incomeService.getAllIncome();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Income getIncomeById(@PathVariable Integer id) {

        return incomeService.getIncomeById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteIncome(@PathVariable Integer id) {
        Income income = new Income();
        income.setId(id);
        incomeService.deleteIncome(income);
    }


}
