package PrototypeDesignPattern;

import java.util.HashMap;

public class ProfessionCache {

    private static HashMap<Integer, Profession> professionMap = new HashMap<>();

    public static void loadProfessionCache() {
        Doctor doc = new Doctor();
        doc.id = 1;
        professionMap.put(doc.id, doc);
        Engineer engg = new Engineer();
        engg.id = 2;
        professionMap.put(engg.id, engg);
        Teacher teacher = new Teacher();
        teacher.id = 3;
        professionMap.put(teacher.id, teacher);
    }

    public static Profession getClonedNewProfession(int id) {
        Profession cachedProfessionInstance = professionMap.get(id);
        return (Profession) cachedProfessionInstance.cloningMethod();
    }
}
