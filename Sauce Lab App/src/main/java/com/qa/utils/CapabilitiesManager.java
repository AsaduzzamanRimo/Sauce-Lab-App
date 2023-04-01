package com.qa.utils;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class CapabilitiesManager {
    public DesiredCapabilities getCaps() throws IOException {
        GlobalParams params = new GlobalParams();
        Properties prop = new PropertyManager().getProp();
        DesiredCapabilities caps = new DesiredCapabilities();

        try {
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, params.getPlatformName());
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, params.getdeviceName());
            caps.setCapability(MobileCapabilityType.UDID, params.getUdid());
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, prop.getProperty("androidAutomationName"));
            caps.setCapability("appPackage", prop.getProperty("androidAppPackage"));
            caps.setCapability("appActivity", prop.getProperty("androidAppActivity"));
            caps.setCapability("SystemPort", params.getSystemPort());
            caps.setCapability("ChromeDriverPort", params.getChromeDriverPort());
            String AndriodAppUrl = System.getProperty("user.dir") + File.separator + "src" +
                    File.separator + "test" + File.separator + "resources" + File.separator + "apps" + prop.getProperty("androidAppName");
            caps.setCapability("app", AndriodAppUrl);
            // return caps;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Properties load failed");
        }

        return caps;
    }

}
