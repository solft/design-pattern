package strategy;

public class BladeOfTheRuinedKing implements ActiveItem {
    @Override
    public void active() {
        System.out.println("몰락!");
    }
}
