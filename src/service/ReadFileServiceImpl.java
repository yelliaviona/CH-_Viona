package service;

import repository.ReadFileRepository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class ReadFileServiceImpl implements ReadFileService{
    private final ReadFileRepository readFileRepository;

    private final Scanner scanner = new Scanner(System.in);

    public ReadFileServiceImpl(ReadFileRepository readFileRepository) {
        this.readFileRepository = readFileRepository;
    }

    @Override
    public void showMedianModusAverage() {
        try{
            System.out.print("Masukkan nama file yang akan digenerate: ");
            String namaFile = scanner.nextLine();
            File file = new File(namaFile+".txt");

            FileWriter writer = new FileWriter(file);
            BufferedWriter bwr = new BufferedWriter(writer);
            bwr.write("Nilai Modus : "+readFileRepository.getMode());
            bwr.newLine();
            bwr.write("Nilai Rata-rata : "+readFileRepository.getAverage());
            bwr.newLine();
            bwr.write("Nilai Median : "+readFileRepository.getMedian());
            bwr.flush();
            bwr.close();
        } catch (Throwable throwable){
            System.out.println("Error dalam menulis file, " + throwable.getMessage());
        }
    }

    @Override
    public void showDataBoundedBy() {
        try{
            System.out.print("Masukkan nama file yang akan digenerate: ");
            String namaFile = scanner.nextLine();
            File file = new File(namaFile+".txt");
            FileWriter writer = new FileWriter(file);

            System.out.println("Masukkan batas :");
            System.out.print("--> ");
            Integer input = scanner.nextInt();

            BufferedWriter bwr = new BufferedWriter(writer);
            bwr.write("Hasil pengelompokkan data dengan nilai batas: " + input);
            bwr.newLine();
            bwr.newLine();
            bwr.write("Jumlah Data yang nilainya lebih dari "+ input + " : " + readFileRepository.getGreaterThan(input));
            bwr.newLine();
            bwr.write("Jumlah Data yang nilainya sama dengan "+ input + " : " + readFileRepository.getEqual(input));
            bwr.newLine();
            bwr.write("Jumlah Data yang nilainya kecil dari "+ input + " : " + readFileRepository.getLessThan(input));
            bwr.flush();
            bwr.close();
        } catch (Throwable throwable){
            System.out.println("Error dalam menulis file, " + throwable.getMessage());
        }
    }

    @Override
    public void showAll() {

        try {
            System.out.print("Masukkan nama file yang akan digenerate: ");
            String namaFile = scanner.nextLine();
            File file = new File(namaFile+".txt");
            FileWriter writer = new FileWriter(file);

            System.out.println("Masukkan batas :");
            System.out.print("--> ");
            Integer input = scanner.nextInt();

            BufferedWriter bwr = new BufferedWriter(writer);
            bwr.write("Nilai Modus : "+readFileRepository.getMode());
            bwr.newLine();
            bwr.write("Nilai Rata-rata : "+readFileRepository.getAverage());
            bwr.newLine();
            bwr.write("Nilai Median : "+readFileRepository.getMedian());
            bwr.newLine();
            bwr.write("Hasil pengelompokkan data dengan nilai batas: " + input);
            bwr.newLine();
            bwr.write("Jumlah Data yang nilainya lebih dari "+ input + " : " + readFileRepository.getGreaterThan(input));
            bwr.newLine();
            bwr.write("Jumlah Data yang nilainya sama dengan "+ input + " : " + readFileRepository.getEqual(input));
            bwr.newLine();
            bwr.write("Jumlah Data yang nilainya kecil dari "+ input + " : " + readFileRepository.getLessThan(input));
            bwr.flush();
            bwr.close();

        } catch (Throwable throwable){
            System.out.println("Error dalam menulis file, "+ throwable.getMessage());
        }
    }

    @Override
    public void showMenu() {

        System.out.println("--------------------------------------------------");
        System.out.println("Aplikasi Pengolah Nilai Siswa");
        System.out.println("---------------------------------------------------");
        System.out.println("Letakkan file csv dengan nama data_sekolah di direktori yang sama dengan aplikasi ini");

        System.out.println("Jika sudah yakin, silahkan tekan enter");
        try{
            System.in.read();
            System.out.println("Silahkan pilih menu");
            System.out.println("1. Generate file untuk menampilkan mean, median, dan modus");
            System.out.println("2. Generate file untuk menampilkan pengelompokkan data");
            System.out.println("3. Generate kedua file");
            System.out.println("0. Exit");
            System.out.print("---> ");
            String menu = scanner.nextLine();

            switch (menu.toLowerCase()) {
                case "1" -> {
                    showMedianModusAverage();
                    responseMenu();
                }
                case "2" -> {
                    showDataBoundedBy();
                    responseMenu();
                }
                case "3" -> {
                    showAll();
                    responseMenu();
                }
                case "0" -> System.exit(0);
                default->{
                    System.out.println("Pilihan tidak dimengerti");
                    this.showMenu();
                }
            }
        }
        catch(Exception e){

        }
    }

    @Override

    public void responseMenu() {
                System.out.println("--------------------------------------------------");
                System.out.println("Aplikasi Pengolah Nilai Siswa");
                System.out.println("---------------------------------------------------");
                System.out.println("File telah digenerate di directory yang sama dengan program, silahkan di cek");
                System.out.println();
                System.out.println("1. Kembali ke menu utama");
                System.out.println("0. Exit");
                System.out.print("---> ");
                String responseMenu = scanner.nextLine();

                switch (responseMenu.toLowerCase()){
                    case "1" -> showMenu();
                    case "0" -> System.exit(0);
                    default -> responseMenu();
                }
        }
}