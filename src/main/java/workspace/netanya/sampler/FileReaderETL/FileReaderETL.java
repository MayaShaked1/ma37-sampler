package workspace.netanya.sampler.FileReaderETL;

import workspace.netanya.sampler.dataType.MadaReports;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class FileReaderETL {
    private String fileName;

    public abstract ArrayList<MadaReports> FileReaderETL();
}
