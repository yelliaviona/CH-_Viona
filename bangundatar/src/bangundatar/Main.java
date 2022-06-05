package bangundatar;

public class Main {
    public static void main(String[] args) {

        bangundatar.BangunDatar bangunDatar = new bangundatar.BangunDatar();
        Persegi persegi = new Persegi(5);
        bangundatar.Segitiga segitiga = new bangundatar.Segitiga(8, 5);
        bangundatar.Lingkaran lingkaran = new Lingkaran(45);

        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("keliling persegi: " + persegi.keliling());
        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.println("Luas lingkaran: " + lingkaran.luas());
        System.out.println("keliling lingkaran: " + lingkaran.keliling());
    }
}