/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan45_cetaknama;

import java.util.Scanner;

/**
 *
 * @author
 * NIM : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class Printer {
    
    private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak(String parNama){
        System.out.println("Nama Anda : "+getNama());
    }
    
    public void cetak(int jmlCetak, String parNama){
         
        System.out.println("Hasil Cetak: ");
               
            for (int i = 1; i<=jmlCetak; i++){
                System.out.println(getNama());
                
            }
    
}
}
