# 20104007_Afifatunnimah_S1SEA_Pemrograman2
Mata Kuliah Pemrograman 2

# Modul 7

## Dasar Teori

  Overloading adalah suatu keadaan dimana ada beberapa method dengan nama yang sama pada suatu class tetapi dengan parameter yang berbeda (mempunyai implementasi dan return value). Tujuan dibuatnya overloading yaitu memudahkan pengguna method dengan fungsi yang hampir sama.
  
  Overloading ini dapat terjadi pada class yang sama atau pada suatu parent class dan subclass-nya. Overloading mempunyai ciri-ciri sebagai 
berikut :
- Nama Method harus sama
- Daftar parameter harus berbeda
- Return type boleh sama,juga boleh berbeda

  Overriding tidak sama dengan overloading, Overriding merupakan mekanisme dimana sebuah metode dapat dideklarasikan ulang pada kelas turunannya. Overriding mempunyai ciri-ciri sebagai berikut :
- Nama Method harus sama
- Daftar parameter harus sama
- Return type harus sama

  Berikut ini contoh terjadinya overriding dimana method RupiahVsDolar() pada class Sekarang meg-override method RupiahVsDolar() pada class Dulu. 
  
 ***
 
  class Dulu {
  
public String RupiahVsDolar() { 

System.out.println(“Rp 10.000”);

  }
  
}

class Sekarang extends Dulu {

public String RupiahVsDolar() {

System.out.println(“Rp 14.000”);

  }
  
}

***
Method yang terkena override (overiden method) diharuskan tidak boleh mempunyai modifier yang lebih luas aksesnya dari method yang meng-overide (overriding method).

## Praktikum

SOAL

*PERCOBAAN 1*
  1. Melakukan Overloading pada method

Jawaban :
- [Class A](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul7/src/modul7/percobaan/percobaan_satu/A.java)
- [Class B](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul7/src/modul7/percobaan/percobaan_satu/B.java)
- [Class C](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul7/src/modul7/percobaan/percobaan_satu/C.java)
- [Class Overload](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul7/src/modul7/percobaan/percobaan_satu/Overload.java)

*A. Percobaan 1*

- Class A

Class A ini sebagai class Parent atau Superclass Utama

```java
package modul7.percobaan.percobaan_satu;

public class A {
}
```

- Class B

Class B ini merupakan Sub-Class dari SuperClass atau termasuk parent dari class A serta menjadi SuperClass dari Class C

```java
package modul7.percobaan.percobaan_satu;

public class B extends A {

}
```

- Class C

Class ini merupakan SubClass dari Class B karena Class B merupakan SuperClass terdekat dari SubClass C

```java
package modul7.percobaan.percobaan_satu;

public class C extends B {

}
```

- Class Overload

Class Overload ini digunakan sebagai main. Pada Class ini untuk memanggil Class C dan dari superclass yang mana nantinya akan dipanggil atau dicetak dari class C tersebut pada output.

```java
package modul7.percobaan.percobaan_satu;

public class Overload {
    void myOverload(A a){
        System.out.println("Overload.myOverload(A a");
    }

    void myOverload(B b){
        System.out.println("Overload.myOverload(B b");
    }

    public static void main(String[] args) {
        Overload o = new Overload();
        A a = new A();
        C c = new C();

        o.myOverload(a);
        o.myOverload(c);
    }
}
```

***

*Hasil dari percobaan satu*

Overload.myOverload(A a)

Overload.myOverload(B b)

***

Pada output ini class B merupakan keluaran dari output Class C, hal ini dikarenakan class B merupakan superclass dari class C. Pada main ini class A tidak ada keluaran atau tidak dicetak dikarenakan Superclass tidak memiliki suatu Superclass lagi diatasnya. Sehingga pada saat Class B menjadi superclass dari class C maka class A tidak memiliki hubungan lagi dengan sub-class C.

*PERCOBAAN 2*
  1. Melakukan Overloading pada method

Jawaban :
- [Class Overload1](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul7/src/modul7/percobaan/percobaan_dua/Overload1.java)

*B. Percobaan 2*

- Class Overload1

Pada percobaan kedua class Overload1 ini merupakan contoh penggunaan dari metode Overloading. Program tersebut diketahui bahwa tiap methodnya memiliki nama yang sama tetapi dengan parameter yang berbeda, hal ini disesuaikan dengan keluaran didalamnya. Class ini juga dideklarasikan dengan tipe data byte yang kemudian dengan variable b yang digunakan untuk memanggil method myMethod yang dimana ini merupakan penerapan dari Overloading.

```java
package modul7.percobaan.percobaan_dua;

public class Overload1 {
    void myMethod(short s){
        System.out.println("short");
    }

    void myMethod(int i){
        System.out.println("int");
    }

    void myMethod(long l) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        Overload1 o = new Overload1();
        byte b = 1;

        o.myMethod(b);
    }
}
```
***

*Hasil dari percobaan dua*

short

int

int

***

Output dari percobaan dua tersebut yaitu "short". Ini dikarenakan tipe data dari variable b menggunakan tipe data byte serta tipe data short merupakan nilai terdekat dengan memory 16-bit. Pada hasil output int ini yaitu dikarenakan nilai angka memiliki tipe data default integer. 

## Kesimpulan

Pada praktikum modul 7 ini dapat disimpulkan bahwa, Overloading tersebut merupakan subclass yang memiliki nama method yang sama. Overiding merupakan metode yang memungkinkan subclassnya menggunakan secara berulang pada method dari superclass dan dengan menggunakan subclassnya tersebut. 

Dalam menggunakan overloading ini tidak perlu menciptakan nama-nama fungsi yang berbeda dalam melakukan tugas yang sama, dikarenakan hal tersebut akan membutuhkan waktu yang lama dan tidak efisien.

Dalam menggunakan overiding ini hanya perlu menggabungkan pewarisan dengan metode yang merupakan superclass dan dapat mendefinisikan bentuknya secara umum dari metode yang akan digunakan oleh semua subclassnya.
