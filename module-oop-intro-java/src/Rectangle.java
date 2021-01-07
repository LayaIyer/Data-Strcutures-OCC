
public class Rectangle {
    private double length;
    private double width;
    
    private static int numRectangles;
    
    public Rectangle(){
        this(1.0, 1.0);
    }//end no-arg ctor
    
    public Rectangle(double length, double width){
        this.length = length; //overcomes NAME SHADOWING
        this.width = width;
        numRectangles++;
    }//end ctor

    //accessor - getLengths
    public double getLength() {
        return length;
    }

    //mutator - setLength
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double area(){
        return length * width;
    }//end area method
    
    public double perimeter(){
        return 2 * (length + width);
    }//end perimeter method
    
    public static int getNumRectangles(){
        return numRectangles;
    }
}
