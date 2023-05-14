import java.util.Random;

public class Main {
    public static void greet(String name, String greeting ="Hello") {
        System.out.println(greeting + ", " + name + "!");
    }

    public static void main(String[] args) {
        greet("Vlad");
        greet("Vlad", "Hi");
        greet("Yulia");
    }
}
