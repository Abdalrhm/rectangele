public class Application {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3,10);
        Rectangle rectangle2 = new Rectangle(5,6);
        System.out.println("Surface of rectangle1");
        System.out.println(rectangle1.calculatSurface());
        System.out.println("Surface of rectangle2");
        System.out.println(rectangle2.calculatSurface());
        System.out.println("Circumference of rectangle1");
        System.out.println(rectangle1.calculateCircumference());
        System.out.println("Circumference of rectangle2");
        System.out.println(rectangle2.calculateCircumference());
    }
}
