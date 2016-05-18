package com.verinder.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by versim on 1/06/2015.
 */

@Entity
@Table(name = "Expenses")
@NamedQueries({

        @NamedQuery(
                name = "findAllExpenses",
                query = "from Expense"
        )

})
public class Expense {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "expense_date")
    private Date expenseDate;

    @Column(name = "invoice_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date invoiceDate;

    @Column
    private String expense;

    @ManyToOne
    @JoinColumn(name = "expense_type")
    private ExpenseCategory expenseCategory;

    @Column(name = "gross_amount")
    private Integer grossAmount;

    @Column(name = "net_amount")
    private Integer netAmount;

    @Column
    private Integer gst;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public ExpenseCategory getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(ExpenseCategory expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public Integer getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(Integer grossAmount) {
        this.grossAmount = grossAmount;
    }

    public Integer getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Integer netAmount) {
        this.netAmount = netAmount;
    }

    public Integer getGst() {
        return gst;
    }

    public void setGst(Integer gst) {
        this.gst = gst;
    }
}
