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
public class Motor implements KendaraanBermotor{

    @Override
    public void gasPol() {
        System.out.println("Gas sampe 100");
    }

    @Override
    public void ngerem() {
        System.out.println("ngerem blok");
    }
    
}
