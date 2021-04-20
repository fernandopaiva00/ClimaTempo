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
public class PainelClimaAnterior implements Painel, Observer{
    
    private Double temperatura;
    private Double umidade;
    private Double pressao;
    private Subject painelClimaAtual;

    
    public PainelClimaAnterior() {
        
    }

    @Override
    public void update(Double temp, Double umid, Double press) {
        this.temperatura = temp;
        this.umidade = umid;
        this.pressao = temp;
        //exibe();
    }

    @Override
    public void exibe() {

    
        }
    
}
