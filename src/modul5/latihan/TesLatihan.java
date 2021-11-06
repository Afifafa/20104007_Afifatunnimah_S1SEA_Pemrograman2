package modul5.latihan;

import modul5.latihan.perbankan.Nasabah;
import modul5.latihan.perbankan.Tabungan;

public class TesLatihan {
    public static void main(String[] args) {
        int temp;
        boolean status;
        Nasabah nasabah = new Nasabah("Agus", "Daryanto");

        System.out.println("Nasabah atas nama\t: " + nasabah.getNamaAwal() + " " + nasabah.getNamaAkhir());

        nasabah.setTabungan(new Tabungan(5000));
        temp = nasabah.getTabungan().getSaldo();
        System.out.println("Saldo awal\t\t\t: " + temp);

        nasabah.getTabungan().simpanUang(3000);
        System.out.print("Jumlah uang yang disimpan\t: 3000");

        status = nasabah.getTabungan().ambilUang(6000);
        System.out.print("\nJumlah uang yang diambil\t: 6000");

        if (status) {
            System.out.print("\tok");
        } else{ System.out.print("\tgagal");
        }

        nasabah.getTabungan().simpanUang(3500);
        System.out.print("\nJumlah uang yang disimpan\t: 3500");

        status = nasabah.getTabungan().ambilUang(4000);
        System.out.print("\nJumlah uang yang diambil\t: 4000");

        if (status) {
            System.out.print("\tok");
        } else{ System.out.print("\tgagal");
        }

        status = nasabah.getTabungan().ambilUang(1600);
        System.out.print("\nJumlah uang yang diambil\t: 1600");

        if (status) {
            System.out.print("\tok");
        } else{ System.out.print("\tgagal");
        }

        nasabah.getTabungan().simpanUang(2000);
        System.out.print("\nJumlah uang yang disimpan\t: 2000");

        temp = nasabah.getTabungan().getSaldo();
        System.out.println("\nSaldo sekarang\t\t\t\t= " + temp);
    }
}