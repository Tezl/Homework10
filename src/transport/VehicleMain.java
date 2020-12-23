package transport;

import java.util.List;

public class VehicleMain {

    public void main(String[] args) {

        Train train = new Train();
        Train.capacity = 180;
        Train.speed = 90;
        Train.cost = 500;
        Train.amount_of_cars = 26;

        Aeroplane aeroplane = new Aeroplane();
        Aeroplane.capacity = 60;
        Aeroplane.speed = 374;
        Aeroplane.cost = 5600;
        Aeroplane.chassis = "yes";


        List<Vehicle> vehicles = List.of(train, aeroplane);

        for (Vehicle ve: vehicles) {

            if (ve instanceof Train) {
                Train trainVehicle = (Train) ve;
                trainVehicle.whistle();
            }
            if (ve instanceof Aeroplane) {
                Aeroplane aeroplaneVehicle = (Aeroplane) ve;
                aeroplaneVehicle.refueling();
            }

        }

    }

}
