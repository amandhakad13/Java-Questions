// Program for default constructor

public class Cat {
    String name;
    int age;

    Cat() {
        name = "Unknown";
        age = 0;
    }

    public static void main(String[] args) {
        Cat c1 = new Cat();
        System.out.println(c1.name);
        System.out.println(c1.age);
    }
}
