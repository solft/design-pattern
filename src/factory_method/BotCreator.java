package factory_method;

public class BotCreator {
    public Bot createBot(Difficulty difficulty) {
        if (Difficulty.INTRO.equals(difficulty)) {
            return new IntroBot();
        } else if (Difficulty.BEGINNER.equals(difficulty)) {
            return new BeginnerBot();
        } else if (Difficulty.INTERMEDIATE.equals(difficulty)) {
            return new IntermediateBot();
        }

        return null;
    }
}
