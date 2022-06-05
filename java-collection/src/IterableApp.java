import java.util.Iterator;
import java.util.List;
public class IterableApp {
    public static void main(String[] args) {

 //dengan menggunakan iterable kita bisa ngelakuin foorloop di data iterable tersebut

        Iterable<String> names = List.of("Yellia", "Viona");

        for (var name : names){
            System.out.println(name);
            System.out.println(name);
        }

        System.out.println("ITERATOR");
        Iterator<String> iterator = names.iterator();

        while (iterator.hashNext()){


    }
}
