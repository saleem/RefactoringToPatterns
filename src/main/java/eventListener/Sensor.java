package eventListener;

import java.util.HashSet;
import java.util.Set;


public class Sensor {

    Set<SensorEventListener> listeners = new HashSet<>();

    public void addListener(SensorEventListener listener) {
        listeners.add(listener);
    }


    public void sense(SensorState sensorState) {
        SensorEvent temperatureEvent = new TemperatureEvent();
        listeners.forEach(listener -> listener.listen(temperatureEvent) );
    }


    public void removeListener(SensorEventListener listener) {
        listeners.remove(listener);
    }
}

class TemperatureEvent implements SensorEvent {
    @Override
    public SensorState beforeEvent() {
        return null;
    }

    @Override
    public SensorState afterEvent() {
        return null;
    }
}
