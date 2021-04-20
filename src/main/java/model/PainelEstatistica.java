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
public class PainelEstatistica implements Painel, Observer {
    
    private Double temperatura;
    private Double umidade;
    private Double pressao;
    private Integer numMedicoes;
    private Subject dadosTempo;
    
    public PainelEstatistica(Subject dados) {
    
    }
    
    @Override
    public void exibe() {
        
    }
    
    @Override
    public void update(Double temperature, Double humidity, Double pressure) {
        
    }
    
}
