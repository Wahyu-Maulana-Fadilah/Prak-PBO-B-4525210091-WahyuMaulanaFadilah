package contoh01;

public class Main {
    public static void main(String[] args) throws Exception {
        Segitiga s1 = new Segitiga(10, 6, "Merah");
        Lingkaran l1 = new Lingkaran(10, "Biru");

        s1.luas();
        l1.luas();
    }
}
