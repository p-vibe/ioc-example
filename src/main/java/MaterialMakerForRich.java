import java.util.ArrayList;
import java.util.List;

class MaterialMakerForRich implements MaterialMaker {
    @Override
    public List<Wood> makeWoods(int woodAmount) {
        List<Wood> woods = new ArrayList<>();
        for (int i = 0; i < woodAmount; i++) {
            woods.add(new CheapWood());
        }
        return woods;
    }

    @Override
    public Hammer makeHammer() {
        return new IronHammer();
    }
}
