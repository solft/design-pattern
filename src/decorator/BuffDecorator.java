package decorator;

// Decorator
public abstract class BuffDecorator extends Buff {
    private Buff buff;

    public BuffDecorator(Buff buff) {
        this.buff = buff;
    }

    public void effect() {
        buff.effect();
    }
}
