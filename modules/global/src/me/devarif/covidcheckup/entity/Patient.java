package me.devarif.covidcheckup.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "COVIDCHECKUP_PATIENT")
@Entity(name = "covidcheckup_Patient")
@NamePattern("%s|firstName")
public class Patient extends StandardEntity {
    private static final long serialVersionUID = 245977992746818030L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false, length = 30)
    private String firstName;

    @NotNull
    @Column(name = "LAST_NAME", nullable = false, length = 30)
    private String lastName;

    @Temporal(TemporalType.DATE)
    @Column(name = "BIRTH_DAY")
    private Date birthDay;

    @NotNull
    @Column(name = "GENDER", nullable = false)
    private Integer gender;

    public GenderEnum getGender() {
        return gender == null ? null : GenderEnum.fromId(gender);
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender == null ? null : gender.getId();
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
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