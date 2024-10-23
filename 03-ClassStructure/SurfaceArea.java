public class SurfaceArea {
    static float rectangle(float a, float b){
        return a*b;
        
    }

    static double circle(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    static double triangle(double a, double b) {
        return 0.5 * a * b;
    }

    public static void main(String[] args) {
        System.out.println(circle(5));
        System.out.println(rectangle(5,2));
        System.out.println(triangle(2, 4));
    }
}
