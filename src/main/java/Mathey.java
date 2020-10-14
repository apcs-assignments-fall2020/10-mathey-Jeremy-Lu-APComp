import java.util.Random;
public class Mathey {
    public static int max(int a, int b) {
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static double max(double a, double b) {
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static int max(int a, int b, int c) {
        return max(a, max(b,c));
    }

    public static double max(double a, double b, double c) {
        return max(a, max(b,c));
    }

    public static int randomInteger(int a, int b) {
        return (int) ((b - a + 1) * Math.random()) + a;
    }

    public static int randomInteger(int b) {
        return (int) ((b - 1) * Math.random());
    }
    /*
    public static void main(String[] args) {
        System.out.println(max(3,4,5));
        System.out.println(max(3,4));
        System.out.println(max(3.2,4.3,5.5));
        System.out.println(randomInteger(3,4));
        System.out.println(randomInteger(3));
    }
    */
}