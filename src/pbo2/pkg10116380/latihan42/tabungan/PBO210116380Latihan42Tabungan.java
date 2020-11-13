/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan42.tabungan;

import java.util.Scanner;

/**
 * @author 
 * Nama  : Zain Achmad Rizqullah
 * Nim   : 10116380
 * Kelas : PBO2
 * Deskripsi Program : program ini tentang menghitung jumlah tabungan
 */
public class PBO210116380Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("=======Program Penarikan Uang========");
        System.out.print("Masukkan Saldo Awal : " );
        Scanner scn = new Scanner(System.in);
        int saldo = scn.nextInt();
        
        System.out.print("Jumlah Uang Yang diambil : " );
        int ambil = scn.nextInt();
        
        Tabungan tbg = new Tabungan(saldo);
        System.out.println("Saldo Anda Sekarang : " +tbg.ambilUang(ambil));
    }
    
}
