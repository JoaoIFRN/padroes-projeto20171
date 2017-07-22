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
public class TesteFactory {
    public static void main(String[] args) {
        Forma forma = FabricaFormas.getForma(FormasGeometricas.TRIANGULO);
        System.out.println(forma.getDescricao());
        forma = FabricaFormas.getForma(FormasGeometricas.QUADRADO);
        System.out.println(forma.getDescricao());
    }
}
