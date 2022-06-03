import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import reader.ReadFile;

public class Grouping {
    private static final String newLine = "\n";

    public static Map<Integer, Integer> groupAll() {
        List<Integer> numbers = ReadFile.read();
        Map<Integer, Integer> res = new LinkedHashMap<>();
        // int size = numbers.size();

        for (int nilai : numbers) {
            if (!res.keySet().contains(nilai)) {
                res.put(nilai, 1);
            } else {
                int lastValue = res.get(nilai);
                res.replace(nilai, ++lastValue);
            }
        }
        return res;
    }

    public static Map<Integer, Integer> lessThan(int input) {
        Map<Integer, Integer> data = groupAll();
        Map<Integer, Integer> res = new LinkedHashMap<>();
        Set<Map.Entry<Integer, Integer>> entries = data.entrySet();

        for (Map.Entry<Integer, Integer> entry : entries) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (key < input) {
                res.put(key, value);
            }
        }
        return res;
    }

    public static String writeLessThan(int input) {
        Set<Map.Entry<Integer, Integer>> entries = lessThan(input).entrySet();
        String res = "";
        StringBuffer sbr = new StringBuffer();

        for (Map.Entry<Integer, Integer> entry : entries) {
            int key = entry.getKey();
            int value = entry.getValue();
            sbr.append("Nilai ");
            sbr.append(key);
            sbr.append(" berjumlah ");
            sbr.append(value);
            sbr.append(newLine);
        }
        res = sbr.toString();
        return res;
    }

    public static Map<Integer, Integer> moreThan(int input) {
        Map<Integer, Integer> data = groupAll();
        Map<Integer, Integer> res = new LinkedHashMap<>();
        Set<Map.Entry<Integer, Integer>> entries = data.entrySet();

        for (Map.Entry<Integer, Integer> entry : entries) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (key > input) {
                res.put(key, value);
            }
        }
        return res;
    }

    public static String writeMoreThan(int input) {
        Set<Map.Entry<Integer, Integer>> entries = moreThan(input).entrySet();
        String res = "";
        StringBuffer sbr = new StringBuffer();

        for (Map.Entry<Integer, Integer> entry : entries) {
            int key = entry.getKey();
            int value = entry.getValue();
            sbr.append("Nilai ");
            sbr.append(key);
            sbr.append(" berjumlah ");
            sbr.append(value);
            sbr.append(newLine);
        }
        res = sbr.toString();
        return res;
    }

    public static String getValue(int input) {
        String res = Integer.toString(groupAll().get(input));

        return res;
    }
}
