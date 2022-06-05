public class StringBuilderApp {
    public static void main(String[] args) {


//        String name = "Yellia";
//        name = name + " " + "Viona";
//        System.out.println(name);
//        jadi memori menyimpan data memakan 2 memori
//        Yellia dan Yellia Viona

        StringBuilder builder = new StringBuilder();
        builder.append ("Yellia");
        builder.append(" ");
        builder.append("viona");

        String name = builder.toString();
        System.out.println(name);
}
}






