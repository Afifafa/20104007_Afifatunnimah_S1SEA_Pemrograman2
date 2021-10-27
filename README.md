# 20104007_Afifatunnimah_S1SEA_Pemrograman2
Mata Kuliah Pemrograman 2
# Modul 3 : Pengenalan Pemrograman Berorientasi Objek

## Dasar Teori
* Pemrograman Berorientasi Objek

  Merupakan pemrograman yang berorientasikan kepada objek, yang dimana semua fungsi dibungkus dalam class objek.
* Mendeklarasikan Suatu Class

  Class, merupakan wadah yang berisi pemodelan dari suatu objek atau benda, yang mendeskripsikan suatu data.
* Mendeklarasikan Suatu Atribut

  Attribut yang merupakan suatu nilai, yang terdapat pada suatu objek, yang merupakan berasal dari class. 
* Mendeklarasikan Suatu Metode

  Sesuatu yang dapat dilakukan oleh objek, yang dimana dalam metode implementasinya program ditulis dalam berbentuk fungsi.
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
1. [Jawaban Soal 1](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul3/src/modul3/latihan/latihan1.java)

   Jadi, pada UML Class diatas, diminta untuk menjelaskan dalam bahasa java, yang dimana adalah :
   
   java
    int saldo;
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    
    
    Kemudian, setelah kita membuat saldo dan tabungannya, maka diminta untuk menjelaskan UML Diagram untuk getSaldo dan juga simpanUang :
    
    ```java
    public int getSaldo(){
      return saldo;
    }

    public int simpanUang(int jumlah){
      return saldo = saldo + jumlah;
    }
    ```
    
    
    Pada fungsi simpanUang, dimana jika kita memasukan jumlah saldo tersebut, maka, saldo yang dikembalikan akan sama dengan saldo dan ditambah jumlah. 
    Kemudian, kita akan akan membuat variable ambilUang terlebih dahulu :
    
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
    
    Dimana, didalam class boolean ambilUang tersebut, akan ada perumpamaan, dimana jika saldo kurang dari jumlah, maka akan berubah menjadi false.
    Lain hal, jika saldo kurang dari sama dengan jumlah, maka akan menjadi true. 
   
<hr>

## Kesimpulan

Kesimpulan pada praktikum modul 3 ini adalah, mahasiswa mengenal bagaimana cara menggunakan pemrograman berorientasi objek, dan bagaimana cara kerja masing - masing
pemrograman, saat dijalankan.
