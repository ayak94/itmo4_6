package lab4;


public abstract class AirTransport extends Transport {
    protected int wingspan; // размах крыльев
    protected long liftingCapacity; // грузоподъемность

    public AirTransport(String color, String model, int wingspan, long liftingCapacity) {
        super(color, model);
        this.wingspan = wingspan;
        this.liftingCapacity = liftingCapacity;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public long getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(long liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }
}
