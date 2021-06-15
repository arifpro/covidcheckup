package me.devarif.covidcheckup.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "COVIDCHECKUP_COVID_LEVEL")
@Entity(name = "covidcheckup_CovidLevel")
public class CovidLevel extends StandardEntity {
    private static final long serialVersionUID = -1916062677003441913L;

    @NotNull
    @Column(name = "SCORE", nullable = false)
    private Integer score;

    @NotNull
    @Column(name = "LEVEL_", nullable = false)
    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}