/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo;

/**
 *
 * @author Asus
 */
public class BarangAset {
      // ATRIBUT + ENCAPSULATION
    private String kodeBarang;
    private String namaBarang;
    private String kondisi;

    // CONSTRUCTOR
    public BarangAset(String kodeBarang, String namaBarang, String kondisi) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.kondisi = kondisi;
    }

    // ACCESSOR (GETTER)
    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getKondisi() {
        return kondisi;
    }

    // MUTATOR (SETTER)
    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    // METHOD
    public void tampilkanData() {
        System.out.println("Kode Barang : " + kodeBarang);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Kondisi     : " + kondisi);
    }
}
