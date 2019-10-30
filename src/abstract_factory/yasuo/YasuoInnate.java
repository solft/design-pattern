package abstract_factory.yasuo;

import abstract_factory.Innate;

public class YasuoInnate implements Innate {
    @Override
    public void passive() {
        System.out.println("낭인의 길(Way of the Wanderer)");
        System.out.println("의지: 야스오의 치명타 확률이 두 배가 되는 대신 치명타 피해량이 10% 감소합니다.");
        System.out.println("결의: 이동 시 기류가 발생하여 야스오의 자원이 채워지며, 빠르게 움직일수록 기류가 더 빠르게 오릅니다.");
    }
}
