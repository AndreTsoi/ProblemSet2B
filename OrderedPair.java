//Questions
//1)
//To create an OrderedPair object with values (4.0, -5.0), you can write the code:
//OrderedPair orderedPair = new OrderedPair(4.0, -5.0);
//When you print the object to the console, it prints the internal state and details of the object.


//2)
//Because we have now added a toString method, the printing now follows the toString method
//and prints the two doubles that the object references.





public class OrderedPair {
    private double x;
    private double y;

    //constructor without parameters
    public OrderedPair() {
        this(0, 0);
    }

    //constructor with two formal parameters
    public OrderedPair(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //method that tells the program how to print objects from the class
    public String toString() {
        return this.x + ", " + this.y;
    }

    //returns the x value
    public double getX() {
        return this.x;
    }

    //returns the y value
    public double getY() {
        return this.y;
    }




}
