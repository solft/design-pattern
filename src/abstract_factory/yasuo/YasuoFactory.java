package abstract_factory.yasuo;

import abstract_factory.ChampionFactory;
import abstract_factory.Innate;
import abstract_factory.Ultimate;

public class YasuoFactory implements ChampionFactory {
    @Override
    public Innate createInnate() {
        return new YasuoInnate();
    }

    @Override
    public Ultimate createUltimate() {
        return new YasuoUltimate();
    }
}
