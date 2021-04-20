/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import model.Observer;
import model.PainelClimaAnterior;
import model.PainelClimaAtual;
import model.Subject;

/**
 *
 * @author Fernando Paiva
 */
public class PainelClimaAnteriorPresenter implements Observer, Subject {
    
    private Observer model;
    
    Double temp; 
    Double umid;
    Double press;

    public PainelClimaAnteriorPresenter() {
           
    }
     

    @Override
    public void update(Double temperatura, Double umidade, Double pressao) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        model = new PainelClimaAnterior();
        registerObserver(model);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeObserver(Observer o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObservers() {
        
        model.update(temp, umid, press);
    }


    
}
