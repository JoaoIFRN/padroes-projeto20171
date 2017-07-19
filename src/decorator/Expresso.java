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
public class Expresso extends Bebida{

    public Expresso(){
        setDescricao("Café expresso");
    }
    
    @Override
    public double getValor() {
        return 5.5;
    }
    
}
