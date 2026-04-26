/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author mhmmd
 */
public class Produk {
    // Atribut
    String namaBarang;
    double harga;
    int stok;

    // Constructor 1: Produk Baru (Default)
    public Produk() {
        this.namaBarang = "Produk";
        this.harga = 0.0;
        this.stok = 0;
    }

    // 2. Constructor 2: Produk dengan Detail (Custom)
    public Produk(String nama, double harga, int stok) {
        this.namaBarang = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // 3. Method Tanpa Nilai Balik (Void)
    public void kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
            System.out.println("Berhasil membeli " + jumlah + " " + namaBarang);
        } else {
            System.out.println("Maaf, stok " + namaBarang + " tidak mencukupi!");
        }
    }

    // 3. Method Dengan Nilai Balik (Return Value)
    public String getInfoProduk() {
        return "Produk: " + namaBarang + " | Harga: Rp" + harga + " | Sisa Stok: " + stok;
    }
}
