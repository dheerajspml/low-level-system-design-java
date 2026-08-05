package weatherstation.display;

import weatherstation.update.Observer;
import weatherstation.weatherData.Data;
import weatherstation.weatherData.WeatherData;

public class CurrentConditionDisplay implements DisplayData, Observer {
    private Double temperature;
    private Double humidity;
    private Double pressure;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Condition : " + "temperature: " + temperature
                + " humidity: " + humidity  + " pressure: " + pressure);
    }

    @Override
    public void update(Data data) {
      this.temperature= data.getTemperature();
      this.humidity= data.getHumidity();
      this.pressure= data.getPressure();
      display();
    }


}
