package command;

public class IgniteSpell implements SummonerSpell {
    private Ignite ignite;

    public IgniteSpell(Ignite ignite) {
        this.ignite = ignite;
    }

    @Override
    public void execute() {
        ignite.ignite();
    }
}
