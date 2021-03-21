package BuilderDesignPattern;

public interface Builder {
    void buildFloors();

    void buildWalls();

    void buildCeiling();

    Home getComplexHomeObject();
}
