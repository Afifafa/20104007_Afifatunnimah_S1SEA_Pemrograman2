# 20104007_Afifatunnimah_S1SEA_Pemrograman2
Mata Kuliah Pemrograman 2
# Modul 6 Konsep Inheritance

## Dasar Teori

   Dengan konsep inheritance, sebuah class dapat mempunyai class turunan. Suatu class yang mempunyai class turunan dinamakan parent class atau base class. Sedangkan class        turunan itu sendiri seringkali disebut subclass atau child class. Suatu subclass dapat mewarisi apa-apa yang dipunyai oleh parent class-nya. Kesimpulannya, boleh dikatakan bahwa  suatu subclass adalah tidak lain hanya memperluas (extend) parent class-nya.
   
   Di dalam Java untuk mendeklarasikan suatu class sebagai subclass dilakukan dengan cara menambahkan kata kunci extends setelah deklarasi nama class, kemudian diikuti dengan nama parent class-nya. Berikut adalah contoh deklarasi inheritance.
   
   Contoh :
   
   ```java
    public class B extends A {
    ...
    }

   ```
   
   Contoh diatas memberitahukan kompiler Java bahwa kita ingin mengextend class A ke class B. Dengan kata lain, class B adalah subclass (class turunan) dari class A, sedangkan class A adalah parent class dari class B.Java hanya memperkenankan adanya single inheritance. Konsep single inheritance hanya memperbolehkan suatu sublass mempunyai satu parent 
class. Dengan konsep single inheritance ini, masalah pewarisan akan dapat diamati dengan mudah.

  Suatu parent class dapat tidak mewariskan sebagian member-nya kepada subclass-nya. Sejauh mana suatu member dapat diwariskan ke class lain, ataupun suatu member dapat diakses dari class lain, sangat berhubungan dengan access control (kontrol pengaksesan).

  Kata kunci super dipakai untuk merujuk pada member dari parent class, sebagaimana kata kunci this yang dipakai untuk merujuk pada member dari class itu sendiri.
Ada beberapa hal yang harus diingat ketika menggunakan pemanggil constuktor super:

1. Pemanggil super() HARUS DIJADIKAN PERNYATAAN PERTAMA DALAM constructor.
2. Pemanggil super() hanya dapat digunakan dalam definisi constructor.
3. Termasuk constructor this() dan pemanggil super() TIDAK BOLEH TERJADI DALAM constructor YANG SAMA.

  Contoh:

  ```java
  public class Siswa {
  private int nilai;
  public setNilai(int nilai) {
  this.nilai=nilai;
  }
  }
  ```

## Praktikum

A. Percobaan Satu

   Menggunakan kata kunci super
   
   - [Bentuk](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/percobaan_satu/Bentuk.java)
   - [Persegi](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/percobaan_satu/Persegi.java)
   - [PersegiTest](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/percobaan_satu/PersegiTest.java)

- Class Bentuk

  Class ini dibuat dengan berisikan variable p dan l dengan tipe data integer. Class ini sebagai parent dengan modifirenya protected sehingga class child dapat mengaksesnya.
  
 ```java
  package modul6.percobaan.percobaan_satu;

public class Bentuk {
    protected int p, l;
}
 ```

- Class Persegi

Class ini sebagai child atau sebagai subclass dari class Bentuk dengan deklarasi variable awal p, i dengan tipe data integer.
   
```java
package modul6.percobaan.percobaan_satu;

public class Persegi extends Bentuk {
protected int p, l;
}
```
   
Kemudian terdapat setSuper sebagai method yang nantinya akan menyimpan nilai pada variable parent dan pada setSuper menggunakan kata kunci super yang terdapat pada variablle yang ada pada class parent.
   
   ```java
    public void setSupperP(int p){
        super.p = p;
    }

    public void setSuperL(int l){
        super.l = l;
    }
   ```
   
Kemudian terdapat setSuper dengan kata kunci this
   
   ```java
   public void setP(int p) {
        super.p = p;
    }

    public void setL(int l) {
        super.l = l;
    }
   ```
   
Setelah itu menggunakan method getLuas untuk menampilkan hasil running
   
   ```java
   public void getLuas(){
        System.out.println("Luas super : " + (super.p * super.l));
        System.out.println("Luas : " + (this.p * this.l));
    }
  }
   ```
   
- Class PersegiTest
 
  Class ini merupakan program main yang berisikan inputan user dan untuk menampilkan hasil dari inputan class sebelumnya
    
  kotak.setSuper untuk variable dari class parent
    
  kotak.set merupakan subclass parent dan kemudian melakukan pemanggilan dari method getLuas dari class kotak.
    
    ```java
    package modul6.percobaan.percobaan_satu;

    public class PersegiTest {
    public static void main(String[] args) {
        Persegi kotak = new Persegi();

        kotak.setSupperP(5);
        kotak.setSuperL(10);

        kotak.setP(3);
        kotak.setL(13);

        kotak.getLuas();
    }
   }
    ```
    
    ***
    Hasil dari percobaan satu
    
    Luas super : 39
    Luas : 0
    ***
   
B. Percobaan Dua
 
   - [Person](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/percobaan_dua/Person.java)
   - [Student](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/percobaan_dua/Student.java)
   - [inheritDemo](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/percobaan_dua/InheritDemo.java)
    
- Class Person

  Pada class ini terdapat deklarasi variable name, address dengan tipe data String dan dengan modifire protected supaya dapat diakses oleh sub-classnya.
  
  ```java
  package modul6.percobaan.percobaan_dua;

  public class Person {
    protected String name;
    protected String address;

    public Person(){
        System.out.println("Inside Person : Construction");
        name = " ";
        address = " ";
    }
  ```
  
  Kemudian terdapat class person ber-value dan method geter dan setter. Method get atau geter ini digunakan untuk mengembalikan nilai dari variable dengan menggunakan fungsi return serta set atau setter merupakan method void yang mensetting nilai pada variable dan construktor dari setter menggunakan this atau super.
  
  ```java
  public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
  }
  ```
  
- Class Student

  ```java
  package modul6.percobaan.percobaan_dua;

  public class Student extends Person {
    public Student(){
  //        super("Ini nama", "Ini alamat");
  //        super();
  //        super.name = "Ini nama";
        System.out.println("Inside Student : Constructor");
    }
  }
  ```
  
- Class inheriDemo

Pada class ini hanya berisi main untuk menampilkan code yang telah diinputkan atau untuk memanggil dari sub-class dari class Student
  
```java
package modul6.percobaan.percobaan_dua;

public class InheritDemo {
public static void main(String[] args) {
Student siswa = new Student();
}
}
```
  
  ***
  Hasil dari percobaan dua
  
  Inside Person : Construction
  Inside Student : Constructor
  ***
  
C. Percobaan Tiga

- [Class A](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/percobaan_tiga/A.java)
- [Class B](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/percobaan_tiga/B.java)
- [Class InheritanceTest](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/percobaan_tiga/InheritanceTest.java)

- Class A
  
  Pada class ini terdapat inisialisasi dari variable x,y dengan tipe data integer dan dengan modifire privat dan diganti dengan protected. Kemudian terdapat method set dan get beserta constructor methodnya serta penggunaan set dan get yang telah dimodifikasi dengan sesuai kebutuhan dan akan menjadi program yang lebih efisien.
  
  ```java
  package modul6.percobaan.percobaan_tiga;

  public class A {
    protected int x;
    protected int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void getNilai(){
        System.out.println("nilai x : " + x + "nilai y : " + y);
    }
  }
  ```
  
- Class B
 
  Pada sub-class B terdapat inisialisasi variable z dengan modifire private dan dengan method set, get beserta construktornya.
   
   ```java
   package modul6.percobaan.percobaan_tiga;

   public class B extends A {
    private int z;

    public void setZ(int z){
        this.z = z;
    }

    public void getJumlah(){
        System.out.println("Jumlah : " + (x+y+z));
    }
  }
   ```

- Class InheritanceTest

  Pada class main terdapat code yang digunakan untuk pemanggilan class A sebagai parent dan B sebagai child serta dengan inisialisasi dari masing-masing variable superclass dan subclass.
   
   ```java
   package modul6.percobaan.percobaan_tiga;

   public class InheritanceTest {
    public static void main(String[] args) {
        A ortu = new A();
        B anak = new B();

        System.out.println("superclass");
        ortu.setX(10);
        ortu.setY(20);
        ortu.getNilai();

        System.out.println("subclass");
        anak.setX(5);
        anak.setY(4);
        anak.setZ(50);
        anak.getNilai();
        anak.getJumlah();
    }
  }
   ```
   
   ***
   Hasil dari percobaan tiga
   
   superclass
   nilai x : 10nilai y : 20
   subclass
   nilai x : 5nilai y : 4
   Jumlah : 59
   ***
   
  Pada superclass hasil dari percobaan ini tidak menampilkan nilai dikarenakan menggunakan modifire private sehingga class lain tidak dapat mengakses. Kemudia modifire private diganti dengan modifire protected sehingga superclass akan menampilkan nilai.
   
  Pada subclass semua nilai dapat dicetak tetapi nilai x tidak dapat dicetak dikarenakan tidak ada method yang digunakan untuk mencetak nilai x, yang dimana nilai x dan y akan dicetak dengan perintah yang ada pada superclass tersebut.
   
D. Percobaan Empat

- [Class Parent](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/percobaan_empat/Parent.java)
- [Class Child](https://github.com/Afifafa/20104007_Afifatunnimah_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/percobaan_empat/Child.java)

- Class Parent

  Pada class Parent ini kosong tanpa adanya constructor

  ```java
  package modul6.percobaan.percobaan_empat;

  public class Parent {
  }
  ```

- Class Child

  Pada class Child ini yaitu sebagai subclass dari class Parent
  
  ```java
  package modul6.percobaan.percobaan_empat;

  public class Child extends Parent {
    int x;

    public Child(){
        super();
        x = 5;
    }
  }
  ```
  
  Pada percobaan ini menggunakan key super() yang terletak setelah x = 5; pada line ini program eror. Kemudian dilakukannya komplikasi dengan memindahkan key super() di statement method paling awal maka program tidak akan eror lagi. Dengan terjadinya eror tersebut maka dijadikan prioritas atau pembelajaran berikutnya bahwa untuk memanggil konstruktor parent class kita harus melakukan pemanggilan di line pertama pada konstruktor subclass.
  
## Kesimpulan

Pada praktikum ini disimpulkan bahwa :
   
  - Inheritance merupakan konsep turunan dari class Parent ke class Child untuk mengakses seluruh class Parentnya. Penggunaan Inheritance menggunakan kata kunci extends pada       class child setelah nama classnya diikuti dengan nama class parentnya. Pengaksesan class parentnya dilakukan dengan memanggil class yang diikuti dengan variable. 
  - Pada java terdapat modifire untuk mengatur privasi dari masing-masing class, method ataupun variablenya yang dimana modifire yaitu private, protected, default dan             public.
  - Kata kunci super merupakan kata kunci yang menunjukkan object dari class parent dan digunakan untuk memanggil dari class parentnya.
  - Kata kunci this merupakan kata kunci untuk melakukan pemanggilan pada class yang sama.
  - Kata kunci super berada pada statement bagian awal yang digunakan untuk menandai bahwa statement tersebut akan digunakan untuk menghindari program eror, karena                 apabila diletakkan di akhir maka program akan eror.
