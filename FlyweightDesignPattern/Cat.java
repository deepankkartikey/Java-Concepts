package FlyweightDesignPattern;

import lombok.Data;

@Data
public class Cat implements Animal {

    private String name = null;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void printAttributes() {
        System.out.print(this.toString());
        System.out.printf("[ %s ]",this.hashCode());
        System.out.print("Eyes: " + CommonSharableClass.eyes);
        System.out.print(" ,Legs: " + CommonSharableClass.legs);
        System.out.println(" ,Tail: " + CommonSharableClass.tail);
    }
}
