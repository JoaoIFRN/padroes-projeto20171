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
public class FabricaFormas {
    public static Forma getForma(FormasGeometricas formasGeometricas){
        switch(formasGeometricas){
            case QUADRADO:
                return new Quadrado();
            case RETANGULO:
                return new Retangulo();
            case TRIANGULO:
                return new Triangulo();
        }
        return null;
    }
}
