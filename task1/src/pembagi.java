import java.util.Scanner;
public class pembagi {
    public static void main(String[] args) {

        //operasi pembagian dan modulus
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang di Program Operasi Aritmatika Pembagian");
        System.out.print("Inputkan Angka Pertama : ");

        int Hasil;
        int angka1 = input.nextInt();
        System.out.print("Silahka Inputkan Angka Selanjutnya : ");

        int angka2 = input.nextInt();
        Hasil = angka1/angka2;
        System.out.println("Hasil Bagi Antara Angka Pertama dengan Angka Kedua adalah :" + (angka1 +" / "+angka2+ " = " + Hasil ));
        System.out.println("//////////////////////////////////////");
        System.out.println("Sisa Hasil Bagi nya adalah : " + (angka1 % angka2));


    }

}