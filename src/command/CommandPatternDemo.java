package command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Ignite ignite = new Ignite();
        Flash flash = new Flash();

        Summoner dFlashSummoner = new Summoner(new FlashSpell(flash), new IgniteSpell(ignite));
        Summoner fFlashSummoner = new Summoner(new IgniteSpell(ignite), new FlashSpell(flash));

        System.out.println("d 점멸 유저");
        System.out.print("d 클릭 : ");
        dFlashSummoner.pressedD();
        System.out.print("f 클릭 : ");
        dFlashSummoner.pressedF();

        System.out.println("==============================");

        System.out.println("f 점멸 유저");
        System.out.print("d 클릭 : ");
        fFlashSummoner.pressedD();
        System.out.print("f 클릭 : ");
        fFlashSummoner.pressedF();
    }
}
