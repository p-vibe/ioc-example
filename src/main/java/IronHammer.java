import java.util.List;

class IronHammer {
    Chair makeChair(List<Wood> woods) {
        return new Chair(woods);
    }

    Desk makeDesk(List<Wood> woods) {
        return new Desk(woods);
    }
}
