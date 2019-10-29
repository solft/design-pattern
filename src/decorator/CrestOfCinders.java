package decorator;

// Concrete Decorator
public class CrestOfCinders extends BuffDecorator {
    public CrestOfCinders(Buff buff) {
        super(buff);
    }

    @Override
    public void effect() {
        super.effect();
        System.out.println("레드: 전투 중이 아닐 때 5초당 최대 체력의 1/3/9% 만큼 회복, 척 챔피언을 일반 공격 시 3초동안 5~56의 고정 피해, 5~10%의 둔화");
    }
}
