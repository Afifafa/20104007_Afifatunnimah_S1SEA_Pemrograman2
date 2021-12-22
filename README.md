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

Pada latihan ini dibuat class bernama Percobaan7 yang dimana Percobaan7 ini untuk menyelesaikan method yang melempar checked exception. Pada kode tersebut menggunakan kata kunci throw,try dan catch. 

Pada method1 menggunakan exception throws untuk menangai terjadinya kesalahan pada file "FileNotFoundException". Kemudian setelah selesai program ditangkap atau catch yang menggunakan "FileNotFoundException" juga sebagai tipe exceptionnya, Kemudian program akan menampilkan hasil pada throw dengan melakukan pemanggilan getMassage dari throw. output program tersebut menyatakn "File Tidak Ada" karena method1 pada blok-try tidak ada data yg dimasukkan perintah exception keluar pada blok-catch

- [LATIHAN 2 Percobaan : Method yang melempar unchecked exception](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul9/src/modul9/latihan/latihan2/Percobaan.java)

Pada program package latihan 2 terdapat class Percobaan yang dimana class ini untuk menyelesaikan method yang melempar unchecked exception. Kode tersebut menggunakan kata kunci try, dan catch. Program ini melakukan proses percabangan yang melibatkan try-catch, pada blok-try melakukan kondisi pertama dan pada blok-catch melakukan kondisi kedua. 

Apabila user memasukkan angka yang kurang dari 10 atau sama dengan 10 maka system akan menampilkan "Angka kurang dari atau sama dengan 10" dan apabila user memasukan lebih dari 10 maka akan ditangkap "catch" berdasarkan exception atau syarat yang sudah ditentukan. Kemudian akan mencetak "Angka lebih dari 10" dan "Selesai"

***
Output pada package Latihan 2 (Angka kurang dari 10)

Masukan Angka	: 8

Angka kurang dari atau sama dengan 10
***

***
Output pada package Latihan 2 (Angka lebih dari 10)

Masukan Angka	: 18

Angka lebih dari 10
***

- [LATIHAN 3 : Menggunakan konsep Inheritance untuk membuat superclass dan subclass exception. Program menangani exception dengan menangkap subclass exception dengan superclass.](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/tree/modul9/src/modul9/latihan/latihan3)

[LATIHAN 3 : ExceptionA](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul9/src/modul9/latihan/latihan3/ExceptionA.java)

[LATIHAN 3 : ExceptionB](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul9/src/modul9/latihan/latihan3/ExceptionB.java)

[LATIHAN 3 : ExceptionC](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul9/src/modul9/latihan/latihan3/ExceptionC.java)

[LATIHAN 3 : Demo](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul9/src/modul9/latihan/latihan3/Demo.java)

Pada package Latihan 3 ini terdapat 4 class yaitu ExceptionA, ExceptionB, ExceptionC dan class Demo. Pada kode tersebut menggunakan kata kunci try, catch, dan throw kode tersebut melakukan inheritance atau pewarisan. Blok-try pertama menampung ekspansi class C, blok-try kedua menampung ekspansi class B, blok-catch pertama menampung ekspansi yang dilempar pada blok-try pertama sehingga mengeluarkan pesan 'ExceptionC' hal itu berlaku juga pada try-catch kedua.

Kemudian pada program try selanjutnya berisikan syntax yang berisikan statement throw new ExceptionB(); yang kemudian program ini melakukan throw pada class yang telah dideklarasikan. Pada catch akan menampilkan penanganan errornya yaitu akan mencetak berdasarkan JOptionPane dengan isi berdasarkan Information.Massage.

program system.exit(0); digunakan untuk keluar dari JOptionPane atau program Pane.

# Kesimpulan

Pada modul 9 ini dapat disimpulkan bahwa praktikum ini mempelajari mengenai exception handling yaitu penanganan ketika terjadi masalah atau error code. Pengunaan exception digunakan pada error code nya dan penanganan yang sesuai jika terjadi error. Kemudian mempelajari penggunaan try, catch, finally, throw dan throws serta contoh penggunaanya. Yang mana penggunaan try-catch dilakukan bersamaan dan try berisikan syntax yang mungkin akan terjadi error atau yang menyebabkan exception. Dan Catch berisikan penanganan error dari program try.

Throw dan throws, yaitu melempar program yang kemungkinan akan terjadi error dan kemudian nantinya akan dilakukan pemanggilannya denga menambahkan exception solusinya. Dan finally digunakan untuk mencetak dari program yang dijalankan atau akhir dari peogram yang dijalakan walau hasilnya normal atau berdasarkan exception yang telah dijalankan.
