package eventListener;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;


public class SensorTest {

    @Test
    public void shouldNotifyListenersOnStateChange() {
        SensorEventListener listener = mock(SensorEventListener.class);
        Sensor sensor = new Sensor();
        sensor.addListener(listener);
        sensor.sense(mock(SensorState.class));
        Mockito.verify(listener).listen(any(SensorEvent.class));
    }
}
