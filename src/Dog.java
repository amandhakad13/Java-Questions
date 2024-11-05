// Program for parameterized constructor

public class Dog {
    String name;
    String color;

    Dog(String n, String c) {
        name = n;
        color = c;
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Hero","Black");

        System.out.println(d1.name);
        System.out.println(d1.color);
    }
}
