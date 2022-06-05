import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteBasicStatistic {
    private static final String line = "=======================================================================================";
    private static final String newLine = "\n";
    private static final String mean = Double.toString(BasicStatistic.meanCalc());
    private static final String modus = Integer.toString(BasicStatistic.modeCalc());
    private static final String median = Double.toString(BasicStatistic.medianCalc());

    public static void write(String txtFile) {
        try {
            File file = new File(txtFile);
            if (file.createNewFile()) {
                System.out.println("New file is created!");
            }
            FileWriter wtr = new FileWriter(file);
            BufferedWriter bwr = new BufferedWriter(wtr);
            bwr.write("Hasil pengolahan nilai: \n");
            bwr.write(line);
            bwr.write(newLine);
            bwr.write("Nilai rata-rata = ");
            bwr.write(mean);
            bwr.write(newLine);
            bwr.write(newLine);
            bwr.write("Nilai median = ");
            bwr.write(median);
            bwr.write(newLine);
            bwr.write(newLine);
            bwr.write("Nilai modus = ");
            bwr.write(modus);
            bwr.write(newLine);
            bwr.write(newLine);
            bwr.flush();
            bwr.close();
            System.out.println("Succsessfully write to new file!");
        } catch (IOException e) {
            System.out.println("An error occured!");
            e.printStackTrace();
        }
    }
}
