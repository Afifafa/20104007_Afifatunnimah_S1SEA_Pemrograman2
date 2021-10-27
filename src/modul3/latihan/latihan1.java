package modul3.latihan;

import modul3.percobaan.Tabungan;

public class latihan1 {
    public static void main(String[] args) {
            boolean status;
            Tabungan tabungan = new Tabungan(10000);
            System.out.println("Tabungan awal\t: " + tabungan.getSaldo());
            tabungan.simpanUang(8000);
            System.out.println("Jumlah uang yang disimpan\t: 8000");
            status = tabungan.ambilUang(7000);
            System.out.print("Jumlah uang yang diambil\t: 7000");
            if (status){
                System.out.println(" Ok");
            } else {
                System.out.println(" gagal");
            }
            tabungan.simpanUang(1000);
            System.out.println("Jumlah uang yang disimpan\t: 1000");
            status = tabungan.ambilUang(10000);
            System.out.print("Jumlah uang yang diambil\t: 10000");
            if (status) {
                System.out.println(" OK");
            } else {
                System.out.println(" gagal");
            }
            status = tabungan.ambilUang(2500);
            System.out.print("Jumlah uang yang diambil\t: 2500");
            if (status){
                System.out.println(" Ok");
            } else {
                System.out.println(" gagal");
            }
            tabungan.simpanUang(2000);
            System.out.println("Jumlah uang yang disimpan\t: 2000");
            System.out.println("Saldo sekarang tersisa = " + tabungan.getSaldo());
        }
    }