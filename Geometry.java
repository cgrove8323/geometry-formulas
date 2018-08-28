/**
 * Here are some useful Geometry formulas to demonstrate how functions can return values.
 * Also look at the Java Docs.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    /**
     * Calculates the area of a parallelogram.
     *
     * @param b  length of base of parallelogram
     * @param h  height of the parallelogram
     * @return   area of the parallelogram
     */
    public static double parallelogramArea(double length, double width) 
    {
        return length * width;
    }
    
    /**
     * Calculates the area of a triangle.
     *
     * @param b  length of base of triangle
     * @param h  height of the triangle
     * @return   area of the triangle
     */
    public static double triangleArea(double a, double b, double c) 
    {
        double s = (a+b+c)/2;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        
        return area;
    }
    
    /**
     * Calculates the volume of a sphere.
     * 
     * @param radius is the radius of the sphere
     */
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Calculates the area of a trapezoid.
     * 
     * @param base1 is one base of the trapezoid.
     * @param base2 is the other base.
     * @param height is the height of the trapezoid.
     */
    public static double trapezoidArea(double base1, double base2, double height)
    {
        return 0.5 * height * (base1 + base2);
    }
    
    /**
     * Calculates the volume of a rectangular prism.
     * 
     * @param length is the length of the rectangular prism
     * @param width is the width of the rectangular prism
     * @param height is the height of the rectangular prism
     */
    public static double rectprismVol(double length, double width, double height)
    {
        return length * width * height;
    }
    
    /**
     * Calculates the volume of a cone.
     * 
     * @param r is the radius of the cone
     * @param h is the height of the cone
     */
    public static double coneVol(double r, double h)
    {
        return 1.0 / 3.0 * Math.PI * Math.pow(r, 2) * h;
    }
    
    /**
     * Calculates the surface area of a rectangular prism.
     * 
     * @param l is the length of the rectangular prism
     * @param w is the width of the rectangular prism
     * @param h is the height of the rectangular prism
     */
    public static double rectprismSA(double l, double w, double h)
    {
        return (2 * l * w) + (2 * w * h) + (2 * l * h);
    }
    
    /**
     * Calculates the surface area of a sphere.
     * 
     * @param r is the radius of the sphere
     */
    public static double sphereSA(double r)
    {
        return 4 * Math.PI * Math.pow(r, 2);
    }
    
    /**
     * Calculates the hypotenuse of a triangle when given the two legs.
     * 
     * @param a is one leg of the triangle
     * @param b is the other leg of the triangle
     */
    public static double hypotenuse(double a, double b)
    {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    
    /**
     * Calculates the distance between two points.
     * 
     * @param x1 is the x value of the first point
     * @param y1 is the y value of the first point
     * @param x2 is the x value of the second point
     * @param y2 is the y value of the second point
     */
    public static double distance(double x1, double y1, double x2, double y2)
    {
        return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
    }
    
    /**
     * Calculates the slope of the line between two points.
     * 
     * @param x1 is the x value of the first point
     * @param y1 is the y value of the first point
     * @param x2 is the x value of the second point
     * @param y2 is the y value of the second point
     */
    public static double slope(double x1, double x2, double y1, double y2)
    {
        return (y2-y1)/(x2-x1);
    }
    
    public static void main(String[] args) 
    {
        System.out.println(parallelogramArea(4, 5));
        System.out.println(triangleArea(2, 5, 7));
        System.out.println(sphereVolume(3));
        System.out.println(trapezoidArea(4, 5, 6));
        System.out.println(rectprismVol(3, 6, 7));
        System.out.println(coneVol(4, 5));
        System.out.println(rectprismSA(6, 7, 8));
        System.out.println(sphereSA(4));
        System.out.println(hypotenuse(13, 67));
        System.out.println(distance(3, 4, 12, 31));
        System.out.println(slope(3, 4, 12, 31));
      
        
    }
}
