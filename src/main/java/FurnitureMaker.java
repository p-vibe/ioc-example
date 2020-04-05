import java.util.List;

class FurnitureMaker {
    private final String name;
    private final MaterialMakerForPoor materialMakerForPoor;

    FurnitureMaker(String name) {
        this.name = name;
        this.materialMakerForPoor = new MaterialMakerForPoor();
    }

    Chair makeChair() {
        List<Wood> woods = materialMakerForPoor.makeWoods(Chair.WOOD_AMOUNT);
        Hammer hammer = materialMakerForPoor.makeHammer();
        return hammer.makeChair(woods);
    }

    Desk makeDesk() {
        List<Wood> woods = materialMakerForPoor.makeWoods(Desk.WOOD_AMOUNT);
        Hammer hammer = materialMakerForPoor.makeHammer();
        return hammer.makeDesk(woods);
    }
}
