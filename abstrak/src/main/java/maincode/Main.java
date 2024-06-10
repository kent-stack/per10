/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maincode;

import com.assets.Mobil;
import com.assets.MobilMewah;

/**
 *
 * @author A-24
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil("Hitam", 300, "Havanza", 20000000);
        Mobil mobil3 = new Mobil("warni", "Ferira");
        Mobil mobil4 = new MobilMewah("Wakanda");
        mobil4.getInfo();
        mobil4.setHarga(9000000);
        mobil4.getInfo();
       
        Mobil mobilMewah2 = new MobilMewah(80000, "lambo");
        mobilMewah2.getInfo();
        mobil4.gasPol();
    }
}
