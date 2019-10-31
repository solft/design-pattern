package builder;

public class Precision extends Rune {
    private String heroism;
    private String legend;
    private String combat;

    public static class Builder {
        private String keyStone = "";
        private String heroism = "";
        private String legend = "";
        private String combat = "";

        public Builder keyStone(String keyStone) {
            this.keyStone = keyStone;
            return this;
        }

        public Builder heroism(String heroism) {
            this.heroism = heroism;
            return this;
        }

        public Builder legend(String legend) {
            this.legend = legend;
            return this;
        }

        public Builder combat(String combat) {
            this.combat = combat;
            return this;
        }

        public Precision build() {
            return new Precision(this);
        }
    }

    private Precision(Builder builder) {
        super.setKeyStone(builder.keyStone);
        heroism = builder.heroism;
        legend = builder.legend;
        combat = builder.combat;
    }

    @Override
    public String toString() {
        return "KeyStone : " + super.getKeyStone()
                + ", slot1: " + heroism
                + ", slot2: " + legend
                + ", slot3: " + combat;
    }
}
