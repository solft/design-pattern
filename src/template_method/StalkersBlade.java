package template_method;

public class StalkersBlade extends JungleItem {
    // 추적자의 검(파랑강타)
    @Override
    protected void basicPassive() {
        System.out.println("기본 지속 효과 - 혹한의 강타");
        System.out.println("28 ~ 166의 고정피해, 이동속도 2초간 20% 훔침");
    }
}
