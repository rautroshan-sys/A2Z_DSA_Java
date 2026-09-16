package DSA.Things_to_know;
package DSA.Basics.Things_to_know;
class Person {
    int age;
}

public class Main {

    static void changeAge(Person p) {
        p.age = 100;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.age = 20;

        changeAge(person);

        System.out.println(person.age);
    }
}