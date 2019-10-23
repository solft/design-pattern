package template_method;

public class TemplateMethod {
    public static void main(String[] args) {
        JungleItem blueSmite = new StalkersBlade();
        JungleItem redSmite = new SkirmishersSaber();

        // 파랑 강타
        blueSmite.effect();

        // 빨강 강타
        redSmite.effect();
    }
}
