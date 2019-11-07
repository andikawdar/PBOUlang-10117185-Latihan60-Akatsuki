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
public class PBOUlang10117185Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("======Akatsuki Characters=====");
        
        Akatsuki a1 = new Akatsuki("Pain", "Amegakure", "Tidak Diketahui");
        Akatsuki a2 = new Akatsuki("Konan", "Amegakure", "Tanah");
        Akatsuki a3 = new Akatsuki("Deidara", "Iwagakure", "Tanah");
        Akatsuki a4 = new Akatsuki("Itachi Uciha", "Konoha", "Api");
        Akatsuki a5 = new Akatsuki("Zetsu", "Tidak Diketahui", "Chakra Kaguya Otsutsuki");
        Akatsuki a6 = new Akatsuki("Orochimaru", "Konoha", "Angin");
        Akatsuki a7 = new Akatsuki("Kisame", "Kirigakure", "Air");
        Akatsuki a8 = new Akatsuki("Kakuzu", "Takigakure", "Angin, Api, Tanah, Air dan Petir");
        Akatsuki a9 = new Akatsuki("Hidan", "Yugakure", "Angin");
        Akatsuki a10 = new Akatsuki("Sasori", "Sunagakure", "Tanah");
        Akatsuki a11 = new Akatsuki("Tobi", "Konoha", "Api");
        
        System.out.println("");
        a1.displayCharacter();
        a1.setCincin("rei, “Nol”");
        System.out.println("Cincin  : "+a1.getCincin());
        System.out.println("Rekan   : "+a2.getNama());
        
        System.out.println("");
        a2.displayCharacter();
        a2.setCincin("Ao, shō, “Biru,” “Hijau”");
        System.out.println("Cincin  : "+a2.getCincin());
        System.out.println("Rekan   : "+a1.getNama());
        
        System.out.println("");
        a3.displayCharacter();
        a3.setCincin("bya, “putih”");
        System.out.println("Cincin  : "+a3.getCincin());
        System.out.println("Rekan   : "+a10.getNama());
        
        System.out.println("");
        a4.displayCharacter();
        a4.setCincin("shu, “merah”");
        System.out.println("Cincin  : "+a4.getCincin());
        System.out.println("Rekan   : "+a7.getNama());
        
        System.out.println("");
        a5.displayCharacter();
        a5.setCincin("gai, “banteng”");
        System.out.println("Cincin  : "+a5.getCincin());
        System.out.println("Rekan   : "+a11.getNama());
        
        System.out.println("");
        a6.displayCharacter();
        a6.setCincin("kū, “langit”");
        System.out.println("Cincin  : "+a6.getCincin());
        System.out.println("Rekan   : "+a10.getNama());
        
        System.out.println("");
        a7.displayCharacter();
        a7.setCincin("nan, “selatan”");
        System.out.println("Cincin  : "+a7.getCincin());
        System.out.println("Rekan   : "+a4.getNama());
        
        System.out.println("");
        a8.displayCharacter();
        a8.setCincin("hoku, “utara”");
        System.out.println("Cincin  : "+a8.getCincin());
        System.out.println("Rekan   : "+a9.getNama());
        
        System.out.println("");
        a9.displayCharacter();
        a9.setCincin("san, “tiga”");
        System.out.println("Cincin  : "+a9.getCincin());
        System.out.println("Rekan   : "+a8.getNama());
        
        System.out.println("");
        a10.displayCharacter();
        a10.setCincin("gyoku, “permata”");
        System.out.println("Cincin  : "+a10.getCincin());
        System.out.println("Rekan   : "+a3.getNama());
        
        System.out.println("");
        a11.displayCharacter();
        a11.setCincin("gyoku, “permata”");
        System.out.println("Cincin  : "+a11.getCincin());
        System.out.println("Rekan   : "+a5.getNama());
        
    }
}
