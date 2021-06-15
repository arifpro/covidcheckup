package me.devarif.covidcheckup.web.screens.patient;

import com.haulmont.cuba.gui.screen.*;
import me.devarif.covidcheckup.entity.Patient;

@UiController("covidcheckup_Patient.edit")
@UiDescriptor("patient-edit.xml")
@EditedEntityContainer("patientDc")
@LoadDataBeforeShow
public class PatientEdit extends StandardEditor<Patient> {
}