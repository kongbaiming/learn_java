/**
 * Person
 *
 * @author king
 */
public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("king", 18);
        p1.show();
    }

    public void show() {
        System.out.printf("name:%s,age:%d", name, age);
    }
}
