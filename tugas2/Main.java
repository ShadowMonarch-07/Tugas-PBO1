/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author mhmmd
 */
public class Main {
    public static void main(String[] args) {
        // Membuat 2 Object dari masing-masing constructor
        
        // Objek 1: Menggunakan Constructor Default
        Produk produk1 = new Produk();

        // Objek 2: Menggunakan Constructor Custom (Barang Elektronik)
        Produk produk2 = new Produk("SSD 12 Tb", 15000.0, 5);

        System.out.println("=== Tokopedia ===");
        
        // Menampilkan info awal
        System.out.println(produk1.getInfoProduk());
        System.out.println(produk2.getInfoProduk());
        
        System.out.println("\n--- Transaksi Sedang Berjalan ---");
        
        // Melakukan pembelian untuk produk 2
        produk2.kurangiStok(2); // Memanggil method void
        
        // Menampilkan info akhir setelah dibeli
        System.out.println("\n--- Update Info Produk ---");
        System.out.println(produk2.getInfoProduk()); // Memanggil method return
    }
}
