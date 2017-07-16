/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author João
 */
public class TestarObserver {
    
    public static void main(String[] args) throws InterruptedException {
        Jornal96 jornal96 = new Jornal96("Jornal 96");
        Emparn emparn = new Emparn("Emparn");
        
        EstacaoMetereologica estacao = new EstacaoMetereologica();
        estacao.adicionarObservador(jornal96);
        estacao.adicionarObservador(emparn);
        estacao.atualizar();
        Thread.sleep(2000);
        estacao.atualizar();
        Thread.sleep(2000);
        estacao.atualizar();        
    }
}
