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

public class Computador extends Equipamento implements Ligavel{

    static int consEletrico = 20;

    public Computador(String modEquipamento) {
        super(modEquipamento);
    }

    public static int getConsEletrico() {
        return consEletrico;
    }

    public static void setConsEletrico(int consEletrico) {
        Computador.consEletrico = consEletrico;
    }

    @Override
    public String ModEquipamento() {
        return getModEquipamento();
    }

    @Override
    public int getConsEnergia() {
        return consEletrico;
    }


    
}
