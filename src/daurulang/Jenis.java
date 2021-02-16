/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daurulang;
/**
 *
 * @author WINDOWS 10
 */
public class Jenis {
    
    static void pilihan(){
        //jenis
        String[] jenis = {"0", "Kertas", "Daun", "Plastik" , "Karton" , "Ranting"};
        //untuk nomornya
        System.out.println ("Jenis barang : ");
        for (int i = 1; i < jenis.length; i++){
            System.out.println(i+". "+jenis[i]);
        }
    }
}
