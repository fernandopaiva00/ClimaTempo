/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import java.util.ArrayList;
import model.Observer;
import model.PainelClimaAtual;
import model.Subject;

/**
 *
 * @author Fernando Paiva
 */
public class PainelClimaAtualPresenter implements Observer, Subject {
    
    public ArrayList<Observer> models;
        
    private Double temp; 
    private Double umid;
    private Double press;
    
    public PainelClimaAtualPresenter() {
       
        //registerObserver(new PainelClimaAtual());
                
    }
    
    @Override
    public void update(Double temperatura, Double umidade, Double pressao){
    
        temp = temperatura; 
        umid = umidade;
        press = pressao;
        
        //registerObserver(new PainelClimaAtual());
        //registerObserver(PainelClimaAtualView());
        notifyObservers();
        
    }
    
    @Override
    public void notifyObservers(){
        for (int i = 0; i < models.size(); i++) 
            models.get(i).update(temp, umid, press);
    
    }

   
    @Override
    public void registerObserver(Observer o) {
        models.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
