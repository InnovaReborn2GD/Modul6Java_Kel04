package id.fordfiesta.perpustakaan;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Kelas abstrak Buku
abstract class Buku {
    private String judul;
    private String penulis;
    private int jumlahHalaman;

    public Buku(String judul, String penulis, int jumlahHalaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
    }

    // Getter dan Setter
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    // Metode abstrak
    public abstract void displayInfo();
}

// Kelas BukuFiksi yang mewarisi dari Buku
class BukuFiksi extends Buku {
    public BukuFiksi(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis, jumlahHalaman);
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Buku Fiksi ===");
        System.out.println("Judul: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Jumlah Halaman: " + getJumlahHalaman());
    }
}

// Kelas BukuNonFiksi yang mewarisi dari Buku
class BukuNonFiksi extends Buku {
    public BukuNonFiksi(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis, jumlahHalaman);
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Buku Non-Fiksi ===");
        System.out.println("Judul: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Jumlah Halaman: " + getJumlahHalaman());
    }
}

// Kelas Peminjaman
class Peminjaman {
    private Buku buku;
    private String namaPeminjam;
    private Date tanggalPeminjaman;

    public Peminjaman(Buku buku, String namaPeminjam, Date tanggalPeminjaman) {
        this.buku = buku;
        this.namaPeminjam = namaPeminjam;
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    // Getter dan Setter
    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public Date getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public void setTanggalPeminjaman(Date tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public void displayInfo() {
        System.out.println("=== Info Peminjaman ===");
        buku.displayInfo();
        System.out.println("Nama Peminjam: " + namaPeminjam);
        System.out.println("Tanggal Peminjaman: " + tanggalPeminjaman);
    }
}

// Kelas utama
public class Main {
    public static void main(String[] args) {
        // Membuat daftar buku
        List<Buku> koleksiBuku = new ArrayList<>();
        koleksiBuku.add(new BukuFiksi("Laskar Pelangi", "Andrea Hirata", 529));
        koleksiBuku.add(new BukuNonFiksi("Belajar Pemrograman Java", "Budi Raharjo", 320));

        // Menampilkan informasi buku
        for (Buku buku : koleksiBuku) {
            buku.displayInfo();
            System.out.println();
        }

        // Membuat peminjaman
        Peminjaman peminjaman = new Peminjaman(
                koleksiBuku.get(0),
                "Andi",
                new Date()
        );

        // Menampilkan informasi peminjaman
        peminjaman.displayInfo();
    }
}


