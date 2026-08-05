package weatherstation.weatherData;

import weatherstation.update.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class WeatherData implements Subject {
    private final List<Observer> observers;
    private  Data data;


    public WeatherData() {
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(data);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }
    public  void setMeasurements(Data data) {
        this.data = data;
        measurementsChanged();
    }



}


