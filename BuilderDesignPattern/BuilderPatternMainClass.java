package BuilderDesignPattern;

public class BuilderPatternMainClass {
    public static void main(String[] args) {
        Builder earthQuakeAreaBuilder = new EarthQuakeAreaBuilder();
        Builder floodProneAreaBuilder = new FloodProneAreaBuilder();

        Director director = new Director(floodProneAreaBuilder);
        director.manageConstruction();
        Home newHome = director.getRequiredHomeType();
        System.out.println(newHome.toString());
    }
}
