public class Mathn {

    static double larger(double a, double b) {
        return Math.max(a, b);
    }

    static double numPI() {
        return Math.PI;
    }

    static double absolute(double a) {
        return Math.abs(a);
    }

    static double square(double a, double b) {
        double result = a / b;
        return Math.sqrt(result);
    }

    static double randomnumber() {
        return Math.random();
    }

    static int randomint() {
        return (int) Math.random() * 11;
    }

    static double sinus(double a) {
        double radians = Math.toRadians(a);
        return Math.sin(radians);
    }
    public static void main(String[] args) {
        
    }
}
