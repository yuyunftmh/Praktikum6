public class Persegi extends BangunDatar{

    private final float panjang;
    private final float lebar;


    public Persegi(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        this.warna = "Kuning";
    }

    @Override
    public void gambar() {
        System.out.println("Warna Persegi: " + warna);
    }

    @Override
    public float luas() {
        return panjang * lebar;
    }
}