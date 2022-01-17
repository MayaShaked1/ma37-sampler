package workspace.netanya.sampler.settings;

import java.io.*;
import java.util.Properties;

public class Settings {//config getters
    public String getCsvMada()
    {
        String csvPath = "";
        try (InputStream input = new FileInputStream("src/main/resources/properties.properties")) {
            Properties prop = new Properties();
            // load a properties file
            prop.load(input);
            // get the property value and print it out
            return prop.getProperty("csvSource");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return csvPath;
    }
}
