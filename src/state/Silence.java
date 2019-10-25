package state;

public class Silence implements ChampionState {
    @Override
    public void attack() {
        System.out.println("기본 공격");
    }

    @Override
    public void skill() {
        System.out.println("침묵!");
    }
}
