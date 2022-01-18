package workspace.netanya.sampler.FileReaderETL;

import health_care_provider.HealthCareInfoProvider;
import health_care_provider.errors.InvalidIdException;
import health_care_provider.models.PersonInsured;
import workspace.netanya.sampler.dataType.LabTests;
import workspace.netanya.sampler.dataType.MadaReports;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvReader <T> extends FileReaderETL {

    public LabTests labTestsRecords (String [] records)
    {
        String idNum=records[0];
        String idType=records[1];
        String firstName=records[2];
        String lastName=records[3];
        String resultDate=records[4];
        String birthDate=records[5];
        String labCode=records[6];
        String stickerNumber=records[7];
        String resultTestCorona=records[8];
        String variant=records[9];
        String testType=records[10];
        String joinDate=null;
        String healthCareId=null;
        String healthCareName=null;
        return new LabTests(idNum,idType,firstName,lastName,resultDate,birthDate,labCode,stickerNumber,resultTestCorona,
                variant,testType,joinDate,healthCareId,healthCareName);
    }

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
    public ArrayList<T> FileReaderETL(String fileName) throws FileReaderETLException, IOException {
        ArrayList<T> resultBeforeCutting = new ArrayList<T>();
        //ArrayList<ArrayList<T>> resultAfterCutting = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                T data= (T) madaReportsRecords(values); //mda
                //T data= (T) labTestsRecords(values);
                resultBeforeCutting.add(data);
            }
            /*Cutter cut=new Cutter();
            resultAfterCutting=cut.fileCutter(resultBeforeCutting);*/
        }
        return resultBeforeCutting;
    }

    public ArrayList<ArrayList<T>> FileCutter(ArrayList<T>resultBeforeCutting)
    {
        ArrayList<ArrayList<T>> resultAfterCutting = new ArrayList<>();
        Cutter cut=new Cutter();
        resultAfterCutting=cut.fileCutter(resultBeforeCutting);
        return resultAfterCutting;
    }
}
