package BuilderDesignPattern;

public class FloodProneAreaBuilder implements Builder {
    private Home floodProneAreaHome = new Home();

    @Override
    public void buildFloors() {
        this.floodProneAreaHome.setFloor("High and Concrete Floor");
    }

    @Override
    public void buildWalls() {
        this.floodProneAreaHome.setWalls("Reinforced Concrete Walls");
    }

    @Override
    public void buildCeiling() {
        this.floodProneAreaHome.setCeiling("High Ceiling-20feet");
    }

    @Override
    public Home getComplexHomeObject() {
        return this.floodProneAreaHome;
    }
}
