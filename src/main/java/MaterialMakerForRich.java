import java.util.ArrayList;
import java.util.List;

class MaterialMakerForRich {
    List<Wood> createWoods(int woodAmount) {
        List<Wood> woods = new ArrayList<>();
        for (int i = 0; i < woodAmount; i++) {
            woods.add(new CheapWood());
        }
        return woods;
    }

    Hammer createHammer() {
        return new IronHammer();
    }
}
