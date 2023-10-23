import java.util.Arrays;
import java.util.Comparator;

public class SensorNetwork {
    private String networkID;
    private Sensor[] sensors;

    public SensorNetwork(String networkID,Sensor[] sensors){
        this.networkID=networkID;
        this.sensors=sensors;
    }

    public void invoke(){
        for (Sensor sensor : sensors){
            sensor.setState(true);
            System.out.println("Sensor with sensorID "+sensor.getSensorID()+" is up!");
        }
    }

    public void read(){
        for (Sensor sensor : sensors){
            sensor.sensorReading();
        }
    }

    public void shutdown(){
        for (Sensor sensor : sensors){
            sensor.setState(false);
            System.out.println("Sensor with sensorID "+sensor.getSensorID()+" is down!");
        }
    }

    public Sensor[] getSensorsDescending(){
        Sensor[] sortedSensors = Arrays.copyOf(sensors,sensors.length);
        Arrays.sort(sortedSensors, Comparator.comparingInt(Sensor::getReading).reversed());
        return sortedSensors;
    }


}
