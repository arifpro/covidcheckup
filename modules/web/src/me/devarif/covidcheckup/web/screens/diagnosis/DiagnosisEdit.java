package me.devarif.covidcheckup.web.screens.diagnosis;

import com.haulmont.cuba.gui.screen.*;
import me.devarif.covidcheckup.entity.Diagnosis;

@UiController("covidcheckup_Diagnosis.edit")
@UiDescriptor("diagnosis-edit.xml")
@EditedEntityContainer("diagnosisDc")
@LoadDataBeforeShow
public class DiagnosisEdit extends StandardEditor<Diagnosis> {
}