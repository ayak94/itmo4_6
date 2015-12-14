package lab4;

/**
 * Created by olgaoskina
 * 14/12/15
 */
public abstract class SeaTransport extends Transport {
    final protected int length;
    protected boolean hasAnchor;

    public SeaTransport(String color, String model, int length, boolean hasAnchor) {
        super(color, model);
        this.length = length;
        this.hasAnchor = hasAnchor;
    }

    public int getLength() {
        return length;
    }

    public boolean isHasAnchor() {
        return hasAnchor;
    }

    public void setHasAnchor(boolean hasAnchor) {
        this.hasAnchor = hasAnchor;
    }
}
