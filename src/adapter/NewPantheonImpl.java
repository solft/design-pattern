package adapter;

public class NewPantheonImpl implements NewPantheon {
    private OldPantheon oldPantheon;

    public NewPantheonImpl(OldPantheon oldPantheon) {
        this.oldPantheon = oldPantheon;
    }

    @Override
    public void cometSpear() {
        oldPantheon.spearShot();
    }

    @Override
    public void shieldVault() {
        oldPantheon.aegisOfZeonia();
    }

    @Override
    public void aegisAssault() {
        oldPantheon.heartseekerStrike();
    }

    @Override
    public void grandStarfall() {
        oldPantheon.grandSkyfall();
    }
}
