package singleton;

public class Game {
    public static void main(String[] args) {
        RiftHerald riftHerald1 = RiftHerald.getRiftHerald();
        RiftHerald riftHerald2 = RiftHerald.getRiftHerald();

        // riftHerald1과 riftHerald2가 같은 협곡의 전령인지 확인
        System.out.println(riftHerald1.getHp());
        System.out.println(riftHerald2.getHp());

        riftHerald1.setHp(90);

        System.out.println(riftHerald1.getHp());
        System.out.println(riftHerald2.getHp());
    }
}
