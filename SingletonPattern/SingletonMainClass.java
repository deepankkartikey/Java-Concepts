package SingletonPattern;

import AbstractFactoryDesignPattern.Teacher;

public class SingletonMainClass {
    public static void main(String[] args) {
        SingletonClass object1 = SingletonClass.getInstance();
        SingletonClass object2 = SingletonClass.getInstance();
        System.out.println(object1);
        System.out.println(object2);
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        System.out.println(teacher1);
        System.out.println(teacher2);
    }
}
