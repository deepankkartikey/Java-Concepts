package PrototypeDesignPattern;

public class PrototypeMainClass {
    public static void main(String[] args) {

        ProfessionCache.loadProfessionCache();

        Profession cloned1 = ProfessionCache.getClonedNewProfession(1);
        System.out.println(cloned1);
        Profession cloned2 = ProfessionCache.getClonedNewProfession(2);
        System.out.println(cloned2);
        Profession cloned3 = ProfessionCache.getClonedNewProfession(3);
        System.out.println(cloned3);
        Profession cloned4 = ProfessionCache.getClonedNewProfession(1);
        System.out.println(cloned4);
    }
}
