package com.crm.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1 Create the Properties object(creat the object)
    // make it "private" so we are limiting access to the object
    //"static" is to make sure its created and loaded before everything else

    private static Properties properties = new Properties();

    static {
        try {
            //2 Open file using FileInputStream(open the file)
            FileInputStream file = new FileInputStream("configuration.properties");
            //3Load the "properties" object with file
            properties.load(file);
            file.close();

        } catch (IOException e) {
            e.printStackTrace();

            System.out.println("File NOT FOUND WITH GIVEN PATH!!!!!");
        }
    }
    // create a utility method to use the object to read

    //4 use "properties" object to read from the file

    public static String getProperty(String keyword) {

        return properties.getProperty(keyword);

    }
}
