package workspace.netanya.sampler.FileReaderETL;

import workspace.netanya.sampler.dataType.MadaReports;

import java.util.ArrayList;
import java.util.List;

public class Cutter {
    public ArrayList<ArrayList<MadaReports>> fileCutter(ArrayList<MadaReports> arrayToCut)
    {
        ArrayList<ArrayList<MadaReports>> arrayMada=new ArrayList<>();
        int arraySize=arrayToCut.size();
        if(arraySize<=50000)
            arrayMada.add(arrayToCut);
        else
        {
            int loops=arraySize/50000;
            List<MadaReports> first=arrayToCut.subList(0,49999);
            ArrayList<MadaReports> fisrtListToArrayList = new ArrayList<MadaReports>(first);
            MadaReports details=fisrtListToArrayList.get(0);//adding this line to the beginning of every new arraylist;
            arrayMada.add(fisrtListToArrayList);
            int startIndex=49999;
            int endIndex=99998;
            int count=1;
            while(count<loops)
            {
                List<MadaReports> listSplitArray=arrayToCut.subList(startIndex,endIndex);
                ArrayList<MadaReports> splitListToArrayList = new ArrayList<MadaReports>(listSplitArray);
                splitListToArrayList.set(0,details);
                arrayMada.add(splitListToArrayList);
                startIndex+=49999;
                endIndex+=49999;
                count+=1;
            }
            List<MadaReports> listSplitArrayEnd=arrayToCut.subList(startIndex,arraySize);
            ArrayList<MadaReports> splitListToArrayListEnd = new ArrayList<MadaReports>(listSplitArrayEnd);
            splitListToArrayListEnd.set(0,details);
            arrayMada.add(splitListToArrayListEnd);
        }
        return arrayMada;
    }
}
