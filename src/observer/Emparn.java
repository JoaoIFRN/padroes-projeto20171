/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Date;

/**
 *
 * @author João
 */
public class Emparn implements Observador{

    private String nome;
    
    public Emparn(String nome){
        this.nome = nome;
    }
    
    @Override
    public void atualizar(double temperatura, double umidade, double pressaoBarometrica) {
        System.out.println("ATUALIZADO");
        System.out.println(new Date());
        System.out.println(nome);
        System.out.println("Temperatura: " + String.valueOf(temperatura));
        System.out.println("Umidade: " + String.valueOf(umidade));
    }
    
}
