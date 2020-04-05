import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FurnitureMakerTest {

    @Test
    void makeChair() {
        FurnitureMaker furnitureMaker = new FurnitureMakerForPoor("root");
        Chair chair = furnitureMaker.makeChair(new MaterialMakerForPoor());
        assertThat(chair).isNotNull();
    }

    @Test
    void makeDesk() {
        FurnitureMaker furnitureMaker = new FurnitureMakerForPoor("root");
        Desk desk = furnitureMaker.makeDesk(new MaterialMakerForPoor());
        assertThat(desk).isNotNull();
    }
}