package BuilderDesignPattern;

public class EarthQuakeAreaBuilder implements Builder {
    private Home earthQuakeAreaHome = new Home();

    public void buildFloors() {
        this.earthQuakeAreaHome.setFloor("Wooden floor");
    }

    public void buildWalls() {
        this.earthQuakeAreaHome.setWalls("Wooden Walls");
    }

    public void buildCeiling() {
        this.earthQuakeAreaHome.setCeiling("Wooden Ceiling");
    }

    public Home getComplexHomeObject() {
        return this.earthQuakeAreaHome;
    }
}
