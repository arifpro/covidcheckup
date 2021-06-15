package me.devarif.covidcheckup.web.screens.covidlevel;

import com.haulmont.cuba.gui.screen.*;
import me.devarif.covidcheckup.entity.CovidLevel;

@UiController("covidcheckup_CovidLevel.browse")
@UiDescriptor("covid-level-browse.xml")
@LookupComponent("covidLevelsTable")
@LoadDataBeforeShow
public class CovidLevelBrowse extends StandardLookup<CovidLevel> {
}