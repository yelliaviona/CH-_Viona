import java.util.Scanner;

public class ChallengeRevisi {
    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu (){
        boolean exit = false;
        do {


            Scanner VionaInput = new Scanner(System.in);
            double luas_persegi, luas_lingkaran, luas_segitiga, luas_persegiPanjang, VolumeKubus, VolumeBalok, VolumeTabung;

            System.out.println("================================================");
            System.out.println("*****Kalkulator Penghitung Luas dan Volume*****");
            System.out.println("================================================");
            System.out.println(".....MENU UTAMA.....");
            System.out.println("1. Menghitung Luas Bidang \n 2. Menghitung Volume Ruang \n 0. Tutup Aplikasi \n");
            System.out.println("========================================");
            System.out.println("Silahkan Pilih Menu ketik 1/2/0  ");
            System.out.print("Pilihan : ");
            int pilihan = VionaInput.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("1. Menghitung Luas Persegi \n 2. Menghitung Luas Lingkaran \n 3. Menghitung Luas Segitiga \n 4.Menghitung Luas Persegi Panjang \n 0. Kembali Ke Menu Sebelumnya \n ");
                    System.out.println("pilih 1/2/3/4/0:");

                    int pilihan1 = VionaInput.nextInt();
                    switch (pilihan1) {
                        case 1:
                            System.out.println("Masukkan sisi = ");
                            int sisi = VionaInput.nextInt();
                            System.out.println("\nprocessing...\n");
                            System.out.println("Luas Persegi =" + sisi * sisi);
                            break;
                        case 2:
                            System.out.println("Masukkan jari jari = ");
                            double jari_jari = VionaInput.nextInt();
                            System.out.println("\nprocessing...\n");
                            System.out.println("Luas Lingkaran =" + 3.14 * jari_jari * jari_jari);
                            break;
                        case 3:
                            System.out.print("Masukkan Alas : ");
                            int alas = VionaInput.nextInt();
                            System.out.print("Masukkan Tinggi : ");
                            int tinggi = VionaInput.nextInt();
                            System.out.println("\nprocessing...\n");
                            System.out.println("Luas Segitiga = " + (alas * tinggi) / 2);
                            break;
                        case 4:
                            System.out.println("Masukkan panjang = ");
                            int panjang = VionaInput.nextInt();
                            System.out.println("Masukkan lebar = ");
                            System.out.println("\nprocessing...\n");
                            int l = VionaInput.nextInt();
                            System.out.println("Luas Persegi Panjang = " + panjang * l);

                        case 0 : System.exit(0);
                        default:
                            System.out.println("Pilihan tidak tersedia");
                    }
                    break;
                case 2 :
                    System.out.println("1.VolumeKubus \n 2.VolumeBalok \n 3. VolumeTabung\n 0. Kembali ke Menu Sebelumnya \n");
                    System.out.println("pilih 1/2/3/0:");
                    System.out.print(" ");
                    int pilihan2 = VionaInput.nextInt();
                    switch (pilihan2) {
                        case 1:

                            System.out.println("Masukkan sisi = ");
                            int sisi = VionaInput.nextInt();
                            System.out.println("\nprocessing...\n");
                            System.out.println("Volume Kubus adalah =" + (sisi * sisi * sisi));
                            break;
                        case 2:
                            System.out.print("Masukkan Panjang : ");
                            int panjang = VionaInput.nextInt();
                            System.out.print("Masukkan Lebar : ");
                            int lebar = VionaInput.nextInt();
                            System.out.print("Masukkan Tinggi : ");
                            int tinggi = VionaInput.nextInt();
                            System.out.println("\nprocessing...\n");
                            System.out.println("Volume Balok adalah = " + panjang * lebar * tinggi);
                            break;
                        case 3 :
                            System.out.print("Masukkan Jari-jari : ");
                            int jari2 = VionaInput.nextInt();
                            System.out.print("Masukkan Tinggi : ");
                            int tinggi2 = VionaInput.nextInt();
                            System.out.println("\nprocessing...\n");
                            System.out.println("Volume Tabung adalah = " + 3.14 * jari2 * jari2 * tinggi2);
                            System.out.print("Tekan apa saja untuk kembali ke menu sebelumnya");
                            VionaInput.next();
                            mainMenu();
                            break;
                        case 0 : mainMenu();
                        default:
                            System.out.println("Pilihan tidak tersedia");


                    }
            }

        } while (!exit);

    }


}
