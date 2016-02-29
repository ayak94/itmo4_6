package lab4;


public class Plane extends AirTransport {
    final protected boolean hasAutopilot;


    public Plane(String color, String model, int wingspan, long liftingCapacity, boolean hasAutopilot) {
        super(color, model, wingspan, liftingCapacity);
        this.hasAutopilot = hasAutopilot;
    }

    @Override
    public String getDescription() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", wingspan=" + wingspan +
                ", liftingCapacity=" + liftingCapacity +
                ", hasAutopilot=" + hasAutopilot +
                '}';
    }

    @Override
    public void goToPosition(double lat, double lon) {
        System.out.println("Plane is flying to: " + lat + ", " + lon);
    }
}
