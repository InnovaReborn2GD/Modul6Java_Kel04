package id.fordfiesta.praktikum.modul6;

abstract class Kendaraan {
    private String merek;
    public Kendaraan(String merek) {
        this.merek = merek;
    }
    public abstract void bergerak();
    public String getMerek() {
        return merek;
    }
}
class Mobil extends Kendaraan {
    public Mobil(String merek) {
        super(merek);
    }
    @Override
    public void bergerak() {
        System.out.println(getMerek() + " melaju di jalan Tol.");
    }
}
class Motor extends Kendaraan {
    public Motor(String merek) {
        super(merek);
    }
    @Override
    public void bergerak() {
        System.out.println(getMerek() + " Melaju di Undip.");
    }
}
public class DemoKendaraan {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Mobil");
        Kendaraan motor = new Motor("Motor");
        mobil.bergerak();
        motor.bergerak();
    }
}
