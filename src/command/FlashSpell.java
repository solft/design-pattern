package command;

public class FlashSpell implements SummonerSpell {
    private Flash flash;

    public FlashSpell(Flash flash) {
        this.flash = flash;
    }

    @Override
    public void execute() {
        flash.flash();
    }
}
