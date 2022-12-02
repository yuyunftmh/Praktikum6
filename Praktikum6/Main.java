public class Main {
    public static void main(String[] args) {
        // Membuat Objek Kelas
        BangunDatar persegi = new Persegi(15, 15);
        BangunDatar lingkaran = new Lingkaran(5);
        BangunDatar segitiga = new Segitiga(10, 10);

        // Mengeluarkan gambar
        persegi.gambar();
        lingkaran.gambar();
        segitiga.gambar();

        // Menghitung Luas Bangun Datar
        System.out.println("\nLuas Persegi: " + persegi.luas());
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Luas Segitiga: " + segitiga.luas());
    }
}