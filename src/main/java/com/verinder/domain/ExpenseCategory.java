package com.verinder.domain;

import javax.persistence.*;

/**
 * Created by versim on 1/06/2015.
 */


@NamedQueries({

        @NamedQuery(
               name = "findAllExpenseCategories",
               query = "from ExpenseCategory"
        )

})
@Entity
@Table(name = "expense_type")
public class ExpenseCategory {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private String description;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
