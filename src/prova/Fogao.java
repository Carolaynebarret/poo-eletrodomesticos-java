/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author carolayne
 */
public class Fogao  extends Equipamento{
    
    private int bocas;

    public Fogao(int bocas, String modEquipamento) {
        super(modEquipamento);
        this.bocas = bocas;
    }
       
       

    public int getBocas() {
        return bocas;
    }

    public void setBocas(int bocas) {
        this.bocas = bocas;
    }
       
       


    }
    

    
    
