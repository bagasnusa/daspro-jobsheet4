import java.util.Scanner;

public class hargabayar06 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int harga, jumlah, diskon;
        String merkBuku;
        double jmlHalaman, total, bayar, jmlDis;

        // Membuat objek Scanner untuk masukan dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan harga barang yang dibeli
        System.out.print("Masukkan harga barang yang dibeli: ");
        harga = scanner.nextInt();

        // Meminta pengguna untuk memasukkan jumlah barang yang dibeli
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        jumlah = scanner.nextInt();

        // Meminta pengguna untuk memasukkan merk buku
        System.out.print("Masukkan merk buku: ");
        merkBuku = scanner.next();

        // Meminta pengguna untuk memasukkan jumlah halaman buku
        System.out.print("Masukkan jumlah halaman buku: ");
        jmlHalaman = scanner.nextDouble();

        // Meminta pengguna untuk memasukkan besaran diskon (dalam persen)
        System.out.print("Masukkan besaran diskon (dalam persen): ");
        diskon = scanner.nextInt();

        // Menghitung total harga
        total = harga * jumlah;

        // Menghitung jumlah diskon (diskon dalam persen)
        jmlDis = total * (diskon / 100.0);

        // Menghitung jumlah yang harus dibayar (total harga - jumlah diskon)
        bayar = total - jmlDis;

        // Menampilkan hasil
        System.out.println("Merk Buku: " + merkBuku);
        System.out.println("Jumlah Halaman Buku: " + jmlHalaman);
        System.out.println("Diskon yang anda dapatkan adalah: " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah: " + bayar);

        // Menutup objek Scanner
        scanner.close();
    }
}

