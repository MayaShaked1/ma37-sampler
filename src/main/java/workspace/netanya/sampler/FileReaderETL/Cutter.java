package workspace.netanya.sampler.FileReaderETL;

import workspace.netanya.sampler.dataType.MadaReports;

import java.util.ArrayList;
import java.util.List;

public class Cutter<T> {
    public ArrayList<ArrayList<T>> fileCutter(ArrayList<T> arrayToCut)
    {
        ArrayList<ArrayList<T>> arrayMada=new ArrayList<>();
        int arraySize=arrayToCut.size();
        if(arraySize<=50000)
            arrayMada.add(arrayToCut);
        else
        {
            int loops=arraySize/50000;
            List<T> first=arrayToCut.subList(0,49999);
            ArrayList<T> fisrtListToArrayList = new ArrayList<T>(first);
            T details=fisrtListToArrayList.get(0);//adding this line to the beginning of every new arraylist;
            arrayMada.add(fisrtListToArrayList);
            int startIndex=49999;
            int endIndex=99998;
            int count=1;
            while(count<loops)
            {
                List<T> listSplitArray=arrayToCut.subList(startIndex,endIndex);
                ArrayList<T> splitListToArrayList = new ArrayList<T>(listSplitArray);
                splitListToArrayList.set(0,details);
                arrayMada.add(splitListToArrayList);
                startIndex+=49999;
                endIndex+=49999;
                count+=1;
            }
            List<T> listSplitArrayEnd=arrayToCut.subList(startIndex,arraySize);
            ArrayList<T> splitListToArrayListEnd = new ArrayList<T>(listSplitArrayEnd);
            splitListToArrayListEnd.set(0,details);
            arrayMada.add(splitListToArrayListEnd);
        }
        return arrayMada;
    }
}
