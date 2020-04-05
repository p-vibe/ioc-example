import java.util.ArrayList;
import java.util.List;

class FurnitureMaker {
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

    private List<Wood> getWoods(int woodAmount) {
        List<Wood> woods = new ArrayList<>();
        for (int i = 0; i < woodAmount; i++) {
            woods.add(new CheapWood());
        }
        return woods;
    }

    private Hammer getHammer() {
        return new IronHammer();
    }
}
