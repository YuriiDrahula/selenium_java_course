package com.automation.gtfcourse.framework.seleniumeasy.tests.logging;

import com.automation.gtfcourse.framework.seleniumeasy.automation.ManagerSeleniumEasy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Story07LoggingLevels extends ManagerSeleniumEasy {

    Logger logger = LogManager.getLogger(Story07LoggingLevels.class);

    @Test
    public void loggingLevels(){
        //Levels of logging
        logger.trace("I'm tracing at the moment");
        logger.debug("I'm debugging at the moment");
        logger.info("I'm showing some info");
        logger.warn("i'm showing you a warning");
        logger.error("I'm showing you an error");
        logger.fatal("Something fatal here! Be careful!");
        System.out.println("This is simple line showing in the console");
    }
}
