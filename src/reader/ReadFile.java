package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadFile {
    public static List<Integer> read() {
        FileReader reader;
        List<Integer> daftarAngka = new ArrayList<Integer>();
        BufferedReader br;
        try {
            reader = new FileReader("D:\\Documents\\Java Project\\challenge02_nomaven\\data\\data_sekolah.csv");
            br = new BufferedReader(reader);

            String line;
            while ((line = br.readLine()) != null) {
                String[] token = line.split("\\D");
                for (String s : token) {
                    if (s != "") {
                        daftarAngka.add(Integer.valueOf(s));
                        Collections.sort(daftarAngka);
                    }
                }
            }
            reader.close();
            return daftarAngka;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
