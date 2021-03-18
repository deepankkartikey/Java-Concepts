package SingletonPattern;

public class SingletonClass {
    private static SingletonClass singletonInstance = new SingletonClass();

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        return singletonInstance;
    }

    public void objectReference() {
        System.out.println("Object Reference: " + singletonInstance);
    }
}
