package prototype;

public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Minion meleeMinion = new MeleeMinion();
        Minion casterMinion = new CasterMinion();
        MinionGenerator meleeMinionGenerator = new MinionGenerator(meleeMinion);
        MinionGenerator casterMinionGenerator = new MinionGenerator(casterMinion);

        for (int i=0; i<5; i++) {
            Minion generatedMeleeMinion = meleeMinionGenerator.generateMinion();
            Minion generatedCasterMinion = casterMinionGenerator.generateMinion();

            generatedMeleeMinion.attack();
            generatedCasterMinion.attack();
        }
    }
}
