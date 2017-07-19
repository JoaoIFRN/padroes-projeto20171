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
public class Leite extends Condimento{

    public Leite(Bebida bebida){
        this.setBebida(bebida);
    }
    
    @Override
    public String getDescricao() {
        return "Leite; " + getBebida().getDescricao();
    }

    @Override
    public double getValor() {
        return 1.5 + getBebida().getValor();
    }
    
}
