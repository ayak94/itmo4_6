package lab4;


public class Helicopter extends AirTransport {
    final protected int numberOfScrews;

    public Helicopter(String color, String model, int wingspan, long liftingCapacity, int numberOfScrews) {
        super(color, model, wingspan, liftingCapacity);
        this.numberOfScrews = numberOfScrews;
    }

    @Override
    public String getDescription() {
        return "Helicopter{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", wingspan=" + wingspan +
                ", liftingCapacity=" + liftingCapacity +
                ", numberOfScrews=" + numberOfScrews +
                '}';
    }

    @Override
    public void goToPosition(double lat, double lon) {
        System.out.println("Helicopter is flying to: " + lat + ", " + lon);
    }
}
