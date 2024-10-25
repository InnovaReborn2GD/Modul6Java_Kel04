package id.fordfiesta.praktikum.challenge;

import java.util.Scanner;

// Kelas Buah
abstract class Buah {
    protected double hargaPerUnit;

    public Buah(double hargaPerUnit) {
        this.hargaPerUnit = hargaPerUnit;
    }

    public abstract double hitungHarga(int jumlah);
}

// Subclass Apel
class Apel extends Buah {
    public Apel() {
        super(10000); // Harga per unit Apel
    }

    @Override
    public double hitungHarga(int jumlah) {
        return hargaPerUnit * jumlah;
    }
}

// Subclass Pisang
class Pisang extends Buah {
    public Pisang() {
        super(5000); // Harga per unit Pisang
    }

    @Override
    public double hitungHarga(int jumlah) {
        return hargaPerUnit * jumlah;
    }
}

// Kelas utama
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih buah yang ingin dibeli:");
        System.out.println("1. Apel");
        System.out.println("2. Pisang");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan jumlah buah yang ingin dibeli: ");
        int jumlah = scanner.nextInt();

        Buah buah = null;

        if (pilihan == 1) {
            buah = new Apel();
        } else if (pilihan == 2) {
            buah = new Pisang();
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        double totalHarga = buah.hitungHarga(jumlah);
        System.out.println("Total harga: " + totalHarga);
    }
}
