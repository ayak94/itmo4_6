package lab4;

/**
 * Created by olgaoskina
 * 14/12/15
 */
public abstract class LandTransport extends Transport {
    final protected int power;
    final protected int quantityOfWheels;

    public LandTransport(String color, String model, int power, int quantityOfWheels) {
        super(color, model);
        this.power = power;
        this.quantityOfWheels = quantityOfWheels;
    }

    public int getPower() {
        return power;
    }

    public int getQuantityOfWheels() {
        return quantityOfWheels;
    }
}
