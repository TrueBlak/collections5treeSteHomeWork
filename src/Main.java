import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Kolya", "Fuckin", 12));
        persons.add(new Person("Jay", "Le Dolboeub", 28));
        persons.add(new Person("Zakon", "Gay Lussuck Odin", 666));
        persons.add(new Person("Gogy", "Gogua", 20));
        persons.add(new Person("Vlad", "Tepes Ibn Faruh", 2550));
        persons.add(new Person("Andy", "Derris Hansen Lande Sammet", 999));
        Collections.sort(persons, new PersonsSurnameWordsNumberComparator(3));
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}