import java.util.ArrayList;
import java.util.List;

public class FurnitureMakerForPoor extends FurnitureMaker {
    FurnitureMakerForPoor(String name) {
        super(name);
    }

    @Override
    public List<Wood> getWoods(int woodAmount) {
        List<Wood> woods = new ArrayList<>();
        for (int i = 0; i < woodAmount; i++) {
            woods.add(new CheapWood());
        }
        return woods;
    }

    @Override
    public Hammer getHammer() {
        return new IronHammer();
    }
}
