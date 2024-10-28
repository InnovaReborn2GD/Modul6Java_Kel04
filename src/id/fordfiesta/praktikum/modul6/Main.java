package id.fordfiesta.praktikum.modul6;

public class Main {
    public static void main(String[] args) {
        // Membuat objek BukuFiksi
        Service bukuFiksi = new BukuFiksi();
        bukuFiksi.setJudul("How to remap your grandma's diesel-engined Toyota Innova ECU");
        bukuFiksi.setPenulis("Fadhiel Yuda Ariananto");
        bukuFiksi.setTahunTerbit(2021);

        // Membuat objek BukuNonFiksi
        Service bukuNonFiksi = new BukuNonFiksi();
        bukuNonFiksi.setJudul("Fisika Dasar: Analisis dibalik boneka Ambalabu");
        bukuNonFiksi.setPenulis("Fuad Baswedan, Budiono Siregar");
        bukuNonFiksi.setTahunTerbit(2077);

        // Mencetak informasi BukuFiksi
        System.out.println("Buku Fiksi:");
        cetakInfoBuku(bukuFiksi);

        // Mencetak informasi BukuNonFiksi
        System.out.println("\nBuku Non-Fiksi:");
        cetakInfoBuku(bukuNonFiksi); }

    // Method untuk mencetak informasi buku
    private static void cetakInfoBuku(Service buku) {
        System.out.println("Judul: " + buku.getJudul());
        System.out.println("Penulis: " + buku.getPenulis());
        System.out.println("Tahun Terbit: " + buku.getTahunTerbit());
        System.out.println("Harga: Rp" + buku.hitungHarga());
    }
}
