package feature.java8.functionalInterface;


@FunctionalInterface
interface Shape {
    void draw(String shape);
}

/**
 * Old Approach
 */
class Circle implements Shape {

    @Override
    public void draw(String shape) {
        System.out.println("Object Shape is " + shape);
    }
}


public class FunctionalInterfaceExample {


    public static void main(String[] args) {

        Shape shape = new Circle();
        shape.draw("Circle");

        /*
         * lambda expression approach
         */
        Shape shapeF = (objShape) -> System.out.println("Object Shape is " + objShape);
        shapeF.draw("Square");
    }
}
