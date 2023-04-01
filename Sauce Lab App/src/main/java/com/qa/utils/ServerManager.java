package com.qa.utils;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;

public class ServerManager {
    public static ThreadLocal<AppiumDriverLocalService> server = new ThreadLocal<>();

    public AppiumDriverLocalService getServer() {
        return server.get();
    }

    public void startServer() {
        AppiumDriverLocalService server = windowsGetAppiumServices();
        server.start();
        if (!server.isRunning()) {
            throw new AppiumServerHasNotBeenStartedLocallyException("Appium Server is not Running");
        }
        // clear the console server log
        server.clearOutPutStreams();
        this.server.set(server);

    }

    public AppiumDriverLocalService getAppiumServerDefault() {
        return AppiumDriverLocalService.buildDefaultService();
    }

    public AppiumDriverLocalService windowsGetAppiumServices() {
        GlobalParams params = new GlobalParams();
        return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingAnyFreePort()
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withLogFile(new File(GlobalParams.getPlatformName() + "_" + GlobalParams.getdeviceName() + "_" + File.separator + "server.log")));
    }

}
