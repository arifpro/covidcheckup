package me.devarif.covidcheckup.web.screens.doctor;

import com.haulmont.cuba.gui.screen.*;
import me.devarif.covidcheckup.entity.Doctor;

@UiController("covidcheckup_Doctor.edit")
@UiDescriptor("doctor-edit.xml")
@EditedEntityContainer("doctorDc")
@LoadDataBeforeShow
public class DoctorEdit extends StandardEditor<Doctor> {
}