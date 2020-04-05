import java.util.List;

class FurnitureMaker {
    private final String name;

    FurnitureMaker(String name) {
        this.name = name;
    }

    Chair makeChair() {
        MaterialMakerForPoor materialMakerForPoor = new MaterialMakerForPoor();
        List<Wood> woods = materialMakerForPoor.getWoods(Chair.WOOD_AMOUNT);
        Hammer hammer = materialMakerForPoor.getHammer();
        return hammer.makeChair(woods);
    }

    Desk makeDesk() {
        MaterialMakerForPoor materialMakerForPoor = new MaterialMakerForPoor();
        List<Wood> woods = materialMakerForPoor.getWoods(Desk.WOOD_AMOUNT);
        Hammer hammer = materialMakerForPoor.getHammer();
        return hammer.makeDesk(woods);
    }
}
