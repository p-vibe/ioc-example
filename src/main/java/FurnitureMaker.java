import java.util.List;

class FurnitureMaker {
    private final String name;

    FurnitureMaker(String name) {
        this.name = name;
    }

    Chair makeChair(MaterialMakerForPoor materialMakerForPoor) {
        List<Wood> woods = materialMakerForPoor.makeWoods(Chair.WOOD_AMOUNT);
        Hammer hammer = materialMakerForPoor.makeHammer();
        return hammer.makeChair(woods);
    }

    Desk makeDesk(MaterialMakerForPoor materialMakerForPoor) {
        List<Wood> woods = materialMakerForPoor.makeWoods(Desk.WOOD_AMOUNT);
        Hammer hammer = materialMakerForPoor.makeHammer();
        return hammer.makeDesk(woods);
    }
}
