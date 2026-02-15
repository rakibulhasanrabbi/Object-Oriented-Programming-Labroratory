// Rectangle class
class Rectangle {
    // Private instance variables
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter methods to access private variables
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Method to calculate area
    public double area() {
        return length * width;
    }

    // Method to calculate perimeter
    public double perimeter() {
        return 2 * (length + width);
    }
}

// Square class that inherits from Rectangle
class Square extends Rectangle {

    // Constructor
    public Square(double side) {
        super(side, side); // Initialize length and width using Rectangle constructor
    }

    // Override area method
    @Override
    public double area() {
        double side = getLength(); // Access private variable using getter
        return side * side;
    }

    // Override perimeter method
    @Override
    public double perimeter() {
        double side = getLength(); // Access private variable using getter
        return 4 * side;
    }
}

// Main class to test functionality
public class Main {
    public static void main(String[] args) {
        // Rectangle object
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Rectangle Perimeter: " + rect.perimeter());

        // Square object
        Square sq = new Square(4);
        System.out.println("Square Area: " + sq.area());
        System.out.println("Square Perimeter: " + sq.perimeter());
    }
}
