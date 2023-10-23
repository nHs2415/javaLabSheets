import java.util.Random;
public class Sensor {
    private String sensorID;
    private boolean state;
    private int reading;

    public Sensor(String sensorID){
        this.sensorID=sensorID;
        this.state=false;
        this.reading=-1;
    }

    public void sensorReading(){
        if (this.state==true){
            this.reading = 0 + (int) (Math.random()*((100-0)+1));
            System.out.println(this.reading);
        }
    }

    public void setSensorID(String sensorID) {
        this.sensorID = sensorID;
    }

    public String getSensorID() {
        return sensorID;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean getState() {
        return state;
    }

    public int getReading() {
        return reading;
    }
}
