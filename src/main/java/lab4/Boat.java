package lab4;


public class Boat extends SeaTransport {

    protected boolean hasMotor;

    public Boat(String color, String model, int length, boolean hasAnchor, boolean hasMotor) {
        super(color, model, length, hasAnchor);
        this.hasMotor = hasMotor;
    }

    @Override
    public String getDescription() {
        return "Boat{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", length=" + length +
                ", hasAnchor=" + hasAnchor +
                ", hasMotor=" + hasMotor +
                '}';
    }

    @Override
    public void goToPosition(double lat, double lon) {
        System.out.println("Boat is floating to: " + lat + ", " + lon);
    }
}
