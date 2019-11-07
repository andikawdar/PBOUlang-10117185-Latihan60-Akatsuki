/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan60.akatsuki;

/**
 *
 * @author user
 * Nama     : Andhyka Widariyanto
 * Kelas    : PBO Ulang
 * NIM      : 10117185
 * Tugas    : Latihan 60 - Akatsuki
 */
public class Character {
    //Atribute
    String nama;
    String asal;
    String elemen;
    
    //Construction
    Character (String parNama, String parAsal, String parElemen){
        nama = parNama;
        asal = parAsal;
        elemen = parElemen;
    }
    
    //Function
    void displayCharacter(){
        System.out.println("Nama    : "+nama);
        System.out.println("Asal    : Desa "+asal);
        System.out.println("Elemen  : "+elemen);
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
