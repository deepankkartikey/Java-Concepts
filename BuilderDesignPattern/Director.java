package BuilderDesignPattern;

public class Director {
    private Builder builder;

    public Director(Builder requiredBuilder) {
        this.builder = requiredBuilder;
    }

    public void manageConstruction() {
        this.builder.buildFloors();
        this.builder.buildWalls();
        ;
        this.builder.buildCeiling();
    }

    public Home getRequiredHomeType() {
        return this.builder.getComplexHomeObject();
    }
}
