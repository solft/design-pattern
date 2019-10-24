package factory_method;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        BotCreator botCreator = new BotCreator();

        Bot introBot = botCreator.createBot(Difficulty.INTRO);
        introBot.play();

        Bot beginnerBot = botCreator.createBot(Difficulty.BEGINNER);
        beginnerBot.play();

        Bot intermediateBot = botCreator.createBot(Difficulty.INTERMEDIATE);
        intermediateBot.play();
    }
}
