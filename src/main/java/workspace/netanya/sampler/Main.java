package workspace.netanya.sampler;

import workspace.netanya.sampler.FileReaderETL.CsvReader;
import workspace.netanya.sampler.dataType.MadaReports;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<ArrayList<MadaReports>> m=new ArrayList<>();
        CsvReader c=new CsvReader();
        m=c.FileReaderETL("src/main/resources/MadaReports.csv");
/*        for(int i = 0; i < 10; i++) {
            System.out.print((m.get(i)).toString());
        }*/
        System.out.println(m.toString());
    }
}
