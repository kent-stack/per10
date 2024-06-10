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
public class Mobil implements KendaraanBermotor{
    
    private String warna;
    private int kecepatan;
    private String model;
    private int harga;

    public Mobil(){
        this.harga = 4000000;
        this.model = "Toyota aa";
        this.kecepatan = 300;
        this.warna = "Mejikuhibiniu";
    }

    public Mobil(String warna, int kecepatan, String model, int harga) {
        this.warna = warna;
        this.kecepatan = kecepatan;
        this.model = model;
        this.harga = harga;
    }

    public Mobil(String warna, String model) {
        this.warna = warna;
        this.model = model;
    }
    
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }


    public String getModel() {
        return model;
    }


    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void getInfo() {
        System.out.println("Merek : " + this.model);
        System.out.println("Harga : " + getHarga());
        System.out.println("Kecepatan Maksima; (km/jam) : " + this.kecepatan);
        System.out.println("Warna : " + this.warna);
    }

    public void gasPol() {
        System.out.println("gas");
    }

    @Override
    public void ngerem() {
        System.err.println("rem");
    }

}
