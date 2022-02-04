/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author apurvazawar
 */
public class ServiceRecordsHistory {
    
    private ArrayList<Car> history;
    
    public ServiceRecordsHistory() {
        this.history = new ArrayList<>();
    }

    public ArrayList<Car> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Car> history) {
        this.history = history;
    }
    
    public Car addNewServiceRecord() {
        
        Car newServiceRecord = new Car();
        history.add(newServiceRecord);
        return newServiceRecord;
    }
}