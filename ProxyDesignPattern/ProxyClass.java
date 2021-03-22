package ProxyDesignPattern;

import java.util.Scanner;

public class ProxyClass extends RealSubject {

    @Override
    public void method() {
        System.out.println("Inside Proxy Class to perform Authentication");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String userName = sc.next();
        if (userName.equalsIgnoreCase("kartikeyd")) {
            super.method();
        } else {
            System.out.printf("Authentication failed! :( \n Not allowed to access Original Object...");
        }
    }
}
