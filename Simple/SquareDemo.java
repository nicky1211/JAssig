import java.util.Scanner; 

public class SquareDemo
{
    public static void main(String[] args)
    {
       
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a number");
       String s = in.nextLine();
       int no = Integer.parseInt(s);
       double square = no * no;
       assert((Math.pow(no,2) == square));
       System.out.println("The squared value is "+square);

          }
 
}