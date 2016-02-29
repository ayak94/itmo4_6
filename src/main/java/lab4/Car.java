package lab4;

public class Car extends LandTransport {
    final protected String type;

    public Car(String color, String model, int power, int quantityOfWheels, String type) {
        super(color, model, power, quantityOfWheels);
        this.type = type;
    }

    @Override
    public String getDescription() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                ", quantityOfWheels=" + quantityOfWheels +
                ", type=" + type +
                '}';
    }

    @Override
    public void goToPosition(double lat, double lon) {
        System.out.println("Car is driving to: " + lat + ", " + lon);
    }
}
