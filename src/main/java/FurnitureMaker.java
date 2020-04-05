import java.util.ArrayList;
import java.util.List;

class FurnitureMaker {
    private final String name;

    FurnitureMaker(String name) {
        this.name = name;
    }

    Chair makeChair() {
        List<Wood> woods = new ArrayList<>();
        for (int i = 0; i < Chair.WOOD_AMOUNT; i++) {
            woods.add(new Wood());
        }

        IronHammer ironHammer = new IronHammer();
        return ironHammer.makeChair(woods);
    }

    Desk makeDesk() {
        List<Wood> woods = new ArrayList<>();
        for (int i = 0; i < Desk.WOOD_AMOUNT; i++) {
            woods.add(new Wood());
        }

        IronHammer ironHammer = new IronHammer();
        return ironHammer.makeDesk(woods);
    }
}
