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
public class PatoAmarelo extends Pato{
    public PatoAmarelo(){
        super(new Voar());
    }
}
