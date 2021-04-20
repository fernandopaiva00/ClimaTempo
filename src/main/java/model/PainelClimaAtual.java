/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Fernando Paiva
 */
public class PainelClimaAtual implements Painel, Observer {
    
    private Double temperatura;
    private Double umidade;
    private Double pressao;
    

    public PainelClimaAtual() {
    
        temperatura = 0.0;
        umidade = 0.0;
        pressao = 0.0;
        
        update(temperatura, umidade, pressao);
    }
    
    @Override
    public void exibe() {
        
    }

    @Override
    public void update(Double temp, Double umid, Double press) {
        this.temperatura = temp;
        this.umidade = umid;
        this.umidade = press;
        
    }

    
}
