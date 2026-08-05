package weatherstation.weatherData;


import weatherstation.update.Observer;

public interface Subject {
    public void registerObserver(Observer observer);

    public void unregisterObserver(Observer observer);

    public void notifyObservers();
}
