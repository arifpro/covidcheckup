package me.devarif.covidcheckup.web.screens.diagnosis;

import com.haulmont.cuba.gui.screen.*;
import me.devarif.covidcheckup.entity.Diagnosis;

@UiController("covidcheckup_Diagnosis.browse")
@UiDescriptor("diagnosis-browse.xml")
@LookupComponent("diagnosesTable")
@LoadDataBeforeShow
public class DiagnosisBrowse extends StandardLookup<Diagnosis> {
}