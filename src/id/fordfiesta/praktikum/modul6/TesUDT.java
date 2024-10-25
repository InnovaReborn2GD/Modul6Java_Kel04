package id.fordfiesta.praktikum.modul6;

// Ini adalah UDT (User-Defined Type) bernama Kotak class Kotak {
class Kotak {
    private int ukuran;

    // Setter
    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    // Getter
    public int getUkuran() {
        return this.ukuran;
    }
}
public class TesUDT {
    public static void main(String[] args) {
        Kotak persegi = new Kotak();
        persegi.setUkuran(10);
        System.out.println("Ukuran kotak: " + persegi.getUkuran());
    }
}
