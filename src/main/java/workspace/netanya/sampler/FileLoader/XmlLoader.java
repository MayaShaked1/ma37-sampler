package workspace.netanya.sampler.FileLoader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import workspace.netanya.sampler.dataType.LabTests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class XmlLoader extends FileLoaderETL{
    public void FileLoaderETL(ArrayList arrayListToLoad, String path) throws IOException, FileLoaderETLException {
        XmlMapper xmlMapper = new XmlMapper();
        for(int i=0;i<arrayListToLoad.size();i++)
        {
            String element="/file"+(i+1)+".xml";
            String finalPath=path+element;

            xmlMapper.writeValue(new File(finalPath),arrayListToLoad.get(i));
        }
    }
}
