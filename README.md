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
2. [Gaji](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul8/src/modul8/latihan/Gaji.java)
3. [VirtualDemo](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul8/src/modul8/latihan/VirtualDemo.java)

# Kesimpulan

