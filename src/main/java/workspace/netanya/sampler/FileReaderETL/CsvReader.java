package workspace.netanya.sampler.FileReaderETL;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import workspace.netanya.sampler.dataType.MadaReports;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvReader extends FileReaderETL {

    public MadaReports madaReportsRecords (String [] records)
    {
        String mdaCode=records[0];
        String idNum=records[1];
        String idType=records[2];
        String firstName=records[3];
        String lastName=records[4];
        String city=records[5];
        String street=records[6];
        String buildingNumber=records[7];
        String barcode=records[8];
        String getDate=records[9];
        String takeDate=records[10];
        String resultDate=records[11];
        return new MadaReports(mdaCode,idNum,idType,firstName,lastName,city,street,buildingNumber,barcode,getDate,takeDate,resultDate);
    }
    private final static String COMMA_DELIMITER = ",";
    public ArrayList<MadaReports> FileReaderETL(String fileName) throws IOException {
        ArrayList<MadaReports> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {//"/tmp/username.csv"
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                MadaReports m=madaReportsRecords(values);
                result.add(m);
            }
        }
        return result;
    }
}
