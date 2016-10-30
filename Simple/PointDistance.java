import java.util.Scanner;
 
 
 
//distance = square root of [(x2-x1)squared + (y2-y1)squared]
public class PointDistance
{
 
    public static void main(String[] args)
    {   
         
        distance(double x1, double y1, double x2, double y2)
        {
            return Math.sqrt((x1-x2)(x1-x2) + (y1-y2)(y1-y2));
        }
    
        double x1, x2, y, y2;
        double distance;
      
         
        Scanner scan = new Scanner (System.in);
         
        System.out.println("Enter the x coordinate for point 1: ");
        x1 = scan.nextDouble();
         
        System.out.println("Enter the y coordinate for point 1: ");
        y1 = scan.nextDouble();
         
        System.out.println("Enter the x coordinate for point 2: ");
        x2 = scan.nextDouble();
         
        System.out.println("Enter the y coordinate for point 2: ");
        y2 = scan.nextDouble();
         
        distance = distance(x1,y1,x2,y2);
         
        System.out.println("The distance between the two points is " + distance + " .");
         
    }
     
}