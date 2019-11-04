package prototype;

public class MinionGenerator {
    private Minion minion;

    public MinionGenerator(Minion minion) {
        this.minion = minion;
    }

    public Minion generateMinion() throws CloneNotSupportedException {
        return (Minion) minion.clone();
    }
}
