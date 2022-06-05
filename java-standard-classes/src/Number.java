public class Number {
    public static void main(String[] args) {


        Integer intValue = 12;
        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String contoh = "122417";

        Integer contohInt = Integer.valueOf(contoh);
        System.out.println(contohInt);

    }
}

