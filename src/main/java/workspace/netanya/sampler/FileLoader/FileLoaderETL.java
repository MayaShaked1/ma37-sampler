package workspace.netanya.sampler.FileLoader;

import workspace.netanya.sampler.dataType.MadaReports;

import java.io.IOException;
import java.util.ArrayList;

public abstract class FileLoaderETL <T>{
    public abstract void FileLoaderETL(ArrayList<ArrayList<T>> arrayListToLoad,String path) throws IOException,FileLoaderETLException;
}
