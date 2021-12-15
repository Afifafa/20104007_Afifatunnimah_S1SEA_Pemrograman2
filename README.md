# 20104007_Afifatunnimah_S1SEA_Pemrograman2

Mata Kuliah Pemrograman 2

# MODUL 8

# Dasar Teori
  Polymorphism (polimorfisme) adalah kemampuan untuk mempunyai beberapa bentuk class yang berbeda. Polimorfisme ini terjadi pada saat suatu obyek bertipe parent class, akan tetapi pemanggilan constructornya melalui subclass.
  
  Virtual Method Invocation (VMI) bisa terjadi jika terjadi polimorfisme dan overriding. Pada saat obyek yang sudah dibuat tersebut memanggil overridden method pada parent class, kompiler Java akan melakukan invocation (pemanggilan) terhadap overriding method pada subclass, dimana yang seharusnya dipanggil adalah overridden method. 
  
  Polymorphic arguments adalah tipe suatu parameter yang menerima suatu nilai yang bertipe subclass-nya.Pernyataan instanceof sangat berguna untuk mengetahui tipe asal dari suatu polymorphic arguments.
  
  Seringkali pemakaian instanceof diikuti dengan casting object dari tipe parameter ke tipe asal. Misalkan saja program kita sebelumnya. Pada saat kita sudah melakukan instanceof dari tipe Manajer, kita dapat melakukan casting object ke tipe asalnya, yaitu Manajer. Caranya adalah seperti berikut:
  
  ```java
  …
  if (peg instanceof Manajer) { Manajer man = (Manajer) peg;
  …lakukan tugas-tugas manajer…
  }
  ```
  
# Praktikum
SOAL, JAWABAN DAN ANALISIS

1. [Pegawai](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul8/src/modul8/latihan/Pegawai.java)

  Pada pembuatan class Pegawai ini yang pertama yaitu membuat constructornya. Setelah itu mendeklarasikan variable name, address dengan menggunakan tipe data String serta mendeklarasikan juga variable number dengan menggunakan tipe data integer / int yang di private. Kemudian membuat class Pegawai menjadi public. Setelah membuat class Pegawai menjadi public, dengan menggunakan parameter dua string yaitu name dan addres, dan satu int atau integer yaitu number. Hal tersebut untuk memanggil "Menyusun pegawai".
  Menyusun pegawai berfungsi sebagai menerima inputan yang diterima pada class main nantinya. Sehingga yang akan diinputkan masuk kepada method tersebut. Lalu membuat name, address, dan number menggunakan this, this disini untuk mempresentasikan objectnya. Maka sama halnya dengan name, address dan juga number. Setelah itu, membuat method mailCheck dan toString untuk mengecheck dan mengembalikan data - data yang sudah di input diawal. 
  
  ```java
  public void mailCheck(){
      System.out.println("Memeriksa Surat Untuk " + this.name + " " + this.address);
   }
   public String toString(){
      return name + " " + address + " " + number;
   }
   ```
   
   Fungsi dari mailCheck adalah memeriksa surat untuk siapa, atau akan diberikan kepada siapa dan akan menampilkan alamat yang dituju, yang telah diinputkan sebelumnya. toString, untuk merepresentasikan object kedalam bentuk object. Kemudian membuat getName dan juga getAddress sebagai lanjutan methodnya. 
   Pada fungsi dari getter name dan getter address ini adalah, mengumpulkan dari data yang sudah kita inputkan nanti pada di main. Fungsi dari setter Address dengan menggunakan parameter dengan tipe data String dengan variable newAddress, yang mana data yang disimpan pada variable address akan sama dengan variable newAddress, sama juga dengan getter number. 
   
3. [Gaji](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul8/src/modul8/latihan/Gaji.java)
4. [VirtualDemo](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul8/src/modul8/latihan/VirtualDemo.java)

***
Hasil Running
***

Menyusun Pegawai

Memanggil mailCheck Berdasarkan Referensi Gaji --

Memeriksa kelas gaji dalam surat 

Memeriksa tertuju untuk Wahyu dengan gaji 5000.0

Memanggil mailCheck Berdasarkan Referensi Pegawai --

Memeriksa kelas gaji dalam surat 

Memeriksa tertuju untuk Ini nama dengan gaji 2500.0
***

# Kesimpulan

