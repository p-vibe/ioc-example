import java.util.ArrayList;
import java.util.List;

class MaterialMakerForPoor {
    List<Wood> makeWoods(int woodAmount) {
        List<Wood> woods = new ArrayList<>();
        for (int i = 0; i < woodAmount; i++) {
            woods.add(new CheapWood());
        }
        return woods;
    }


    Hammer makeHammer() {
        return new IronHammer();
    }
}
