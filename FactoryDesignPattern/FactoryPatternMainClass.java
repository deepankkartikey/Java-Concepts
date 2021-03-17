package FactoryDesignPattern;

public class FactoryPatternMainClass {
    public static void main(String[] args) {
        ProfessionFactory professionFactory = new ProfessionFactory();
        Profession professional = professionFactory.getProfession("teacher");
        professional.print();
    }
}
