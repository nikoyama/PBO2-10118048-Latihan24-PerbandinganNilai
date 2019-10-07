/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan24.perbandinganduahbuahnilai;

import java.util.Scanner;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : membandingkan hasil dua buah nilai 
 */
public class PBO210118048Latihan24PerbandinganDuahBuahNilai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulangi;
        int a, b;
        
        System.out.println("=====Program Perbandingan Nilai=====");
        do {
            System.out.print("Masukkan Nilai Pertama\t: ");
            a = scanner.nextInt();
            System.out.print("Masukkan Nilai Kedua\t: ");
            b = scanner.nextInt();
            if (a > b)
                System.out.println("Hasil : " + a + " Lebih besar dari " + b);
            else if (a < b)
                System.out.println("Hasil : " + a + " Lebih kecil dari " + b);
            else if (a == b)
                System.out.println("Hasil : " + a + " Sama dengan " + b);

            System.out.print("\nUlangi Aktifitas ? (Ya/Tidak) : ");
            ulangi = scanner.next().toLowerCase();
            System.out.println("");
        } while (ulangi.equals("ya"));        
    }
}
