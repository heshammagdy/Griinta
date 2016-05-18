package com.verinder.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by versim on 1/06/2015.
 */
@Entity
@Table(name = "income")
@NamedQueries({

        @NamedQuery(
                name = "findAllIncome",
                query = "from Income"
        )

})
public class Income {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "gross_amount")
    private Integer grossAmount;

    @Column(name = "net_amount")
    private Integer netAmount;

    @Column
    private Integer gst;

    @Column(name = "invoice_date")
    private Date invoiceDate;

    @Column(name = "payment_date")
    private Date paymentDate;

    @Column
    private String client;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }
}
