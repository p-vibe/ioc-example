import java.util.List;

abstract class FurnitureMaker {
    private final String name;

    FurnitureMaker(String name) {
        this.name = name;
    }

    Chair makeChair() {
        List<Wood> woods = getWoods(Chair.WOOD_AMOUNT);
        Hammer hammer = getHammer();
        return hammer.makeChair(woods);
    }

    Desk makeDesk() {
        List<Wood> woods = getWoods(Desk.WOOD_AMOUNT);
        Hammer hammer = getHammer();
        return hammer.makeDesk(woods);
    }

    public abstract List<Wood> getWoods(int woodAmount);

    public abstract Hammer getHammer();
}
