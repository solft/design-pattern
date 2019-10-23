package template_method;

public abstract class JungleItem {
    private int price = 1000;

    void effect() {
        System.out.println("----------------");
        System.out.println("가격 : " + price + " 골드");

        inherentPassive();

        System.out.println();

        basicPassive();

        System.out.println("----------------");
    }

    private void inherentPassive() {
        System.out.println("고유 지속 효과 - 이빨과 손톱");
        System.out.println("기본 공격으로 몬스터에게 40의 추가 물리피해...");
    }

    protected abstract void basicPassive();
}
