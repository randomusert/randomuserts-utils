package io.github.randomusert.mods.rstsutils.api;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.github.randomusert.mods.rstsutils.RandomusertSUtils.MOD_ID;

public class LoggingHelper {
    public static void info(String message) {
         final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
        LOGGER.info("API: " + message);
    }
}
