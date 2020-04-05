import java.util.ArrayList;
import java.util.List;

class FurnitureMaker {
    private final String name;

    FurnitureMaker(String name) {
        this.name = name;
    }

    Chair makeChair() {
        List<Wood> woods = getWoods(Chair.WOOD_AMOUNT);

        IronHammer ironHammer = getIronHammer();
        return ironHammer.makeChair(woods);
    }

    Desk makeDesk() {
        List<Wood> woods = getWoods(Desk.WOOD_AMOUNT);

        IronHammer ironHammer = getIronHammer();
        return ironHammer.makeDesk(woods);
    }

    private List<Wood> getWoods(int woodAmount) {
        List<Wood> woods = new ArrayList<>();
        for (int i = 0; i < woodAmount; i++) {
            woods.add(new Wood());
        }
        return woods;
    }

    private IronHammer getIronHammer() {
        return new IronHammer();
    }
}
