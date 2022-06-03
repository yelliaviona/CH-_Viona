package views;

public class ConsoleMenu {
    private static final String line = "======================================";
    private static final String newLine = "\n";
    private static final String inputLine = "--->";

    public static void showMainMenu() {
        System.out.println(newLine);
        System.out.println(line);
        System.out.println("Aplikasi pengolah nilai siswa");
        System.out.println(line);
        System.out.println(
                "Letakkan file csv dengan nama file data_sekola di direktori D://Documents/Java Project/challenge02_nomaven/data");
        System.out.println(newLine);
        System.out.println("Pilih menu: ");
        System.out.println("1. Generate txt untuk menampilkan hasil pengelompokkan");
        System.out.println("2. Generate txt untuk menampilkan hasil mean, modus dan median");
        System.out.println("3. Generate keuda file");
        System.out.println("0. Exit");
        System.out.println(line);
        System.out.print(inputLine);
    }

    public static void showSuccessWriteMenu() {
        System.out.println(newLine);
        System.out.println(line);
        System.out.println("Aplikasi pengolah nilai siswa");
        System.out.println(line);
        System.out.println(
                "File telah digenerate di direktori D://Documents/Java Project/challenge02_nomaven/output");
        System.out.println(newLine);
        System.out.println("1. Kembali ke menu utama");
        System.out.println("0. Exit");
        System.out.println(line);
        System.out.print(inputLine);
    }

    public static void showFailReadMenu() {
        System.out.println(newLine);
        System.out.println(line);
        System.out.println("Aplikasi pengolah nilai siswa");
        System.out.println(line);
        System.out.println(
                "File data_siswa.csv tidak di temukan di direktori D://Documents/Java Project/challenge02_nomaven/data");
        System.out.println(newLine);
        System.out.println("1. Kembali ke menu utama");
        System.out.println("0. Exit");
        System.out.println(line);
        System.out.print(inputLine);
    }

}
