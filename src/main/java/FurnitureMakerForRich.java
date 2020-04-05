import java.util.ArrayList;
import java.util.List;

public class FurnitureMakerForRich extends FurnitureMaker {
    FurnitureMakerForRich(String name) {
        super(name);
    }

    public List<Wood> getWoods(int woodAmount) {
        List<Wood> woods = new ArrayList<>();
        for (int i = 0; i < woodAmount; i++) {
            woods.add(new ExpensiveWood());
        }
        return woods;
    }

    public Hammer getHammer() {
        return new IronHammer();
    }
}
