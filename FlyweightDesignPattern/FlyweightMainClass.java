package FlyweightDesignPattern;

public class FlyweightMainClass {
    public static void main(String[] args) {
        Animal animal1 = AnimalFactory.getCat("CAT");
        Animal animal2 = AnimalFactory.getCow("COW");
        Animal animal3 = AnimalFactory.getDog("DOG");
        Animal animal4 = AnimalFactory.getCat("CAT");
        animal1.printAttributes();
        animal2.printAttributes();
        animal3.printAttributes();
        animal4.printAttributes();
    }
}
