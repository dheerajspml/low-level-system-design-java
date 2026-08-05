package weatherstation.update;

import weatherstation.weatherData.Data;

public interface Observer {
    void update(Data data);
}
