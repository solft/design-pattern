package abstract_factory.lee_sin;

import abstract_factory.ChampionFactory;
import abstract_factory.Innate;
import abstract_factory.Ultimate;

public class LeeSinFactory implements ChampionFactory {
    @Override
    public Innate createInnate() {
        return new LeeSinInnate();
    }

    @Override
    public Ultimate createUltimate() {
        return new LeeSinUltimate();
    }
}
