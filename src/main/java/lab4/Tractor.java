package lab4;


public class Tractor extends LandTransport {
    protected boolean hasLadle; // ковш

    public Tractor(String color, String model, int power, int quantityOfWheels, boolean hasLadle) {
        super(color, model, power, quantityOfWheels);
        this.hasLadle = hasLadle;
    }

    @Override
    public String getDescription() {
        return "Tractor{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                ", quantityOfWheels=" + quantityOfWheels +
                ", hasLadle=" + hasLadle +
                '}';
    }

    @Override
    public void goToPosition(double lat, double lon) {
        System.out.println("Tractor is driving to: " + lat + ", " + lon);
    }
}
