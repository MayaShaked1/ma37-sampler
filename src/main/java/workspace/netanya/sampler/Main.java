package workspace.netanya.sampler;

import workspace.netanya.sampler.FileReaderETL.CsvReader;
import workspace.netanya.sampler.FileReaderETL.FileReaderETLException;
import workspace.netanya.sampler.dataType.MadaReports;
import workspace.netanya.sampler.settings.Settings;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, FileReaderETLException {
        ArrayList<ArrayList<MadaReports>> m=new ArrayList<>();
        CsvReader c=new CsvReader();
        Settings s=new Settings();
        m=c.FileReaderETL(s.getCsvMada());
        System.out.println(m.toString());
    }
}
