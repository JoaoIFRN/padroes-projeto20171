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
public abstract class Condimento extends Bebida{
    
    private Bebida bebida;

    public Bebida getBebida() {
        return bebida;
    }    

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }        
    
    @Override
    public abstract String getDescricao();
}
