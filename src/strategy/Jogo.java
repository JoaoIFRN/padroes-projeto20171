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
public class Jogo {
    
    public static void main(String[] args) {
        Pato patoAmarelo = new PatoAmarelo();
        patoAmarelo.setComportamentoVoar(new NaoVoar());
        patoAmarelo.voar();                
        patoAmarelo.setComportamentoVoar(new Voar());
        patoAmarelo.voar();
    }
    
}
