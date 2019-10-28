package observer;

public class KdaDisplayView implements Observer {
    private Champion champion;

    public KdaDisplayView(Champion champion) {
        this.champion = champion;
    }

    @Override
    public void update() {
        System.out.print("킬 : " + champion.getKillCount() + ", ");
        System.out.print("데스 : " + champion.getDeathCount() + ", ");
        System.out.println("어시스트 : " + champion.getAssistCount());
    }
}
