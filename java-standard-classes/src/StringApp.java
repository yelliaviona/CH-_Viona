import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

public class StringApp {
    public static void main(String[] args) {

        String name = "Yellia Viona";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);  //utk huruf kecil
        System.out.println(nameUpperCase);  //utk huruf besar
        System.out.println(name.length());  //utk menghitung jumlah karakter
        System.out.println(name.startsWith("Yellia")); // utk cek dimulai string value
        System.out.println(name.endsWith("Viona")); //utk cek di akhiri string value

      //untuk memecah string menjadi perkata
        String[] names = name.split( " ");
        for (var value : names){
            System.out.println(value);

        }

        //untuk mengambil karakter tertentu
        System.out.println(name.charAt(0));

        //untuk memecah karakter

        char[] chars = name.toCharArray();
        for (var value : names){
        System.out.println(value);

    }
}
    }
