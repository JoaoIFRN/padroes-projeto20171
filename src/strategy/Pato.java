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
public class Pato {
    
    private ComportamentoVoar comportamentoVoar;
    
    public Pato(){        
    }        
    
    public Pato(ComportamentoVoar comportamentoVoar){
        this.comportamentoVoar = comportamentoVoar;
    }
    
    public void setComportamentoVoar(ComportamentoVoar comportamentoVoar){
        this.comportamentoVoar = comportamentoVoar;
    }
    
    public void voar(){
        comportamentoVoar.voar();
    }
    
    public void nadar(){
        System.out.println("Nadando");
    }
    
    public void exibir(){
        System.out.println("Pato exibido");
    }
    
}
