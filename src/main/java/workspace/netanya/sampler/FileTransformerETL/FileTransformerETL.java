package workspace.netanya.sampler.FileTransformerETL;


import java.io.IOException;
import java.util.ArrayList;

public abstract class FileTransformerETL <T> {
    public abstract void FileTransformerETL(ArrayList<ArrayList<T>> arrayListToLoad) throws IOException;
}
