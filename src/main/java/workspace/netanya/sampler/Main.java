package workspace.netanya.sampler;

import workspace.netanya.sampler.FileLoader.FileLoaderETLException;
import workspace.netanya.sampler.FileLoader.JsonLoader;
import workspace.netanya.sampler.FileLoader.XmlLoader;
import workspace.netanya.sampler.FileReaderETL.CsvReader;
import workspace.netanya.sampler.FileReaderETL.FileReaderETLException;
import workspace.netanya.sampler.dataType.LabTests;
import workspace.netanya.sampler.dataType.MadaReports;
import workspace.netanya.sampler.settings.Settings;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, FileReaderETLException, FileLoaderETLException {
        //Part A
        ArrayList<ArrayList<MadaReports>> arrayListsMDA=new ArrayList<>();
        CsvReader c=new CsvReader();
        Settings s=new Settings();
        arrayListsMDA=c.FileCutter(c.FileReaderETL(s.getCsvMada()));
        JsonLoader fileLoader=new JsonLoader();
        fileLoader.FileLoaderETL(arrayListsMDA,s.getPath());

        //Part B
        /*ArrayList<ArrayList<LabTests>> arrayListsLab=new ArrayList<>();
        CsvReader c=new CsvReader();
        Settings s=new Settings();
        arrayListsLab=c.FileReaderETL(s.getCsvLab());
        //System.out.println(arrayListsLab.toString());
        XmlLoader fileLoader=new XmlLoader();
        fileLoader.FileLoaderETL(arrayListsLab,s.getLabPath());*/
        /*//transform
        JsonLoader fileLoader=new JsonLoader();
        fileLoader.FileLoaderETL(arrayListsLab,s.getLabPath());*/

    }
}
