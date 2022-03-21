package MidTermTest;
import java.util.ArrayList;

/**
 * @author Clelia Miguel
 * MidTerm Test
 *
 */

public class Driver {

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Car car1 = new Car("c1", 250,true);
        Car car2 = new Car("c2", 220,true);
        Car car3 = new Car("c3", -210,false);

        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(car3);

        Boat boat1 = new Boat("b1",500);
        Boat boat2 = new Boat("b2",700);
        Boat boat3 = new Boat("b3",800);

        vehicles.add(boat1);
        vehicles.add(boat2);
        vehicles.add(boat3);


        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }


        for (Vehicle vehicle : vehicles) {
            vehicle.accelerate();
        }

    }
}
