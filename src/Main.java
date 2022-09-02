import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Kolya", "Ivanov", 12));
        persons.add(new Person("Andrey", "Ivanov Dyatlov", 18));
        persons.add(new Person("Audi", "A8 Long Edition", 6666));
        persons.add(new Person("Vasya", "Petrov", 20));
        persons.add(new Person("Vlad", "Tepes Mercedes Le Dracula", 2550));
        persons.add(new Person("Andy", "Derris Hansen Lande Sammet", 999));
        Comparator<Person> personComparator = (o1, o2) -> {
            Integer o1length = o1.getSurname().split(" ").length;
            Integer o2length = o2.getSurname().split(" ").length;
            return o2length.compareTo(o1length);
        };

        Collections.sort(persons, personComparator);

        for (Person p : persons) {
            System.out.println(p);
        }
    }
}