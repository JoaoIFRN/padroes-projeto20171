/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author João
 */
public class Triangulo implements Forma{

    @Override
    public String getDescricao() {
        return FormasGeometricas.TRIANGULO.getDescricao();
    }
    
}
