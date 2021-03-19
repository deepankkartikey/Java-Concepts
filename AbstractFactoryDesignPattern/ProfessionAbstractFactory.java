package AbstractFactoryDesignPattern;

public class ProfessionAbstractFactory extends AbstractFactory {
    public Profession getProfession(String typeOfProfession) {
        if (typeOfProfession.equalsIgnoreCase("Engineer")) {
            return new Engineer();
        } else if (typeOfProfession.equalsIgnoreCase(("Teacher"))) {
            return new Teacher();
        }
        return null;
    }
}
