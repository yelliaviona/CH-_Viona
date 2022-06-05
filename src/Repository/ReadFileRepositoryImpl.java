package Repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ReadFileRepositoryImpl implements ReadFileRepository {
    public ReadFileRepositoryImpl() {
    }

    public Integer countMode(List<Integer> getList) {
        HashMap<Integer, Integer> mapMode = new HashMap();
        int max = 1;
        int temp = 0;
        Collections.sort(getList);
        Iterator var5 = getList.iterator();

        while(var5.hasNext()) {
            Integer x = (Integer)var5.next();
            if (mapMode.get(x) != null) {
                int count = (Integer)mapMode.get(x);
                ++count;
                mapMode.put(x, count);
                if (count > max) {
                    max = count;
                    temp = x;
                }
            } else {
                mapMode.put(x, 1);
            }
        }

        System.out.println(mapMode);
        return temp;
    }

    public Double countMean(List<Integer> getList) {
        double total = 0.0D;

        int s;
        for(Iterator var4 = getList.iterator(); var4.hasNext(); total += (double)s) {
            s = (Integer)var4.next();
        }

        return total / (double)getList.size();
    }

    public double countMedian(List<Integer> getList) {
        Collections.sort(getList);
        double median;
        if (getList.size() % 2 == 1) {
            median = (double)(Integer)getList.get(getList.size() / 2) + (double)(Integer)getList.get(getList.size() / 2 - 1) / 2.0D;
        } else {
            median = (double)(Integer)getList.get(getList.size() / 2);
        }

        return median;
    }

    public List<Integer> readFile() {
        String delimiter = ";";
        ArrayList tempList = new ArrayList();

        try {
            File file = new File("data_sekolah.csv");
            FileReader Filereader = new FileReader(file);
            BufferedReader reader = new BufferedReader(Filereader);

            for(String Line = reader.readLine(); Line != null; Line = reader.readLine()) {
                String[] tempRead = Line.split(delimiter);

                for(int i = 1; i < tempRead.length; ++i) {
                    tempList.add(Integer.valueOf(tempRead[i]));
                }

                System.out.println(" ");
            }

            reader.close();
        } catch (IOException var9) {
            var9.printStackTrace();
        }

        return tempList;
    }

    public Integer getMoreThanMode(HashMap<Integer, Integer> getMapMode, int divider) {
        int count = 0;
        Iterator var4 = getMapMode.keySet().iterator();

        while(var4.hasNext()) {
            Integer l = (Integer)var4.next();
            if (l > divider) {
                ++count;
            } else {
                System.out.println(l + " sebanyak " + getMapMode.get(l));
            }
        }

        System.out.println("lebih dari " + divider + " sebanyak:" + count);
        return null;
    }

    public HashMap<Integer, Integer> countMultipleMode(List<Integer> getList) {
        HashMap<Integer, Integer> mapMode = new HashMap();
        Collections.sort(getList);
        Iterator var3 = getList.iterator();

        while(var3.hasNext()) {
            Integer x = (Integer)var3.next();
            if (mapMode.get(x) != null) {
                int count = (Integer)mapMode.get(x);
                ++count;
                mapMode.put(x, count);
            } else {
                mapMode.put(x, 1);
            }
        }

        return mapMode;
    }

    public Integer getLessThanMode(HashMap<Integer, Integer> getMapMode, int divider) {
        int count = 0;
        Iterator var4 = getMapMode.keySet().iterator();

        while(var4.hasNext()) {
            Integer l = (Integer)var4.next();
            if (l < divider) {
                ++count;
            } else {
                System.out.println(l + " sebanyak " + getMapMode.get(l));
            }
        }

        System.out.println("Kurang dari " + divider + " sebanyak:" + count);
        return null;
    }
}
