package lab4;

/**
 * Created by olgaoskina
 * 14/12/15
 */
public class Trolleybus extends LandTransport {
    final protected int numberOfElectricalContacts;

    public Trolleybus(String color, String model, int power, int quantityOfWheels, int numberOfElectricalContacts) {
        super(color, model, power, quantityOfWheels);
        this.numberOfElectricalContacts = numberOfElectricalContacts;
    }

    @Override
    public String getDescription() {
        return "Trolleybus{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                ", quantityOfWheels=" + quantityOfWheels +
                ", numberOfElectricalContacts=" + numberOfElectricalContacts +
                '}';
    }

    @Override
    public void goToPosition(double lat, double lon) {
        System.out.println("Trolleybus is driving to: " + lat + ", " + lon);
    }
}
