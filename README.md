# 20104007_Afifatunnimah_S1SEA_Pemrograman2
Mata Kuliah Pemrograman 2
# Modul 4 Dasar Pemrograman Berorientasi Object

## Dasar Teori

A. Information Hiding
 
   Information Hiding adalah menyembunyikan atribut dan method suatu objek dari objek lain. Informasi dari suatu class disembunyikan agar anggota-anggota tersebut tidak dapat        diakses dari luar. Caranya adalah cukup dengan memberikan akses control private ketika mendeklarasikan suatu atribut atau method.
   
B. Encapsulation (Enkapsulasi)

   adalah suatu cara untuk menyembunyikan implementasi detail dari suatu class. Enkapsulasi mempunyai dua hal mendasar, yaitu: Information hiding dan Menyediakan suatu perantara (method) untuk pengaksesan data. 
   
C. Contructor (konstruktor)

  adalah suatu method yang pertama kali dijalankan pada saat pembuatan suatu obyek. Konstruktor ini merupakan method yang berfungsi untuk menginisialisasi variabel-variabel         instans yang akan di miliki oleh objek. Konstruktor dipanggil pada saat proses instansiasi kelas menjadi objek.
  
D. Overloading Constructor 

   merupakan suatu class yang mempunyai lebih dari 1 constructor dengan syarat daftar parameternya tidak boleh ada yang sama. Misalnya Constructor tidak dapat dipanggil secara        langsung, namun harus dipanggil dengan menggunakan operator new pada pembentukan sebuah class.
   
## Praktikum

Soal
1.  Membuat 2 class StudentRecord dan StudentRecordExample dalam project

Jawaban 
1. [Jawaban Soal 1 StudentRecord]()
2. [Jawaban Soal 1 StudentRecordExample]()

 Pertama - tama, kita membuat sebuah method private atau Information Hiding, yang dimana, saat kita panggil, variable yang selain di private
   tidak akan terpanggil, Kita buat class private terlebih dahulu :
   
   ```java
   private String name, address;
   private int age;
   private double mathGrade, englishGrade, scienceGrade, average;
   private static int studentCount;
   ```
   
   name dan address : menggunakan tipe data String
   umur menggunakan : tipe data Age
   mathGrade, englishGrade, scienceGrade, average, menggunakan : tipe data double. 
   
   Selanjutnya, akan membuat getter dan setter dari masing - masing variable yang diprivate tersebut, dengan menggunakan enkapsulasi.
   
   ```java
   public String getName(){
      return name;
   }

   public void setName(String temp){
      name = temp;
   }
   ```
   
   Mebuat public String getterName tersebut untuk memanggil namanya, kemudian nama tersebut, akan dikembalikan.
   setelah itu, buat setter name, dengan tipe data void, yang dimana nama akan di tempatkan pada variable temporary.
   
   Membuat public dengan tipe data double untuk variable getter average, yang berfungsi, untuk menghitung,
   nilai tersebut :
   
   ```java
   public double getAverage(){
      double result = 0;
      result = (mathGrade + englishGrade + scienceGrade) / 3;
      return  result;
    }
   ```
   
   Tipe data double tersebut digunakan untuk menghitung nilai rata rata atau getter average tersebut. Isi dari class data tersebut adalah, tipe data double dengan, variable        result yang bernilai 0, kemudian, result sama dengan nilai mathGrade ditambah dengan englishGrade dan scienceGrade, lalu dibagi dengan 3.
   
   sebelum pembuatan main, harus terlebih dahulu membuat class terakhir yaitu, tipe data integer, menggunakan class static :
   
   ```java
   public static int getStudentCount(){
      return studentCount;
   }
   ```
   Fungsi pada getter StudentCount itu adalah, untuk menghitung jumlah banyaknya siswa, pada data yang diinput oleh seorang user. Yang kemudian pada bagian name, class yang        sebelumnya, kita panggil pada bagian main yaitu :
   
   ```java
   public static void main(String[] args) {
      StudentRecord Wahyu = new StudentRecord();
      StudentRecord Ini = new StudentRecord();
      StudentRecord Nama = new StudentRecord();
   ```
   
   Memanggil constructor yang telah kita buat sebelumnya, dengan menggunakan method overload constructor. 
   Setelah itu, membuat setter name dari masing - masing variable tersebut :
   
   ```java
   Wahyu.setName("Wahyu");
   Ini.setName("Ini");
   Nama.setName("Nama");
   ```
   Pada bagian ini, akan membuat setterName untuk dipanggil saat memunculkan sebuah nama, dengan menggunakan getterName atau getName().
   Setelah itu membuat semua program diatas, maka hasil output yang akan dikeluarkan sistem saat, selesai mengcompile adalah :
   
   ```java
   Wahyu
   Hitung : 0
   ```
   
   Mengapa hasilnya bisa menjadi 0 ?, hal tersebut dikarenakan pada bagian constructornya, tepat pada bagian getAverage, nilai yang diinputkan,
   adalah nilai 0, dan masing - masing dari variable mathGrade, englishGrade dan scienceGrade, tidak, diisi atau masih null.
   
<hr>

## Kesimpulan

Setelah melakukan praktikum pada modul 4 ini mahasiswa diharapkan dapat menerapkan konsep enkapsulasi pada class dan dapat mendeklarasikan suatu constructor
