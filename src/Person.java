public class Person {

    private String name;
    private String surname;
    private int age;

    private int maxLastNameLength = 0;

    public Person (String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setMaxLastNameLength (int maxLastNameLength) {
        this.maxLastNameLength = maxLastNameLength;
    }

    public int compareTo (Person p1) {
        String[] s1 = p1.surname.split(" ", maxLastNameLength);
        Person p2 = this;
        String[] s2 = p2.surname.split(" ", maxLastNameLength);
        if (s1.length > s2.length) {
            return 1;
        } else if (s1.length < s2.length) {
            return -1;
        } else {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    }

    public void setName () {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setSurname () {
        this.surname = surname;
    }

    public String getSurname () {
        return surname;
    }

    public void setAge () {
        this.age = age;
    }

    public int getAge () {
        return age;
    }

    public String toString () {
        return name + " " + surname + ", возраст " + age;
    }
}
