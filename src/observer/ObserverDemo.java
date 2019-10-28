package observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Champion champion = new Champion();
        Observer kdaDisplayView = new KdaDisplayView(champion);
        Observer kdaCalculateView = new KdaCalculateView(champion);

        champion.registerObserver(kdaDisplayView);
        champion.registerObserver(kdaCalculateView);

        champion.kill();
        champion.kill();
        champion.death();
        champion.assist();
        champion.kill();
        champion.assist();
        champion.death();
        champion.death();
    }
}
