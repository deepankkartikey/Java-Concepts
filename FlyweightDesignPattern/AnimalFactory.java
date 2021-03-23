package FlyweightDesignPattern;

import java.util.HashMap;

public class AnimalFactory {
    private static final HashMap<String, Animal> animalMap = new HashMap<>();

    public static Animal getCat(String name) {
        String key = name + "-animal";
        if (animalMap.get(key) == null) {
            animalMap.put(key, new Cat(name));
        }
        return animalMap.get(key);
    }

    public static Animal getCow(String name) {
        String key = name + "-animal";
        if (animalMap.get(key) == null) {
            animalMap.put(key, new Cow(name));
        }
        return animalMap.get(key);
    }

    public static Animal getDog(String name) {
        String key = name + "-animal";
        if (animalMap.get(key) == null) {
            animalMap.put(key, new Dog(name));
        }
        return animalMap.get(key);
    }
}
