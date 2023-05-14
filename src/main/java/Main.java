import java.util.Random;

public class Main {
    public static void greet(String name, String greeting = "Hello") {
        System.out.println(greeting + ", " + name + "!");
    }

    public static void main(String[] args) {
//        Random random = new Random();
//        String str = "";
//        for (int i =0; i<10; i++) {
//            str+=random.nextInt(9000000)+1000000;
//        }

//        int randomizedInt = new Random().nextInt(9000000)+1000000;

//        System.out.println(randomizedInt);

        greet("Vlad");

    }
}
