package adapter;

public class AdapterClient {
    public static void main(String[] args) {
        OldPantheon oldPantheon = new OldPantheon();
        NewPantheon pantheon = new NewPantheonImpl(oldPantheon);

        pantheon.cometSpear();
        pantheon.shieldVault();
        pantheon.aegisAssault();
        pantheon.grandStarfall();
    }
}
