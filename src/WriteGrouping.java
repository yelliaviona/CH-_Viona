import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteGrouping {
    private static final String line = "=======================================================================================";
    private static final String newLine = "\n";

    public static void write(String txtFile, int input) {
        try {
            File file = new File(txtFile);
            String inputString = Integer.toString(input);
            if (file.createNewFile()) {
                System.out.println("New file is created!");
            }
            FileWriter wtr = new FileWriter(file);
            BufferedWriter bwr = new BufferedWriter(wtr);
            bwr.write("Hasil pengolahan nilai: \n");
            bwr.write(line);
            bwr.write(newLine);
            bwr.write("Pengelompokkan nilai dengan acuan nilai ");
            bwr.write(inputString);
            bwr.write("beserta jumlah siswa tiap \n");
            bwr.write(line);
            bwr.write(newLine);
            bwr.write("Daftar nilai yang kurang dari ");
            bwr.write(inputString);
            bwr.write(Grouping.writeLessThan(input));
            bwr.write(newLine);
            bwr.write(newLine);
            bwr.write("Jumlah siswa yang bernilai ");
            bwr.write(inputString);
            bwr.write(" adalah ");
            bwr.write(Grouping.getValue(input));
            bwr.write(newLine);
            bwr.write(newLine);
            bwr.write("Daftar nilai yang lebih dari ");
            bwr.write(inputString);
            bwr.write(newLine);
            bwr.write(Grouping.writeMoreThan(input));
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
