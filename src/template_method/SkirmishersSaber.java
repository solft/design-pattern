package template_method;

public class SkirmishersSaber extends JungleItem {
    // 척후병의 사브르(빨강강타)
    @Override
    protected void basicPassive() {
        System.out.println("기본 지속 효과 - 승부의 강타");
        System.out.println("2.5초에 걸쳐 48 ~ 125 추가 고정 피해, 대상으로부터 입는 피해 20% 감소");
    }
}
