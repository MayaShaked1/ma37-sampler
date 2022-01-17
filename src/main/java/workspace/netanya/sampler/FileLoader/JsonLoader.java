package workspace.netanya.sampler.FileLoader;

import com.fasterxml.jackson.databind.ObjectMapper;
import workspace.netanya.sampler.dataType.MadaReports;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class JsonLoader extends FileLoaderETL{

    @Override
    public void FileLoaderETL(ArrayList<ArrayList<MadaReports>> arrayListToLoad) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        for(int i=0;i<arrayListToLoad.size();i++)
        {
            String element="/file"+(i+1)+".json";

            objectMapper.writeValue(new File("target/car.json"),arrayListToLoad.get(i));
        }



    }
}
