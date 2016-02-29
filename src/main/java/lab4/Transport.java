package lab4;


public abstract class Transport {
    protected final String model;
    protected String color;

    public Transport(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public abstract String getDescription();
    public abstract void goToPosition(double lat, double lon);

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }
}
