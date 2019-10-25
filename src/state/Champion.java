package state;

public class Champion {
    private ChampionState championState;

    public Champion() {
        championState = new Normal();
    }

    public void setChampionState(ChampionState championState) {
        this.championState = championState;
    }

    public void attack() {
        championState.attack();
    }

    public void skill() {
        championState.skill();
    }
}
