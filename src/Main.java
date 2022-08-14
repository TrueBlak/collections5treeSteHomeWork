import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Kolya", "Ivanov", 12));
        persons.add(new Person("Andrey", "Ivanov Dyatlov", 28));
        persons.add(new Person("Audi", "A8 Long Edition", 6666));
        persons.add(new Person("Vasya", "Petrov", 20));
        persons.add(new Person("Vlad", "Tepes Mercedes Le Dracula", 2550));
        persons.add(new Person("Andy", "Derris Hansen Lande Sammet", 999));
        Collections.sort(persons, new PersonsSurnameWordsNumberComparator(1));
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}