package lab4;

public class Yacht extends SeaTransport {
    final protected int numberOfStoreys; // количество ярусов

    public Yacht(String color, String model, int length, boolean hasAnchor, int numberOfStoreys) {
        super(color, model, length, hasAnchor);
        this.numberOfStoreys = numberOfStoreys;
    }

    @Override
    public String getDescription() {
        return "Yacht{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", length=" + length +
                ", hasAnchor=" + hasAnchor +
                ", numberOfStoreys=" + numberOfStoreys +
                '}';
    }

    @Override
    public void goToPosition(double lat, double lon) {
        System.out.println("Yacht is floating to: " + lat + ", " + lon);
    }
}
