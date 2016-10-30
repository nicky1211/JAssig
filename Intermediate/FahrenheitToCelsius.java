import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class FahrenheitToCelsius {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Please enter temperature in Fahrenheit : ");
		double fahrenheit = Double.parseDouble(reader.readLine());

		double celsius = (5.0/9.0)*(fahrenheit - 32);

		System.out.println("Temperature in Celsius is : "+celsius);

	}

}