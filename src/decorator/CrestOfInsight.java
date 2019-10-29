package decorator;

// Concrete Decorator
public class CrestOfInsight extends BuffDecorator {
    public CrestOfInsight(Buff buff) {
        super(buff);
    }

    @Override
    public void effect() {
        super.effect();
        System.out.println("블루: 스킬 재사용 대기시간 10% 감소, 초당 5와 최대 마나의 0.5%만큼의 마나 재생을 얻는다.");
    }
}
