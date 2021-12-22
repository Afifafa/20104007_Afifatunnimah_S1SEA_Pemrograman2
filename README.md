# 20104007_Afifatunnimah_S1SEA_Pemrograman2

Mata Kuliah Pemrograman 2

# Modul 9

# Daftar Teori
Exception adalah suatu kondisi abnormal yang terjadi pada saat menjalankan program. Teknik yang dipakai dalam Java untuk menangani kondisi yang tidak biasa saat menjalankan operasi normal dalam program dinamakan exception handling. Karena dalam java segala sesuatu merupakan objek, maka exception juga direpresentasikan dalam sebuah objek yang menjelaskan tentang exception tersebut. Contoh exception adalah pembagian bilangan dengan 0, pengisian elemen array diluar ukuran array, kegagalan koneksi database, file yang akan dibuka tidak ada, dan mengakses objek yang belum diinisialisasi. Terdapat dua penanganan exception yaitu:

a. Menangani sendiri exception tersebut.

b. Meneruskannya ke luar dengan cara membuat objek tentang exception tersebut dan melemparkannya (throw) keluar agar ditangani oleh kode yang memanggil method(method yang didalamnya terdapat exception) tersebut.

Ada lima keyword yang digunakan oleh Java untuk menangani exception yaitu try, catch, finally, throw dan throws.

- Tipe-Tipe Exception
Pada exception, superclass tertinggi adalah class Throwable, tetapi kita hampir tidak pernah menggunakan class ini secara langsung. Dibawah class Throwable terdapat dua subclass yaitu class Error dan class Exception.

- Penggunaan Blok try-catch
Untuk menangani exception dalam program, dengan meletakkan kode program yang memungkinkan terjadinya exception didalam blok try, diikuti dengan blok catch yang menentukan jenis exception yang ingin ditangani.

- Menggunakan Keyword ”finally”
Terdapat kode yang harus dijalankan walaupun terjadi atau tidak terjadi exception, misalkan kita membuka file, hal ini memungkinkan terjadinya exception misal file tidak ada, file tidak bisa dibuka, selanjutnya yang harus dilakukan adalah menutup file tersebut

- Menggunakan Keyword ”throw ” dan ”throws”
Secara eksplisit, kita dapat melempar (throw) exception dari program menggunakan keyword throw. Jika exception tersebut adalah checked exception, maka pada method harus ditambahkan throws. Jika exception tersebut adalah unchecked exception, maka pada method tidak perlu ditambahkan throws.

# Praktikum

SOAL, JAWABAN DAN ANALISIS

- [LATIHAN 1 Percobaan7 : Method yang melempar checked exception](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul9/src/modul9/latihan/latihan1/Percobaan7.java)

- [LATIHAN 2 Percobaan : Method yang melempar unchecked exception](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul9/src/modul9/latihan/latihan2/Percobaan.java)

- [LATIHAN 3 : Menggunakan konsep Inheritance untuk membuat superclass dan subclass exception. Program menangani exception dengan menangkap subclass exception dengan superclass.](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/tree/modul9/src/modul9/latihan/latihan3)

[LATIHAN 3 : ExceptionA](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul9/src/modul9/latihan/latihan3/ExceptionA.java)

[LATIHAN 3 : ExceptionB](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul9/src/modul9/latihan/latihan3/ExceptionB.java)

[LATIHAN 3 : ExceptionC](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul9/src/modul9/latihan/latihan3/ExceptionC.java)

[LATIHAN 3 : Demo](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul9/src/modul9/latihan/latihan3/Demo.java)

# Kesimpulan
