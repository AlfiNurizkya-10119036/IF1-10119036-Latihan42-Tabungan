/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan42.tabungan;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * NIM      : 10119036
 * Kelas    : IF-1
 * Deskripsi Program : Membuat Program Tabungan
 */

import java.util.Scanner;
public class Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("====Program Penarikan Saldo====");
        System.out.print("Masukkan saldo awal : ");
        Tabungan tabungan = new Tabungan(scan.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        int sisaSaldo = tabungan.ambilTabungan(scan.nextInt());
        System.out.println("Saldo Anda Sekarang : "+sisaSaldo);
    }
}
