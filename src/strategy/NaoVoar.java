/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author João
 */
public class NaoVoar implements ComportamentoVoar{

    @Override
    public void voar() {
        System.out.println("Este pato não voa");
    }
    
}
