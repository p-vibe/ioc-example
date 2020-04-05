import java.util.List;

class Desk {
    static final int WOOD_AMOUNT = 15;

    Desk(List<Wood> woods) {
        if (woods.size() != WOOD_AMOUNT) {
            throw new IllegalArgumentException(String.format("책상을 만들기 위해 %d개의 나무가 필요합니다.", WOOD_AMOUNT));
        }
    }
}