package strategy;

public class Player {
    private ActiveItem activeItem;

    public void setActiveItem(ActiveItem activeItem) {
        this.activeItem = activeItem;
    }

    public void useActiveItem() {
        activeItem.active();
    }

    public static void main(String[] args) {
        Player player = new Player();

        // 처음 Strategy
        player.setActiveItem(new ZhonyasHourglass());
        player.useActiveItem();

        // Strategy 변경
        player.setActiveItem(new BladeOfTheRuinedKing());
        player.useActiveItem();

        // 액티브 아이템 추가 시
        // ActiveItem 을 구현하는 새로운 클래스를 만들고
        // Player 의 setActiveItem 으로 strategy 를 변경해 사용하면 된다.
        // Player 의 코드나 ActiveItem 의 코드가 변경되지 않는다.
    }
}