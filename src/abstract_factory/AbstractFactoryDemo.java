package abstract_factory;

import abstract_factory.lee_sin.LeeSinFactory;
import abstract_factory.yasuo.YasuoFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // 리신 생성
        ChampionFactory leeSinFactory = new LeeSinFactory();

        Innate leeSinInnate = leeSinFactory.createInnate();
        Ultimate leeSinUltimate = leeSinFactory.createUltimate();

        leeSinInnate.passive();
        leeSinUltimate.r();

        System.out.println();

        // 야스오 생성
        ChampionFactory yasuoFactory = new YasuoFactory();

        Innate yasuoInnate = yasuoFactory.createInnate();
        Ultimate yasuoUltimate = yasuoFactory.createUltimate();

        yasuoInnate.passive();
        yasuoUltimate.r();
    }
}
