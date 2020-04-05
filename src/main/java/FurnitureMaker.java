import java.util.List;

class FurnitureMaker {
    private final String name;
    private final MaterialMaker materialMaker;

    FurnitureMaker(String name) {
        this.name = name;
        this.materialMaker = new MaterialMakerForPoor();
    }

    Chair makeChair() {
        List<Wood> woods = materialMaker.makeWoods(Chair.WOOD_AMOUNT);
        Hammer hammer = materialMaker.makeHammer();
        return hammer.makeChair(woods);
    }

    Desk makeDesk() {
        List<Wood> woods = materialMaker.makeWoods(Desk.WOOD_AMOUNT);
        Hammer hammer = materialMaker.makeHammer();
        return hammer.makeDesk(woods);
    }
}