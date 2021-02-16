/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daurulang;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Organik {
    //Scanner
    Scanner input = new Scanner(System.in);
    //new method
    void a(){
        //penetapan harga
        System.out.print("\nMasukkan jumlah barang (kg) : ");
        int jumlah = input.nextInt();
        int uang = jumlah * 1000;
        
        System.out.println("Jumlah uang : "+uang);
        int jawab;
        //Jika uang >= 5000, maka
        if(uang >= 5000){
        do{
        System.out.println("\nApakah anda ingin mendonasikan uang tersebut untuk melestarikan alam ?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.print("Masukkan pilihan : ");
        jawab = input.nextInt();
        
        switch(jawab){
            case 1 : int bibit = uang / 5000;
                     System.out.println("\nAnda mendapatkan "+bibit+" buah bibit pohon");
                     break;
            case 2 : System.out.println("\nAnda mendapatkan uang sebesar "+uang);
                     break;
        }
        }while(jawab > 2 || jawab == 0);
        //jika uang < 5000
        }else
            System.out.println("\nAnda mendapatkan uang sebesar "+uang);
    }
}