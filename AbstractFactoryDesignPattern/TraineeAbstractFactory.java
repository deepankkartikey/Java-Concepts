package AbstractFactoryDesignPattern;

public class TraineeAbstractFactory extends AbstractFactory {
    public Profession getProfession(String typeOfProfession) {
        if (typeOfProfession.equalsIgnoreCase("Teacher")) {
            return new TraineeTeacher();
        } else if (typeOfProfession.equalsIgnoreCase("Engineer")) {
            return new TraineeEngineer();
        }
        return null;
    }
}
