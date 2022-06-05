package Repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ReadFileRepositoryImpl implements ReadFileRepository {
    @Override
    public Integer countMode(List<Integer> getList) {
        HashMap<Integer, Integer> mapMode = new HashMap<>();
        int max = 1;
        int temp = 0;
        Collections.sort(getList);
        for (Integer x : getList) {
            if (mapMode.get(x) != null) {
                int count = mapMode.get(x);
                count++;
                mapMode.put(x, count);
                if(count > max){
                    max = count;
                    temp = x;
                }
            }
            else
                mapMode.put(x,1);
        }

        System.out.println(mapMode);

        return temp;
    }

    @Override
    public Double countMean(List<Integer> getList) {
        double total = 0;
        for (int s : getList) {
            total += s;
        }
        return total / (getList.size());
    }

    @Override
    public double countMedian(List<Integer> getList) {
        Collections.sort(getList);
        double median;
        if (getList.size() % 2 == 1)
            median = (getList.get(getList.size() / 2) + getList.get((getList.size() / 2) - 1) / 2.0);

        else

            median = getList.get(getList.size() / 2);
        return median;
    }

    @Override
    public List<Integer> readFile() {
        String delimiter = ";";
        String[] tempRead;
        List<Integer> tempList = new ArrayList<>();
        try {
            File file = new File("data_sekolah.csv");
            FileReader Filereader = new FileReader(file);
            BufferedReader reader = new BufferedReader(Filereader);
            String Line = reader.readLine();

            while (Line != null) {
                tempRead = Line.split(delimiter);
                for (int i = 1; i < tempRead.length; i++) {
                    tempList.add(Integer.valueOf(tempRead[i]));
                }
                System.out.println(" ");
                Line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tempList;
    }

    @Override
    public Integer getMoreThanMode(HashMap<Integer, Integer> getMapMode, int divider) {
        int count = 0;
        for (Integer l : getMapMode.keySet()) {
            if (l > divider){
                count++;
            }
            else {
                System.out.println(l + " sebanyak " + getMapMode.get(l));
            }
        }
        System.out.println("lebih dari "+divider+" sebanyak:" + count);
        return null;
    }

    @Override
    public HashMap<Integer, Integer> countMultipleMode(List<Integer> getList) {
        HashMap<Integer, Integer> mapMode = new HashMap<>();
        Collections.sort(getList);
        for (Integer x : getList) {
            if (mapMode.get(x) != null) {
                int count = mapMode.get(x);
                count++;
                mapMode.put(x, count);
            }
            else
                mapMode.put(x,1);
        }
        return mapMode;
    }

    @Override
    public Integer getLessThanMode(HashMap<Integer,Integer> getMapMode, int divider) {
        int count = 0;
        for (Integer l : getMapMode.keySet()) {
            if (l < divider){
                count++;
            }
            else {
                System.out.println(l + " sebanyak " + getMapMode.get(l));
            }
        }
        System.out.println("Kurang dari "+divider+" sebanyak:" + count);
        return null;
    }
}
