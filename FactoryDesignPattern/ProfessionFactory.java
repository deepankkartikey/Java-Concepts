package FactoryDesignPattern;

import javax.print.Doc;

public class ProfessionFactory {
    public Profession getProfession(String typeOfProfession){
        if(typeOfProfession.equalsIgnoreCase(("Doctor"))){
            return new Doctor();
        }else if(typeOfProfession.equalsIgnoreCase("Teacher")){
            return new Teacher();
        }else if(typeOfProfession.equalsIgnoreCase("Student")){
            return new Student();
        }
        return null;
    }
}
