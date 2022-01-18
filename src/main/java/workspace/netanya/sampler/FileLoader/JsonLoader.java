package workspace.netanya.sampler.FileLoader;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class JsonLoader <T> extends FileLoaderETL{

/*
    @Override
    public void FileLoaderETL (ArrayList<ArrayList<T>> arrayListToLoad) throws IOException, FileLoaderETLException {
        ObjectMapper objectMapper = new ObjectMapper();
        Settings s=new Settings();
        String path=s.getPath();
        for(int i=0;i<arrayListToLoad.size();i++)
        {
            String element="/file"+(i+1)+".json";
            String finalPath=path+element;
            objectMapper.writeValue(new File(finalPath),arrayListToLoad.get(i));
        }
    }
*/


    @Override
    public void FileLoaderETL(ArrayList arrayListToLoad, String path) throws IOException, FileLoaderETLException {
        ObjectMapper objectMapper = new ObjectMapper();
        for(int i=0;i<arrayListToLoad.size();i++)
        {
            String element="/file"+(i+1)+".json";
            String finalPath=path+element;
            objectMapper.writeValue(new File(finalPath),arrayListToLoad.get(i));
        }
    }
}
