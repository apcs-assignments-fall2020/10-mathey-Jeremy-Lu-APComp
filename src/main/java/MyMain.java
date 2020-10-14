import java.util.Scanner;

public class MyMain {

    public static int someMethod() {
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(Mathey.max(3,4,5));
        System.out.println(Mathey.max(3,4));
        System.out.println(Mathey.max(3.3,2.3));
        System.out.println(Mathey.max(3.1,4.4,5.7));
        System.out.println(Mathey.randomInteger(3));
        System.out.println(Mathey.randomInteger(1,100));
    }

}


