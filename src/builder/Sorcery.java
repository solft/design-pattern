package builder;

public class Sorcery extends Rune {
    private String artefact;
    private String excellence;
    private String power;

    public static class Builder {
        private String keyStone = "";
        private String artefact = "";
        private String excellence = "";
        private String power = "";

        public Builder keyStone(String keyStone) {
            this.keyStone = keyStone;
            return this;
        }

        public Builder artefact(String artefact) {
            this.artefact = artefact;
            return this;
        }

        public Builder excellence(String excellence) {
            this.excellence = excellence;
            return this;
        }

        public Builder power(String power) {
            this.power = power;
            return this;
        }

        public Sorcery build() {
            return new Sorcery(this);
        }
    }

    private Sorcery(Builder builder) {
        super.setKeyStone(builder.keyStone);
        artefact = builder.artefact;
        excellence = builder.excellence;
        power = builder.power;
    }

    @Override
    public String toString() {
        return "KeyStone : " + super.getKeyStone()
                + ", slot1: " + artefact
                + ", slot2: " + excellence
                + ", slot3: " + power;
    }
}
