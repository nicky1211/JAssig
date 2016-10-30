import java.util.Scanner; 

public class SquareDemo
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);  
		System.out.println("Enter a number: ");
		int n = reader.nextInt();

		int square = Math.pow(n, 2);
		System.out.println("The square of the number is  %d: ", square);
    }
 
}