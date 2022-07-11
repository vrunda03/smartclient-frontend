package com.smartclient.propertyreader;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {


    private static volatile PropertyReader propInstance;

    //Created Private constructor Because of prevent the Instantiation of class
    private PropertyReader() {

    }
    /**
     * This method will return instance of PropertyReader class
     * @return
     */
    public static synchronized PropertyReader getInstance(){
        if (propInstance == null){
            propInstance = new PropertyReader();
        }
        return propInstance;
    }
    /**
     * This method will read property from property file
     * @param propertyName
     * @return
     */
    public String getProperty(String propertyName){

        Properties prop = new Properties();
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/resources/propertiesfile/config.properties");
            prop.load(inputStream);
            if (prop.getProperty(propertyName) != null){
                return prop.getProperty(propertyName);
            }
        } catch (Exception e) {
            System.out.println("Property not found");
        }
        return null;
    }

}
