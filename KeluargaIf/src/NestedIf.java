public class NestedIf {
    public static void main(String[] args) {


        int a = 3;
        int b = 4;

        if (a == 3) {
            if (b == 5) {
                System.out.println("nilai dimana a=3 dan b bernilai salah");
            } else if (b == 4) {
                System.out.println("nilai dimana a=3 dan b=4");
            } else {
                System.out.println("defauld 2");
            }
        } else {
            System.out.println("defauld 1");
        }

    }
}
