package observer;

public class KdaCalculateView implements Observer {
    private Champion champion;

    public KdaCalculateView(Champion champion) {
        this.champion = champion;
    }

    @Override
    public void update() {
        if (champion.getDeathCount() == 0) {
            System.out.println("KDA : PERFECT!!");
        }
        else {
            double kda = ((double) champion.getAssistCount() + (double) champion.getKillCount()) / (double) champion.getDeathCount();
            System.out.println("KDA : " + kda);
        }

    }
}
