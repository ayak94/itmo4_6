package lab4;

/**
 * Created by olgaoskina
 * 14/12/15
 */
public class Submarine extends SeaTransport {
    protected int immersionDepth;

    public Submarine(String color, String model, int length, boolean hasAnchor, int immersionDepth) {
        super(color, model, length, hasAnchor);
        this.immersionDepth = immersionDepth;
    }

    @Override
    public String getDescription() {
        return "Submarine{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                "length=" + length +
                ", hasAnchor=" + hasAnchor +
                ", immersionDepth=" + immersionDepth +
                '}';
    }

    @Override
    public void goToPosition(double lat, double lon) {
        System.out.println("Submarine is floating to: " + lat + ", " + lon);
    }
}
