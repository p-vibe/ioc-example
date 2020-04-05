import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FurnitureMakerTest {

    @Test
    void makeChair() {
        FurnitureMaker furnitureMaker = new FurnitureMakerFactory().createFurnitureMaker();
        Chair chair = furnitureMaker.makeChair();
        assertThat(chair).isNotNull();
    }

    @Test
    void makeDesk() {
        FurnitureMaker furnitureMaker = new FurnitureMakerFactory().createFurnitureMaker();
        Desk desk = furnitureMaker.makeDesk();
        assertThat(desk).isNotNull();
    }
}