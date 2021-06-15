package me.devarif.covidcheckup;

import com.haulmont.cuba.web.testsupport.TestContainer;

import java.util.ArrayList;
import java.util.Arrays;

public class CovidcheckupWebTestContainer extends TestContainer {

    public CovidcheckupWebTestContainer() {
        appComponents = new ArrayList<>(Arrays.asList(
                "com.haulmont.cuba"
                // add CUBA add-ons and custom app components here
        ));
        appPropertiesFiles = Arrays.asList(
                // List the files defined in your web.xml
                // in appPropertiesConfig context parameter of the web module
                "me/devarif/covidcheckup/web-app.properties",
                // Add this file which is located in CUBA and defines some properties
                // specifically for test environment. You can replace it with your own
                // or add another one in the end.
                "com/haulmont/cuba/web/testsupport/test-web-app.properties"
        );
    }

    public static class Common extends CovidcheckupWebTestContainer {

        // A common singleton instance of the test container which is initialized once for all tests
        public static final CovidcheckupWebTestContainer.Common INSTANCE = new CovidcheckupWebTestContainer.Common();

        private static volatile boolean initialized;

        private Common() {
        }

        @Override
        public void before() throws Throwable {
            if (!initialized) {
                super.before();
                initialized = true;
            }
            setupContext();
        }

        @Override
        public void after() {
            cleanupContext();
            // never stops - do not call super
        }
    }
}