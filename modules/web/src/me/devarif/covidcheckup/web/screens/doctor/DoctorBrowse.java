package me.devarif.covidcheckup.web.screens.doctor;

import com.haulmont.cuba.gui.screen.*;
import me.devarif.covidcheckup.entity.Doctor;

@UiController("covidcheckup_Doctor.browse")
@UiDescriptor("doctor-browse.xml")
@LookupComponent("doctorsTable")
@LoadDataBeforeShow
public class DoctorBrowse extends StandardLookup<Doctor> {
}