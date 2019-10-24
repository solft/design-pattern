package factory_method;

public class IntermediateBot implements Bot {
    @Override
    public void play() {
        System.out.println("중급 봇입니다.");
    }
}
