import java.util.Scanner;
public class segitigaPascal {
    public static void PrintPascal(int n) {

        //kode pemberian spasi
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) { // looping untuk mencetak spasi
                System.out.print(" ");
            }
            // c=1 untuk nilai 1 di setiap sisi pinggir kiri dan kanan segitiga
            int c = 1;
            //menghitung faktorial
            for (int i = 1; i <= line; i++) {
                System.out.print(c + " ");
                c = c * (line - i) / i;
            }
            System.out.println();
        }

    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Berapa tinggi segitiga yang diinginkaan?");
        int n =sc.nextInt();
        PrintPascal(n);
            }


            }




