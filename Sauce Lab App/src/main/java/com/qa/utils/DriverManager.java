package com.qa.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.util.Properties;

public class DriverManager {
    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<AppiumDriver>();

    public void setDriver(AppiumDriver driver) {
        DriverManager.driver.set(driver);
    }

    public AppiumDriver getDriver() {
        return driver.get();
    }

    public void initializeDriver() throws Exception {
        AppiumDriver driver = null;
        GlobalParams params = new GlobalParams();
        PropertyManager prop = new PropertyManager();
        CapabilitiesManager caps = new CapabilitiesManager();
        if (driver == null) {
            driver = new AndroidDriver(new ServerManager().getServer().getUrl(), caps.getCaps());
            setDriver(driver);
            System.out.println("Driver initialized");
        }

        if (driver == null) {
            throw new Exception("Driver is not initialized");
        }


    }
}
