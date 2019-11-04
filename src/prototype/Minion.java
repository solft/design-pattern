package prototype;

public abstract class Minion implements Cloneable {
    abstract void attack();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Minion) super.clone();
    }
}
