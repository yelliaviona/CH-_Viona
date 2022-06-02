package repository;

import entity.ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ReadFileRepositoryImpl implements ReadFileRepository{

    private final ReadFile readFile = new ReadFile();
    private String line;
    private String[] tempArr;
    private List<Integer> list = new ArrayList<>();
    private int maxCount = 0;
    private int maxValue = 0;
    private double sum = 0;
    private int totalData = 0;
    private int countGreater = 0;
    private int countEqual = 0;
    private int countLessThan = 0;

    @Override
    public Integer getMode() {
        try {
            readFile.setNameFile("data_sekolah.csv");
            FileReader reader = new FileReader(readFile.getNameFile());
            BufferedReader bufferedReader = new BufferedReader(reader);
            while((line = bufferedReader.readLine()) != null){
                this.tempArr = line.split(";");

                for (int i = 1; i < tempArr.length; i++) {
                    list.add(Integer.valueOf(tempArr[i]));
                    int count = 0;
                    for (int j = 1; j < tempArr.length; j++) {
                        if (tempArr[j].equals(tempArr[i])){
                            count++;
                        }
                    }
                    if (count > maxCount){
                        maxCount = count;
                        maxValue = Integer.parseInt(tempArr[i]);
                    }
                }
            }
        } catch (Throwable throwable){
            System.out.println("Error membaca file : " + throwable.getMessage());
        }
        return maxValue;
    }

    @Override
    public Double getAverage() {
        for (Integer s:list) {
            int temp = s;
            sum += temp;
            totalData += 1;
        }
        return sum / totalData;
    }

    @Override
    public double getMedian() {
        Collections.sort(list);
        int middle = list.size()/2;

        if ((list.size()) % 2 == 1){
            return list.get(middle);
        }
        else{
            return (list.get(middle-1) + list.get(middle)) / 2.0;
        }
    }

    @Override
    public HashMap<Integer, Integer> getCountWithBounding() {
        HashMap<Integer, Integer> result = new HashMap<>();
        Collections.sort(list);
        return null;
    }


    @Override
    public int getGreaterThan(Integer input) {
        try {
            readFile.setNameFile("data_sekolah.csv");
            FileReader reader = new FileReader(readFile.getNameFile());
            BufferedReader bufferedReader = new BufferedReader(reader);
            while((line = bufferedReader.readLine()) != null){
                this.tempArr = line.split(";");
                for (int i = 1; i < tempArr.length; i++) {
                    if (input < Integer.parseInt(tempArr[i])){
                        countGreater++;
                    }
                }
            }
        } catch (Throwable throwable){
            System.out.println("Error membaca file : " + throwable.getMessage());
        }
       return countGreater;
    }

    @Override
    public int getEqual(Integer input) {
        try {
            readFile.setNameFile("data_sekolah.csv");
            FileReader reader = new FileReader(readFile.getNameFile());
            BufferedReader bufferedReader = new BufferedReader(reader);
            while((line = bufferedReader.readLine()) != null){
                this.tempArr = line.split(";");
                for (int i = 1; i < tempArr.length; i++) {
                    if (input == Integer.parseInt(tempArr[i])){
                        countEqual++;
                    }
                }
            }
        } catch (Throwable throwable){
            System.out.println("Error membaca file : " + throwable.getMessage());
        }
        return countEqual;
    }

    @Override
    public int getLessThan(Integer input) {
        try {
            readFile.setNameFile("data_sekolah.csv");
            FileReader reader = new FileReader(readFile.getNameFile());
            BufferedReader bufferedReader = new BufferedReader(reader);
            while((line = bufferedReader.readLine()) != null){
                this.tempArr = line.split(";");
                for (int i = 1; i < tempArr.length; i++) {
                    if (input > Integer.parseInt(tempArr[i])){
                        countLessThan++;
                    }
                }
            }
        } catch (Throwable throwable){
            System.out.println("Error membaca file : " + throwable.getMessage());
        }
        return countLessThan;
    }

}