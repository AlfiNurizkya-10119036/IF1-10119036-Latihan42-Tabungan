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
public class Tabungan {

      private int saldo;
    public Tabungan(int saldo){
        this.saldo = saldo;
    }

    public int ambilTabungan(int jumlah){
        return saldo - jumlah;
    }
}
