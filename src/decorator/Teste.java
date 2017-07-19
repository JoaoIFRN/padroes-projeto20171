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
public class Teste {
    public static void main(String[] args) {
        Bebida bebida = new Expresso();
        System.out.println(bebida.getDescricao());
        System.out.println(bebida.getValor());
        
        bebida = new Leite(bebida);
        System.out.println(bebida.getDescricao());
        System.out.println(bebida.getValor());
        
        bebida = new LeiteCondensado(bebida);
        System.out.println(bebida.getDescricao());
        System.out.println(bebida.getValor());
        
        //Como eliminar um condimento???
        ((Condimento) bebida).setBebida(null);
        System.out.println(bebida.getDescricao());
        System.out.println(bebida.getValor());
    }
}
