/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author João
 */
public class LeiteCondensado extends Condimento {
    
    public LeiteCondensado(Bebida bebida){
        setBebida(bebida);
    }
    
    @Override
    public String getDescricao() {
        return "Leite condensado; " + getBebida().getDescricao();
    }

    @Override
    public double getValor() {
        return 2.0 + getBebida().getValor();
    }
    
}
