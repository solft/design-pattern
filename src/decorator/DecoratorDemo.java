package decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Buff buff = new BuffStatus();
        buff.effect();
        System.out.println();

        Buff redBuff = new CrestOfCinders(new BuffStatus());
        redBuff.effect();
        System.out.println();

        Buff blueBuff = new CrestOfInsight(new BuffStatus());
        blueBuff.effect();
        System.out.println();

        Buff baronBlueBuff = new HandOfBaron(new CrestOfInsight(new BuffStatus()));
        baronBlueBuff.effect();
        System.out.println();

        Buff blueRedBaronBuff = new CrestOfInsight(new CrestOfCinders(new HandOfBaron(new BuffStatus())));
        blueRedBaronBuff.effect();
    }
}
