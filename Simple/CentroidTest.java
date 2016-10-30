import java.io.*;
import java.util.Scanner;

class CentroidTest{
	public static void main(String[] args)
	{
		
		double X1=3,Y1=4,X2=0,Y2=0,X3=0,Y3=0;
		double CX1 = (X1+X2+X3)/3;
		double CY1 = (Y1+Y2+Y3)/3;
		System.out.println("Centroid(G) (X1,Y1) = ("+CX1+","+CY1+")");
	}
}