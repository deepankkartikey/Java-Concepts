package AbstractFactoryDesignPattern;

public class AbstractFactoryMainClass {
    public static void main(String[] args) {
        AbstractFactory absFactory = AbstractFactoryProducer.getProfession(true);
        Profession professional = absFactory.getProfession("engineer");
        professional.print();
    }
}
