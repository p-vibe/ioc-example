import java.util.List;

class Chair {
    static final int WOOD_AMOUNT = 5;

    Chair(List<Wood> woods) {
        if (woods.size() != WOOD_AMOUNT) {
            throw new IllegalArgumentException(String.format("의자를 만들기 위해 %d개의 나무가 필요합니다.", WOOD_AMOUNT));
        }
    }
}
