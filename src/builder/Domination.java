package builder;

public class Domination extends Rune {
    private String malice;
    private String tracking;
    private String hunter;

    public static class Builder {
        private String keyStone = "";
        private String malice = "";
        private String tracking = "";
        private String hunter = "";

        public Builder keyStone(String keyStone) {
            this.keyStone = keyStone;
            return this;
        }

        public Builder malice(String malice) {
            this.malice = malice;
            return this;
        }

        public Builder tracking(String tracking) {
            this.tracking = tracking;
            return this;
        }

        public Builder hunter(String hunter) {
            this.hunter = hunter;
            return this;
        }

        public Domination build() {
            return new Domination(this);
        }
    }

    private Domination(Builder builder) {
        super.setKeyStone(builder.keyStone);
        malice = builder.malice;
        tracking = builder.tracking;
        hunter = builder.hunter;
    }

    @Override
    public String toString() {
        return "KeyStone : " + super.getKeyStone()
                + ", slot1: " + malice
                + ", slot2: " + tracking
                + ", slot3: " + hunter;
    }
}
