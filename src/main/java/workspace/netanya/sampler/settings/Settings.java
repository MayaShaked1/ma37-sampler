package workspace.netanya.sampler.settings;

import java.io.*;
import java.util.Properties;

public class Settings {//config getters

    public Properties getProperty() throws IOException {
        InputStream input = new FileInputStream("src/main/resources/properties.properties");
        Properties prop = new Properties();
        // load a properties file
        prop.load(input);
        return prop;
    }

    public String getCsvMada()
    {
        String csvPath = "";
       try {
           Properties properties=getProperty();
           return properties.getProperty("csvSource");
       } catch (IOException e) {
           e.printStackTrace();
       }
        return csvPath;
    }

    public String getCsvLab()
    {
        String csvPath = "";
        try {
            Properties properties=getProperty();
            return properties.getProperty("csvSourceLab");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return csvPath;
    }

    public String getPath()
    {
        String path = "";
        try {
            Properties properties=getProperty();
            return properties.getProperty("path");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }

}
