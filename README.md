# 20104007_Afifatunnimah_S1SEA_Pemrograman2
Mata Kuliah Pemrograman 2
# Modul 5 Mengelola Class

## Dasar Teori

A. Package

   Package adalah suatu cara untuk meyimpan berbagai class (banyak class dalam satu package) yang akan kita buat, sehingga kita dapat mengelompokan class-class dalam package berdasarkan kategori tertentu.    
   
B. Import Class

   Perintah import digunakan untuk memberitahukan kepada program untuk mengacu pada class-class yang terdapat dalam package tertentu, Perintah import digunakan untuk membuka dan menjalankan class-class tersebut. Sedangkan untuk mengimpor class tertentu kita dapat menuliskan nama class setelah nama package.    
   
C. Kata kunci this

   Kata kunci ini digunakan dalam sebuah class untuk menyatakan object sekarang. Kata kunci this sangat berguna untuk menunjukkan suatu member dalam class-nya sendiri. this dapat digunakan baik untuk data member maupun untuk function member, serta dapat juga digunakan untuk konstruktor. 
      
## Praktikum
Soal 
1. Mengimplementasikan UML class diagram dalam program untuk package perbankan!

Jawaban
1. [Nasabah](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul5/src/modul5/latihan/perbankan/Nasabah.java)
2. [Tabungan](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul5/src/modul5/latihan/perbankan/Tabungan.java)
3. [Jawaban Soal No 1 TesLatihan](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul5/src/modul5/latihan/TesLatihan.java)

Penjelasan

- class Nasabah

  Dalam modul 5 ini terdapat package perbakan. yang dimana didalam package ini terdapat 2 class yaitu class nasabah dan class tabungan. 
  Pada class nasabah digunakan untuk menyimpan menyimpan data identitas dari nasabah suatu bank. Pada class ini diawali dengan deklarasi, deklarasi tersebut yaitu :

```java
   private String namaAwal;
   private String namaAkhir;
   private Tabungan tabungan;
```
Kemudian pada method Nasabah menggunakan keyword sebagai berikut :

```java
public Nasabah(String namaAwal, String namaAkhir){
       this.namaAwal = namaAwal;
       this.namaAkhir = namaAkhir;
    }
```

Pada method tersebut terdapat atribut namaAwal dan namaAkhir. Method Nasabah(namaAwal, namaAkhir) akan disimpan pada atribut namaAwal dan namaAkhir pada class Nasabah tersebut.

Begitu juga dengan Method setTabungan

```java
public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
}
```

- class Tabungan

Pada class Tabungan ini digunakan untuk menyimpan data nominal uang yang dimasukkan ataupun data uang yang akan diambil. Pada class ini diawali dengan deklarasi atribut saldo sebagai tempat menyimpan data uang, dengan jumlah nominal uang yang diinputkan oleh user.
   
```java
private int saldo;
private int jumlah;
```

Setelah itu pada method Tabungan menggunakan kata kunci yang merujuk pada atribut saldo

```java
public Tabungan(int saldo){
       this.saldo = saldo;
    }
```

- class TesLatihan pada package latihan.

Pada class ini digunakan untuk memanggil class Nasabah dan class Tabungan menggunakan perintah import untuk memanggil class lain.
   
```java
import modul5.latihan.perbankan.Nasabah;
import modul5.latihan.perbankan.Tabungan;
```
Pada class ini terdapat main user, yang dimana digunakan untuk menyimpan atau mengambil uang yang ada pada Tabungan.

# Kesimpulan

Yang dapat disimpulkan dari praktikum modul 5 ini yaitu mahasiswa mampu memahami cara menggunakan perintah import untuk mengakses class dari package lain. Dapat memahami fungsi dan cara menggunakan keyword this.
