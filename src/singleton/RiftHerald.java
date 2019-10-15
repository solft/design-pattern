package singleton;

public class RiftHerald {
    private static RiftHerald riftHerald;
    private int hp;

    private RiftHerald() {
        hp = 100;
    }

    public static RiftHerald getRiftHerald() {
        if (riftHerald == null) {
            riftHerald = new RiftHerald();
        }
        return riftHerald;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
