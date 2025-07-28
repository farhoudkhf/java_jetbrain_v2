package c02_objectsAndAPIs.ch03_Abstraction;

public class ShapeTester {

    public static void main(String[] args) {

//        Shape rectangle = new Shape() {
//            @Override
//            double calculateArea() {
//                return 0;
//            }
//        }
        Shape rectangle = new Rectangle(5, 7);
        System.out.println(rectangle.calculateArea());
    }
}
