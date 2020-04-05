import java.util.List;

class IronHammer implements Hammer {
    @Override
    public Chair makeChair(List<Wood> woods) {
        return new Chair(woods);
    }

    @Override
    public Desk makeDesk(List<Wood> woods) {
        return new Desk(woods);
    }
}
