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
public class Akatsuki extends Character{
    //Atribute
    String cincin;
    
    //Construction
    Akatsuki(String parNama, String parAsal, String parElemen){
       super(parNama, parAsal, parElemen);
    }
    
    //Function
    public String getCincin() {
        return cincin;
    }

    public void setCincin(String parCincin) {
        cincin = parCincin;
    
    }
}
