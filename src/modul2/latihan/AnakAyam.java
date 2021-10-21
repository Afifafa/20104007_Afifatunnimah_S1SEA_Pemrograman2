package modul2.latihan;
import java.util.Scanner;

public class AnakAyam {
        public static void main(String[] args) {
            int anak, i;
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan Jumlah Anak Ayam\t: ");
            anak = input.nextInt();
            for (i = anak; i > 1; i--){
                System.out.print("Anak ayam turunlah " + anak);
                anak = i - 1;
                System.out.println(", Mati satu tinggalah " + anak);
            }
            System.out.println("Anak Ayam turun 1, Mati satu tinggalah induknya");
        }
    }
