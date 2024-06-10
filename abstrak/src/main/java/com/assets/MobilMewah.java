/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assets;

/**
 *
 * @author A-24
 */
public class MobilMewah extends Mobil implements KendaraanBermotor{
   private double pajakBarangMewah = 200.0;
   private String asalNegara;

    public MobilMewah(String asalNegara) {
        this.asalNegara = asalNegara;
    }

    public MobilMewah( String warna, int kecepatan, String model, int harga) {
        super("pink", 300, "lamo", 4000000);
        this.asalNegara = asalNegara;
    
    }

    public MobilMewah(int harga, String model) {
        super("pink", "lambo");
    }

    @Override
    public void gasPol() {
        System.out.println("Ngegas sampai ");
    }

    @Override
    public void ngerem() {
        System.out.println("kendaraan berhenti");
        
    }
    
    
     
    
    

   

   
   
}
