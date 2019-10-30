package abstract_factory.lee_sin;

import abstract_factory.Innate;

public class LeeSinInnate implements Innate {
    @Override
    public void passive() {
        System.out.println("질풍격(Flurry)");
        System.out.println("리 신이 스킬을 사용하면 그의 다음 두 번의 기본 공격 속도가 40%만큼 증가합니다.");
        System.out.println("첫 번째 기본 공격 시 20/30/40, 두 번째는 10/15/20의 기력을 돌려받습니다.");
    }
}
