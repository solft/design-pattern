package builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Rune precisionRune = new Precision
                .Builder()
                .keyStone("Fleet Footwork")
                .heroism("Overheal")
                .combat("Alacrity")
                .legend("Last Stand")
                .build();

        System.out.println(precisionRune.toString());

        Rune dominationRune = new Domination
                .Builder()
                .keyStone("Hail of Blades")
                .malice("Sudden Impact")
                .tracking("Eyeball Collection")
                .hunter("Ravenous Hunter")
                .build();

        System.out.println(dominationRune.toString());

        Rune sorceryRune = new Sorcery
                .Builder()
                .keyStone("Summon Aery")
                .artefact("Manaflow Band")
                .excellence("Celerity")
                .power("Scorch")
                .build();

        System.out.println(sorceryRune.toString());
    }
}
