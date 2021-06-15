package me.devarif.covidcheckup.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "COVIDCHECKUP_DOCTOR")
@Entity(name = "covidcheckup_Doctor")
@NamePattern("%s|firstName")
public class Doctor extends StandardEntity {
    private static final long serialVersionUID = 1976348545874833990L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false, length = 30)
    private String firstName;

    @NotNull
    @Column(name = "LAST_NAME", nullable = false, length = 30)
    private String lastName;

    @Column(name = "EMAIL", unique = true)
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}