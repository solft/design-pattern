package decorator;

public class BuffStatus extends Buff {
    @Override
    public void effect() {
        System.out.println("버프 상태:");
    }
}
