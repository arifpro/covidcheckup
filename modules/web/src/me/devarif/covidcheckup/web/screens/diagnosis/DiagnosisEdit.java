package me.devarif.covidcheckup.web.screens.diagnosis;

import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.screen.*;
import me.devarif.covidcheckup.entity.CovidLevel;
import me.devarif.covidcheckup.entity.Diagnosis;

import javax.inject.Inject;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@UiController("covidcheckup_Diagnosis.edit")
@UiDescriptor("diagnosis-edit.xml")
@EditedEntityContainer("diagnosisDc")
@LoadDataBeforeShow
public class DiagnosisEdit extends StandardEditor<Diagnosis> {

    @Inject
    private DataManager dataManager;
    @Inject
    private Label<String> showMsg;

    @Subscribe("feverField")
    public void onFeverFieldValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        calcTotalScore(Objects.requireNonNull(event.getValue()));
    }

    @Subscribe("coughField")
    public void onCoughFieldValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        calcTotalScore(Objects.requireNonNull(event.getValue()));
    }

    @Subscribe("shortnessBreathField")
    public void onShortnessBreathFieldValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        calcTotalScore(Objects.requireNonNull(event.getValue()));
    }

    @Subscribe("fatigueField")
    public void onFatigueFieldValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        calcTotalScore(Objects.requireNonNull(event.getValue()));
    }

    @Subscribe("muscleAchesField")
    public void onMuscleAchesFieldValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        calcTotalScore(Objects.requireNonNull(event.getValue()));
    }

    @Subscribe("headacheField")
    public void onHeadacheFieldValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        calcTotalScore(Objects.requireNonNull(event.getValue()));
    }

    @Subscribe("lossTasteField")
    public void onLossTasteFieldValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        calcTotalScore(Objects.requireNonNull(event.getValue()));
    }

    @Subscribe("soreThroatField")
    public void onSoreThroatFieldValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        calcTotalScore(Objects.requireNonNull(event.getValue()));
    }

    @Subscribe("congestionField")
    public void onCongestionFieldValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        calcTotalScore(Objects.requireNonNull(event.getValue()));
    }

    @Subscribe("nauseaField")
    public void onNauseaFieldValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        calcTotalScore(Objects.requireNonNull(event.getValue()));
    }

    @Subscribe("diarrheaField")
    public void onDiarrheaFieldValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        calcTotalScore(Objects.requireNonNull(event.getValue()));
    }

    void calcTotalScore(Boolean checked){
        if(checked){
            getEditedEntity().setTotalScore(
                    (getEditedEntity().getTotalScore() == null
                            ?
                            0:
                            getEditedEntity().getTotalScore()
                    ) +1
            );
        }else{
            if(getEditedEntity().getTotalScore() > 0){
                getEditedEntity().setTotalScore(getEditedEntity().getTotalScore() - 1);
            }
        }

        int totalscore = getEditedEntity().getTotalScore();
        //
        List<CovidLevel> results = dataManager.load(CovidLevel.class)
                .query("select e from covidhelper_CovidLevel e where e.score <= :totalscore order by e.score desc")
                .parameter("totalscore", totalscore)
                .list();

        if(results != null){
            showMsg.setValue(results.get(0).getLevel());
        }
    }
    
}