package decorator;

// Concrete Decorator
public class HandOfBaron extends BuffDecorator {
    public HandOfBaron(Buff buff) {
        super(buff);
    }

    @Override
    public void effect() {
        super.effect();
        System.out.println("바론: 공격력, 주문력 상승, 귀환 강화, 근처 미니언 강화");
    }
}
