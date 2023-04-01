package com.qa.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {
    private static Properties prop = new Properties();

    // loading config properties
    Properties getProp() throws IOException {
        InputStream is = null;
        String prosFileName = "config.properties";
        if (prop.isEmpty()) {
            try {
                is = getClass().getClassLoader().getResourceAsStream(prosFileName);
                prop.load(is);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Properties load failed");
            } finally {
                if (is != null) {
                    is.close();
                }
            }
        }
        return  prop;
    }
}


