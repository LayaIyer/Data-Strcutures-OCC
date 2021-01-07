
public class RectangleDemo {
    public static void main(String[] args) {
        
        System.out.println("Num rectangles: " + Rectangle.getNumRectangles());
        
        Rectangle r1;
        System.out.println("Num rectangles: " + Rectangle.getNumRectangles());
        
        r1 = new Rectangle();
        System.out.println("Num rectangles: " + Rectangle.getNumRectangles());
        
        Rectangle r2 = new Rectangle(5.0, 10.5);
        
        Rectangle r3 = r1;
        System.out.println("Num rectangles: " + Rectangle.getNumRectangles());
        
        System.out.println("r1 area: " + r1.area());
        System.out.println("r1 perim: " + r1.perimeter());
        
        System.out.println("r2 area: " + r2.area());
        System.out.println("r2 perim: " + r2.perimeter());
        
        r3.setLength(100);
        r3.setWidth(20);
        System.out.println("r1 area: " + r1.area());
        System.out.println("r1 perim: " + r1.perimeter());
    }//end main
     
}
