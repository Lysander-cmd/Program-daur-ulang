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
public class Main {
    String buka;
    public Main(String buka){
        this.buka = buka;
    }
    
    public static void main(String[] args) {        
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //new objek
        Main pembuka = new Main("Selamat Datang di Program Daur Ulang");
        Organik or = new Organik();
        Anorganik an = new Anorganik();
        
        //Pembuka
        System.out.println(pembuka.buka+"\n");
        
        //Pilihan
        Jenis.pilihan();
        
        //Memilih diantara 1 hingga 5
        int pilihan;
        
        do{
        System.out.print("Masukkan Pilihan : ");
        pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                case 3:
                case 4:
                    an.a();
                    break;
                case 2:
                case 5:
                    or.a();
                    break;
                default:
                    System.out.println("Pilihan tidak ditemukan\n");
                    break;
            }
        
        }while(pilihan > 5 || pilihan == 0);
        
    }
    
}
