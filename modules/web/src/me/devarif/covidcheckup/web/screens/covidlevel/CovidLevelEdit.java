package me.devarif.covidcheckup.web.screens.covidlevel;

import com.haulmont.cuba.gui.screen.*;
import me.devarif.covidcheckup.entity.CovidLevel;

@UiController("covidcheckup_CovidLevel.edit")
@UiDescriptor("covid-level-edit.xml")
@EditedEntityContainer("covidLevelDc")
@LoadDataBeforeShow
public class CovidLevelEdit extends StandardEditor<CovidLevel> {
}