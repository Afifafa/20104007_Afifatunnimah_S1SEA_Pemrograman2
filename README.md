# 20104007_Afifatunnimah_S1SEA_Pemrograman2
Mata Kuliah Pemrograman 2
# Modul 2 : Dasar Pemrograman Java

## Dasar Teori
* Keyword dalam Java

  Identifier yang telah dipesan untuk di definisikan sebelumnya oleh Java untuk tujuan tertentu.
* Tipe Dasar

  Java mempunyai 8 tipe dasar, yaitu boolean, char, byte, short, int, long, float, dan juga ada double.
* Variabel

  Ssebagai penanda suatu tipe data ataupun nama pada masing masing identifier.
* Casting dan Promotion

  Biasa diperlukan untuk mengkoversi untuk suatu tipe ke tipe data yang lebih kecil panjang bitnya.

<hr>

## Praktikum
Soal : 
1. Menganalisa batasan maksimum dari suatu tipe
2. Anak Ayam
3. A + B - C

Jawaban :
1. [Jawaban Soal 1](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul2/src/modul2/latihan/BigInteger.java)

  ```java
  long p = 2147483648;
  ```
  
  Syntax diatas akan menampilkan error:
  ```java
  D:\KULIAH_ S1 SOFTWARE ENGINEERING ITTP\AFIFA_ITTP\SEMESTER 3\PRAKTIKUM PEMROGRAMAN 2\20104007_Afifatunnimah_S1SEA_Pemrograman2 modul2.latihan.BigInteger error: integer number   too large: 2147483648
  ```
  
  Mengapa error itu bisa terjadi padahal daya tampung tipe data long adalah 2^63-1 ? Error tersebut terjadi karena java akan membaca syntax tersebut dengan tipe data integer   bukan tipe data long. Jika kita ingin menggunakan tipe data long seperti syntax diatas maka kita harus menambah huruf(suffix) "L" dibelakang angka agar java dapat membaca     tipe data yang kita maksud adalah tipe data long.

  Contoh:
  ```java
  long p = 2147483648L;
  ```
  


2. [Jawaban Soal 2](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul2/src/modul2/latihan/AnakAyam.java)
   
   ```java
   Anak ayam turun 10, Mati 1 tinggal 9
   Anak ayam turun 9, Mati 1 tinggal 8
   Anak ayam turun 8, Mati 1 tinggal 7
   Anak ayam turun 7, Mati 1 tinggal 6
   Anak ayam turun 6, Mati 1 tinggal 5
   Anak ayam turun 5, Mati 1 tinggal 4
   Anak ayam turun 4, Mati 1 tinggal 3
   Anak ayam turun 3, Mati 1 tinggal 2
   Anak ayam turun 2, Mati 1 tinggal 1
   Anak Ayam turun 1, Mati 1 tinggalah induknya
   ```
   
   
   Dengan menggunakan perulangan for, pada codingannya untuk mengulang angka yang telah  diinput, contoh seperti ini 
   ```java
   Masukan Jumlah Ayam : 10
   ```
   
   
3. [Jawaban Soal 3](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul2/src/modul2/latihan/Abc.java)

  Pertama, user akan diminta untuk menginput berapa jumlah testcase yang akan diuji coba, semisal :
  
  ```java
  Masukkan Jumlah Testcase : 2
  ```
  Kemudian sistem akan menampilkan list menurun yaitu ((A1 B1 C1), (A2 B2 C2), (A3 B3 C3)). Sistem ini akan menampilkan jumlah testcase sesuai yang diinputkan oleh user, yaitu sebagai berikut :
  
  ```java
  Masukkan A1 : 4
  Masukkan B1 : 5
  Masukkan C1 : 2

  Masukkan A2 : 3
  Masukkan B2 : 2
  Masukkan C2 : 1

  Masukkan A3 : 6
  Masukkan B3 : 8
  Masukkan C3 : 3
  ```
  Sehingga sistem juga akan menampilkan hasil dari penjumlahan dan pengurangan dari bilangan bulat yang telah diinputkan oleh user
  
  ```java
  A1 + B1 - C1 = 7

  A2 + B2 - C2 = 4

  A3 + B3 - C3 = 11
```

<hr>

## Kesimpulan
  Pada praktikum yang telah dilakukan dapat disimpulkan bahwa mahasiswa mampu untuk
  Mengetahui aturan penamaan identifier, Mengenal dan mengingat kembali kata-kata kunci yang ada di Java yang telah dibahas pada semester sebelumnya, Mengetahui tipe-tipe dasar yang ada di Java dan mahasiswa Mengetahui penggunaan variable pada Java.
