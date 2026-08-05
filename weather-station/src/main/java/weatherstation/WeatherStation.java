package weatherstation;

import weatherstation.display.CurrentConditionDisplay;
import weatherstation.weatherData.Data;
import weatherstation.weatherData.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        Data data = new Data();
        WeatherData weatherData = new WeatherData();
        data.setHumidity(65);
        data.setTemperature(30);
        data.setPressure(15);
        weatherData.setMeasurements(data);
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
    }
}
