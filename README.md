Nama : Putri Anggraini

NPM : (2210010632)

Kelas : (4A Non Reguler Banjarmasin)

Mata Kuliah : Pemrograman Berbasis Objek 1

---

# Deskripsi Program

Program ini dibuat untuk mengelola data barang aset elektronik yang dimiliki perusahaan.

Pengguna dapat menginput data barang berupa:

* Kode Barang
* Nama Barang
* Merk Barang
* Tahun Pembelian
* Kondisi Barang

Program akan menampilkan informasi barang aset elektronik serta menentukan kategori barang berdasarkan kondisi dan tahun pembelian.

---

# Perhitungan Nilai UAS

### 1. Class (5)

Terpenuhi.

Program memiliki beberapa class yaitu:

* BarangAset
* BarangElektronik
* Main

Nilai : 5

---

### 2. Object (5)

Terpenuhi.

Objek dibuat menggunakan keyword new.

Contoh:

java
BarangElektronik barang = new BarangElektronik(
    "BRG001",
    "Laptop",
    "Asus",
    2024,
    "Baik"
);


Nilai : 5

---

### 3. Atribut (5)

Terpenuhi.

Class BarangAset memiliki atribut:

* kodeBarang
* namaBarang

Class BarangElektronik memiliki atribut:

* merk
* tahunPembelian
* kondisi

Nilai : 5

---

### 4. Constructor (5)

Terpenuhi.

Constructor digunakan untuk menginisialisasi objek saat pertama kali dibuat.

Contoh:

java
public BarangAset(String kodeBarang,
                  String namaBarang)


Nilai : 5

---

### 5. Mutator (5)

Terpenuhi.

Menggunakan method setter:

* setKodeBarang()
* setNamaBarang()
* setMerk()
* setTahunPembelian()
* setKondisi()

Nilai : 5

---

### 6. Accessor (5)

Terpenuhi.

Menggunakan method getter:

* getKodeBarang()
* getNamaBarang()
* getMerk()
* getTahunPembelian()
* getKondisi()

Nilai : 5

---

### 7. Encapsulation (5)

Terpenuhi.

Semua atribut menggunakan access modifier private dan diakses melalui getter dan setter.

Contoh:

java
private String kodeBarang;
private String namaBarang;


Nilai : 5

---

### 8. Inheritance (5)

Terpenuhi.

Class BarangElektronik mewarisi class BarangAset menggunakan keyword extends.

Contoh:

java
public class BarangElektronik extends BarangAset


Nilai : 5

---

### 9. Polymorphism (10)

Terpenuhi.

Menggunakan method overriding untuk menampilkan informasi barang.

Contoh:

java
@Override
public void tampilkanData()


Nilai : 10

---

### 10. Seleksi (5)

Terpenuhi.

Menggunakan if-else untuk menentukan kategori kondisi barang.

Contoh:

java
if(kondisi.equals("Baik")) {
    System.out.println("Layak Digunakan");
} else {
    System.out.println("Perlu Perbaikan");
}


Nilai : 5

---

### 11. Perulangan (5)

Terpenuhi.

Menggunakan perulangan for untuk menampilkan data barang.

Contoh:

java
for(int i = 0; i < data.length; i++) {
    data[i].tampilkanData();
}


Nilai : 5

---

### 12. IO Sederhana (10)

Terpenuhi.

Menggunakan Scanner untuk menerima input pengguna.

Contoh:

java
Scanner input = new Scanner(System.in);


Nilai : 10

---

### 13. Array (15)

Terpenuhi.

Menggunakan array objek untuk menyimpan data barang.

Contoh:

java
BarangElektronik[] barang =
    new BarangElektronik[3];


Nilai : 15

---

### 14. Error Handling (15)

Terpenuhi.

Menggunakan try-catch untuk menangani kesalahan input.

Contoh:

java
try {
    tahunPembelian = input.nextInt();
}
catch(Exception e) {
    System.out.println("Input tidak valid");
}


Nilai : 15

---

# Total Nilai

Class : 5

Object : 5

Atribut : 5

Constructor : 5

Mutator : 5

Accessor : 5

Encapsulation : 5

Inheritance : 5

Polymorphism : 10

Seleksi : 5

Perulangan : 5

IO Sederhana : 10

Array : 15

Error Handling : 15

TOTAL NILAI : 100

