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
 *  NIM : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class PBOUlang_10116584_Latihan45_CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Printer x = new Printer();
        Scanner scan = new Scanner(System.in);
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukan Nama Anda : ");
        x.setNama(scan.nextLine());        
        System.out.print("Mau Cetak nama berapa kali? : ");
        x.setJmlCetak(scan.nextInt());      
        
        x.cetak(x.getNama());
        x.cetak(x.getJmlCetak(), x.getNama());
                
    }
    
}
