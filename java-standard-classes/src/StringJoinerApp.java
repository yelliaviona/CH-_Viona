import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(",","[","]");

        joiner.add("Yellia");
        joiner.add("Viona");

        String value = joiner.toString();
        System.out.println(value);
    }
}
