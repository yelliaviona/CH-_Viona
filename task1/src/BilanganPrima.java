import java.util.Scanner;
public class BilanganPrima {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num, cek=0;

        System.out.print("Silahkan Entrykan Angka : ");
        num=input.nextInt();

        System.out.println("========================================");
        for (int i=2; i<=num; i++){
            if (num%i==0){
                cek++;            }
        }

        if (cek==1){
            System.out.println(num+" merupakan bilangan prima");
        }else {
            System.out.println(num+" bukan merupakan bilangan prima");
        }
    }
}