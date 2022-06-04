package service;

import repository.ReadFileRepository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
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
            List<Integer> getList = readFileRepository.readFile();
            File file = new File("median-modus-mean.txt");

            FileWriter writer = new FileWriter(file);
            BufferedWriter bwr = new BufferedWriter(writer);
            bwr.write("Nilai Median : "+readFileRepository.countMedian(getList));
            bwr.newLine();
            bwr.write("Nilai Rata-rata : "+readFileRepository.countMean(getList));
            bwr.newLine();
            bwr.write("Nilai Modus : "+readFileRepository.countMode(getList));
            bwr.flush();
            bwr.close();
        } catch (Throwable throwable){
            System.out.println("Error dalam menulis file, " + throwable.getMessage());
        }
    }

    @Override
    public void showDataBoundedBy() {
        try {
            List<Integer> getList = readFileRepository.readFile();
            HashMap<Integer,Integer> getMapMode = readFileRepository.countMultipleMode(getList);
            File file = new File("pengelompokkan_data.txt");

            System.out.println("Masukkan batas :");
            System.out.print("--> ");
            Integer input = scanner.nextInt();

            FileWriter writer = new FileWriter(file);
            BufferedWriter bwr = new BufferedWriter(writer);

            int countInput = 0;
            for (int i = 1; i < getList.size(); i++) {
                if (input == getList.get(i)){
                    countInput++;
                }
            }
            int countInputMoreThan = 0;
            for (int i = 1; i < getList.size(); i++) {
                if (input < getList.get(i)){
                    countInputMoreThan++;
                }
            }
            int countInputLessThan = 0;
            for (int i = 1; i < getList.size(); i++) {
                if (input > getList.get(i)){
                    countInputLessThan++;
                }
            }
            bwr.write("Total Nilai data sama dengan " + input + " sebanyak: " + countInput);
            bwr.newLine();
            bwr.newLine();
            bwr.write("Data Lebih dari " + input + " sebanyak: " + countInputMoreThan);
            bwr.newLine();

            int counts = 0;
            for (Integer l : getMapMode.keySet()) {
                if (l <= input){
                    counts++;
                }
                else {
                    bwr.write(l + " sebanyak " + getMapMode.get(l));
                    bwr.newLine();
                }
            }
            bwr.newLine();
            bwr.write("Data Kurang dari " + input + " sebanyak: " + countInputLessThan);
            bwr.newLine();
            
            int countss = 0;
            for (Integer l : getMapMode.keySet()) {
                if (l >= input){
                    countss++;
                }
                else {
                    bwr.write(l + " sebanyak " + getMapMode.get(l));
                    bwr.newLine();
                }
            }
            bwr.newLine();
            bwr.flush();
            bwr.close();
        }
        catch (Throwable throwable){
            System.out.println("Error saat mencetak file " + throwable.getMessage());
        }
    }

    @Override
    public void showAll() {

        try {
            List<Integer> getList = readFileRepository.readFile();
            HashMap<Integer,Integer> getMapMode = readFileRepository.countMultipleMode(getList);

            System.out.println("Masukkan batas :");
            System.out.print("--> ");
            Integer input = scanner.nextInt();

            int countInput = 0;
            for (int i = 1; i < getList.size(); i++) {
                if (input == getList.get(i)){
                    countInput++;
                }
            }
            int countInputMoreThan = 0;
            for (int i = 1; i < getList.size(); i++) {
                if (input < getList.get(i)){
                    countInputMoreThan++;
                }
            }
            int countInputLessThan = 0;
            for (int i = 1; i < getList.size(); i++) {
                if (input > getList.get(i)){
                    countInputLessThan++;
                }

            }
            File file = new File("hasil-pengolahan-data-sekolah.txt");
            FileWriter writer = new FileWriter(file);
            BufferedWriter bwr = new BufferedWriter(writer);
            bwr.write("Nilai Median : "+readFileRepository.countMedian(getList));
            bwr.newLine();
            bwr.write("Nilai Rata-rata : "+readFileRepository.countMean(getList));
            bwr.newLine();
            bwr.write("Nilai Modus : "+readFileRepository.countMode(getList));
            bwr.newLine();
            bwr.newLine();
            bwr.write("Total Nilai data sama dengan " + input + " sebanyak: " + countInput);
            bwr.newLine();
            bwr.newLine();
            bwr.write("Data Lebih dari " + input + " sebanyak: " + countInputMoreThan);
            bwr.newLine();

            int counts = 0;
            for (Integer l : getMapMode.keySet()) {
                if (l <= input){
                    counts++;
                }
                else {
                    bwr.write(l + " sebanyak " + getMapMode.get(l));
                    bwr.newLine();
                }
            }
            bwr.newLine();
            bwr.write("Data Kurang dari " + input + " sebanyak: " + countInputLessThan);
            bwr.newLine();

            int countss = 0;
            for (Integer l : getMapMode.keySet()) {
                if (l >= input){
                    countss++;
                }
                else {
                    bwr.write(l + " sebanyak " + getMapMode.get(l));
                    bwr.newLine();
                }
            }
            bwr.newLine();

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