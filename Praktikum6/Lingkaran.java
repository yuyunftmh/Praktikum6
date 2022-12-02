import java.lang.Math;

public class Lingkaran extends BangunDatar{

    private final int r;

    public Lingkaran(int r){
        this.r = r;
        this.warna = "Ijo";
    }

    @Override
    public void gambar() {
        System.out.println("Warna Lingkaran: " + warna);
    }

    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }
}