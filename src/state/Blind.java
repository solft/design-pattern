package state;

public class Blind implements ChampionState {
    @Override
    public void attack() {
        System.out.println("빗나감!");
    }

    @Override
    public void skill() {
        System.out.println("스킬 사용");
    }
}
