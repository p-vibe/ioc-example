import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FurnitureMakerTest {

    @Test
    void makeChair() {
        FurnitureMaker furnitureMaker = new FurnitureMaker("root");
        Chair chair = furnitureMaker.makeChair();
        assertThat(chair).isNotNull();
    }

    @Test
    void makeDesk() {
        FurnitureMaker furnitureMaker = new FurnitureMaker("root");
        Desk desk = furnitureMaker.makeDesk();
        assertThat(desk).isNotNull();
    }
}