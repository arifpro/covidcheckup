package me.devarif.covidcheckup.web.screens.patient;

import com.haulmont.cuba.gui.screen.*;
import me.devarif.covidcheckup.entity.Patient;

@UiController("covidcheckup_Patient.browse")
@UiDescriptor("patient-browse.xml")
@LookupComponent("patientsTable")
@LoadDataBeforeShow
public class PatientBrowse extends StandardLookup<Patient> {
}