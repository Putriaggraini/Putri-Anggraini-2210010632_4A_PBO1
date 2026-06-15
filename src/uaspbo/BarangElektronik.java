/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo;

/**
 *
 * @author Asus
 */
public class BarangElektronik extends BarangAset {
    
    private int garansi;
    

    // CONSTRUCTOR
    public BarangElektronik(String kodeBarang,
                            String namaBarang,
                            String kondisi,
                            int garansi) {

        super(kodeBarang, namaBarang, kondisi);
        this.garansi = garansi;
    }

    public int getGaransi() {
        return garansi;
    }

    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

    // POLYMORPHISM
    @Override
    public void tampilkanData() {

        super.tampilkanData();

        System.out.println("Garansi     : "
                + garansi + " Bulan");

        System.out.println("-------------------------");
    }
    
}
