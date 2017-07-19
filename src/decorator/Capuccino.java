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
public class Capuccino extends Bebida{

    public Capuccino(){
        setDescricao("Capuccino");
    }
    
    @Override
    public double getValor() {
        return 7.8;
    }
    
}
