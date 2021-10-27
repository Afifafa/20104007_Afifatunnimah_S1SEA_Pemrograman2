# 20104007_Afifatunnimah_S1SEA_Pemrograman2
Mata Kuliah Pemrograman 2
# Modul 3 : Pengenalan Pemrograman Berorientasi Objek

## Dasar Teori
* Pemrograman Berorientasi Objek

  Pemrograman Berorientasi Objek (Object Oriented Programming/OOP) merupakan pemrograman yang berorientasikan kepada objek, dimana semua data dan fungsi dibungkus dalam           class-class atau object-object.
* Mendeklarasikan Suatu Class

  Class adalah suatu wadah yang berisi abstraksi (pemodelan) dari suatu fungsi objek, yang mendeskripsikan data (sifat karakteristik) dan fungsi yang dimiliki oleh objek           tersebut.
* Mendeklarasikan Suatu Atribut

  Attribut merupakan type data yang terdapat pada suatu object yang berasal dari class. Attribut juga merepresentasikan karakteristik dari suatu object. 
* Mendeklarasikan Suatu Metode

  Metode/method adalah sesuatu yang dapat dilakukan oleh objek. Method implementasinya dalam program ditulis dalam bentuk fungsi. Metode ini menentukan apa yang terjadi ketika     objek itu dibuat serta berbagai operasi yang dapat dilakukan objek.
* Mengakses Anggota Suatu Objek
  
  Untuk mengakses suatu anggota - anggota objek, harus dibuat namanya instance class tersebut terlebih dahulu. 

<hr>

## Praktikum
Soal : 
1. Mengimplementasikan UML Class diagram dalam program untuk Class Tabungan

  |              TABUNGAN            | 
  | -------------------------------- | 
  | +Saldo: int                      | 
  | +Tabungan(initsaldo: int)        |
  | +getSaldo(): int                 |
  | +simpangUang(jumlah: int)        |
  | +ambilUang(jumlah: int): boolean |

Jawaban :
1. [Jawaban Soal 1 Method](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul3/src/modul3/latihan/Method_Latihan1.java)
2. [Jawaban Soal 1 Main](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul3/src/modul3/latihan/latihan1.java)

   Maka, pada UML Class tersebut, diminta untuk menjelaskan dalam bahasa java, yang dimana adalah :
   
   ```java
    int saldo;

    public Method_Latihan1(int saldo) {
        this.saldo = saldo;
    }
    ```
    
    Kemudian, setelah kita membuat saldo dan tabungannya, maka diminta untuk menjelaskan UML Diagram untuk getSaldo dan juga simpanUang :
    
    ```java
    public int getSaldo(){
      return saldo;
    }

    public int simpanUang(int jumlah){
      return saldo = saldo + jumlah;
    }
    ```
    
    
    Pada fungsi simpanUang, apabila kita memasukan jumlah saldo tersebut, maka saldo yang dikembalikan akan sama dengan saldo dan ditambah jumlah. 
    Kemudian, kita akan membuat variable ambilUang terlebih dahulu :
    
    ```java
    public boolean ambilUang(int jumlah){
      if (saldo - jumlah < 0){
         return false;
      } else {
         saldo -= jumlah;
         return true;
      }
    }
    ```
    
    Sehingga sistem akan menampilkan hasil sebagai berikut :
   
    Saldo awal	: 10000
    Jumlah uang yang disimpan	: 8000
    Jumlah uang yang diambil	: 7000	ok
    Jumlah uang yang disimpan	: 1000
    Jumlah uang yang diambil	: 10000	ok
    Jumlah uang yang diambil	: 2500	gagal
    Jumlah uang yang disimpan	: 2000
    Saldo sekarang				= 4000
 
    
    Didalam class boolean ambilUang tersebut, akan ada perumpamaan yang dimana jika saldo kurang dari jumlah maka akan berubah menjadi false.
   berbeda lagi apabila saldo kurang dari sama dengan jumlah, maka akan menjadi true. 
   
<hr>

## Kesimpulan

  Pada praktikum modul 3 ini dapat disimpulkan bahwa, mahasiswa diharapkan dapat mengenal pemrograman berorientasi objek, mendeklarasikan suatu class, suatu atribut, suatu metode serta dapat mengakses anggota suatu obyek.
