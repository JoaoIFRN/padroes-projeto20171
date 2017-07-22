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
public enum FormasGeometricas {
    
    QUADRADO("Quadrado"), RETANGULO("Retângulo"), TRIANGULO("Triângulo");

    FormasGeometricas(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;

    public String getDescricao() {
        return this.descricao;
    }

}
