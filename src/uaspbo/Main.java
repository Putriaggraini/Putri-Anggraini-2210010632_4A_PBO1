/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            // ARRAY + OBJECT
            BarangElektronik[] barang =
                    new BarangElektronik[3];

            // PERULANGAN
            for (int i = 0; i < barang.length; i++) {

                System.out.println("\nData Barang Ke-" + (i + 1));

                System.out.print("Kode Barang : ");
                String kode = input.nextLine();

                System.out.print("Nama Barang : ");
                String nama = input.nextLine();

                System.out.print("Kondisi Barang : ");
                String kondisi = input.nextLine();

                System.out.print("Garansi (bulan) : ");
                int garansi = Integer.parseInt(input.nextLine());

                // OBJECT
                barang[i] = new BarangElektronik(
                        kode,
                        nama,
                        kondisi,
                        garansi);
            }

            System.out.println("\n=======================");
            System.out.println("DATA BARANG ASET");
            System.out.println("=======================");

            // PERULANGAN
            for (BarangElektronik data : barang) {

                // SELEKSI
                if (data.getKondisi().equalsIgnoreCase("Baik")) {
                    System.out.println("Status : Layak Digunakan");
                } else {
                    System.out.println("Status : Perlu Perbaikan");
                }

                data.tampilkanData();
            }

        }

        // ERROR HANDLING
        catch (NumberFormatException e) {

            System.out.println("Input garansi harus angka!");

        }

        catch (Exception e) {

            System.out.println("Terjadi Kesalahan : "
                    + e.getMessage());
        }
    }
}
