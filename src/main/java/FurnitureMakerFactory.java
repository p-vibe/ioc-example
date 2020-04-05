class FurnitureMakerFactory {
    FurnitureMaker createFurnitureMaker() {
        MaterialMaker materialMaker = new MaterialMakerForPoor();
        return new FurnitureMaker("root", materialMaker);
    }
}
