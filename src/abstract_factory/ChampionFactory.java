package abstract_factory;

public interface ChampionFactory {
    Innate createInnate();
    Ultimate createUltimate();
}
