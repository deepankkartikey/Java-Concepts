package ProxyDesignPattern;

public class RealSubject implements Subject {
    @Override
    public void method() {
        System.out.printf("Authenticated! :) \n You are allowed to access Original Object...");
    }
}
