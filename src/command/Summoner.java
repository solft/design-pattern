package command;

public class Summoner {
    private SummonerSpell dSpell;
    private SummonerSpell fSpell;

    public Summoner(SummonerSpell dSpell, SummonerSpell fSpell) {
        this.dSpell = dSpell;
        this.fSpell = fSpell;
    }

    public void pressedD() {
        dSpell.execute();
    }

    public void pressedF() {
        fSpell.execute();
    }
}
