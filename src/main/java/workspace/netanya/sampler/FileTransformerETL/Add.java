package workspace.netanya.sampler.FileTransformerETL;

import health_care_provider.HealthCareInfoProvider;
import health_care_provider.errors.InvalidIdException;
import health_care_provider.models.PersonInsured;

import java.io.IOException;
import java.util.ArrayList;

public class Add <T> extends FileTransformerETL{
    @Override
    public void FileTransformerETL(ArrayList arrayListToLoad) throws IOException {
        //a loop that will know which column to add from the config file(this function "send" id num & id type from arrayListToLoad). Then, call other function that will get the appropriate value. Adding the values to arraylist.
        /*HealthCareInfoProvider healthCareInfoProvider=new HealthCareInfoProvider();
        try {
            PersonInsured person=healthCareInfoProvider.fetchInfo(Integer.parseInt(idNum),Integer.parseInt(idType));
            joinDate= String.valueOf(person.getJoinDate());
            healthCareId= String.valueOf(person.getHealthCareId());
            healthCareName=person.getHealthCareName();

        } catch (InvalidIdException e) {
            e.printStackTrace();
        }*/
    }
}
