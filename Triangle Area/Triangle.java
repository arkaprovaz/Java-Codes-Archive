public class Triangle {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        int ar;
        ar = t1.area(2,4);
        System.out.println("The area is : " + ar);
    }
    int area (int b, int h) {
        int c;
        c=(b*h)/2;
        return c;
    }
}