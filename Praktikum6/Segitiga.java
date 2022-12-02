public class Segitiga extends BangunDatar{

    private final int alas;
    private final int tinggi;

    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.warna = "Merah";
    }

    @Override
    public void gambar() {
        System.out.println("Warna Segitiga: " + warna);
    }

    @Override
    public float luas() {
        return (float) (0.5 * alas * tinggi);
    }
}