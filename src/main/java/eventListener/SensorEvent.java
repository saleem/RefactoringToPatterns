package eventListener;

public interface SensorEvent {

    public SensorState beforeEvent();
    public SensorState afterEvent();

}
