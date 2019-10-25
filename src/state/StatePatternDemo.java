package state;

public class StatePatternDemo {
    public static void main(String[] args) {
        Champion champion = new Champion();

        System.out.println("Champion 기본 상태");
        champion.attack();
        champion.skill();
        System.out.println();

        System.out.println("Champion이 티모 실명 맞음");
        champion.setChampionState(new Blind());
        champion.attack();
        champion.skill();
        System.out.println();

        System.out.println("Champion이 피들스틱 까마귀 맞음");
        champion.setChampionState(new Silence());
        champion.attack();
        champion.skill();
        System.out.println();
    }
}
