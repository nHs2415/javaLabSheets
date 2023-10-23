public class Driver {

    public static void main(String[] args) {
        Sensor[] sensors = {
                new Sensor("SID001"),
                new Sensor("SID002"),
                new Sensor("SID003")
        };

        SensorNetwork sensorNetwork=new SensorNetwork("Network001",sensors);

        System.out.println();
        sensorNetwork.invoke();
        System.out.println();

        sensorNetwork.read();
        System.out.println();

        sensorNetwork.shutdown();
        System.out.println();

        Sensor[] sortedSensors=sensorNetwork.getSensorsDescending();
        System.out.println(">>>Descending order of Sensor Readings<<<");
        for (Sensor sensor : sensors){
            System.out.println("Sensor "+sensor.getSensorID()+" Reading : "+sensor.getReading());

        }


    }
}
