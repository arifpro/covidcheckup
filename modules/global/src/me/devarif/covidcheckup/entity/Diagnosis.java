package me.devarif.covidcheckup.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Listeners;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.PublishEntityChangedEvents;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "COVIDCHECKUP_DIAGNOSIS")
@Entity(name = "covidcheckup_Diagnosis")
@Listeners("covidcheckup_DiagnosisChangedListener")
public class Diagnosis extends StandardEntity {
    private static final long serialVersionUID = 3587864775860867005L;

    @Column(name = "AUTO_NUM", length = 30)
    private String autoNum;

    @Lookup(type = LookupType.SCREEN, actions = {})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DOCTOR_ID")
    private Doctor doctor;

    @Lookup(type = LookupType.SCREEN, actions = {"lookup", "open", "clear"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PATIENT_ID")
    private Patient patient;

    @NotNull
    @Column(name = "FEVER", nullable = false)
    private Boolean fever = false;

    @NotNull
    @Column(name = "COUGH", nullable = false)
    private Boolean cough = false;

    @NotNull
    @Column(name = "SHORTNESS_BREATH", nullable = false)
    private Boolean shortnessBreath = false;

    @NotNull
    @Column(name = "FATIGUE", nullable = false)
    private Boolean fatigue = false;

    @NotNull
    @Column(name = "MUSCLE_ACHES", nullable = false)
    private Boolean muscleAches = false;

    @NotNull
    @Column(name = "HEADACHE", nullable = false)
    private Boolean headache = false;

    @NotNull
    @Column(name = "LOSS_TASTE", nullable = false)
    private Boolean lossTaste = false;

    @NotNull
    @Column(name = "SORE_THROAT", nullable = false)
    private Boolean soreThroat = false;

    @NotNull
    @Column(name = "CONGESTION", nullable = false)
    private Boolean congestion = false;

    @NotNull
    @Column(name = "NAUSEA", nullable = false)
    private Boolean nausea = false;

    @NotNull
    @Column(name = "DIARRHEA", nullable = false)
    private Boolean diarrhea = false;

    @Column(name = "TOTAL_SCORE")
    private Integer totalScore;

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public Boolean getDiarrhea() {
        return diarrhea;
    }

    public void setDiarrhea(Boolean diarrhea) {
        this.diarrhea = diarrhea;
    }

    public Boolean getNausea() {
        return nausea;
    }

    public void setNausea(Boolean nausea) {
        this.nausea = nausea;
    }

    public Boolean getCongestion() {
        return congestion;
    }

    public void setCongestion(Boolean congestion) {
        this.congestion = congestion;
    }

    public Boolean getSoreThroat() {
        return soreThroat;
    }

    public void setSoreThroat(Boolean soreThroat) {
        this.soreThroat = soreThroat;
    }

    public Boolean getLossTaste() {
        return lossTaste;
    }

    public void setLossTaste(Boolean lossTaste) {
        this.lossTaste = lossTaste;
    }

    public Boolean getHeadache() {
        return headache;
    }

    public void setHeadache(Boolean headache) {
        this.headache = headache;
    }

    public Boolean getMuscleAches() {
        return muscleAches;
    }

    public void setMuscleAches(Boolean muscleAches) {
        this.muscleAches = muscleAches;
    }

    public Boolean getFatigue() {
        return fatigue;
    }

    public void setFatigue(Boolean fatigue) {
        this.fatigue = fatigue;
    }

    public Boolean getShortnessBreath() {
        return shortnessBreath;
    }

    public void setShortnessBreath(Boolean shortnessBreath) {
        this.shortnessBreath = shortnessBreath;
    }

    public Boolean getCough() {
        return cough;
    }

    public void setCough(Boolean cough) {
        this.cough = cough;
    }

    public Boolean getFever() {
        return fever;
    }

    public void setFever(Boolean fever) {
        this.fever = fever;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getAutoNum() {
        return autoNum;
    }

    public void setAutoNum(String autoNum) {
        this.autoNum = autoNum;
    }
}