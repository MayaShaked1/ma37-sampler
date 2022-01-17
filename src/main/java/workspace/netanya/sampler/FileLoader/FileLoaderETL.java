package workspace.netanya.sampler.FileLoader;

import workspace.netanya.sampler.dataType.MadaReports;

import java.io.IOException;
import java.util.ArrayList;

public abstract class FileLoaderETL {
    public abstract void FileLoaderETL(ArrayList<ArrayList<MadaReports>> arrayListToLoad) throws IOException,FileLoaderETLException;
}
