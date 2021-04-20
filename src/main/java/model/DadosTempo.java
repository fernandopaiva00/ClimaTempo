/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Fernando Paiva
 */
public class DadosTempo implements Subject {
    
    private ArrayList<Observer> observers;
    private Double temperatura;
    private Double umidade;
    private Double pressao; 
    
    public DadosTempo() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
        }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) 
            observers.get(i).update(temperatura, umidade, pressao);
    }
    
    public void setMedicoes(Double temp, Double umid, Double press) {
        this.temperatura = temp;
        this.umidade = umid;
        this.pressao = press;
        notifyObservers();
    }
}
    

