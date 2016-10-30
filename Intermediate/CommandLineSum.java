class CommandLineSum{  
	public static void main(String args[]){  
	

	System.out.println("Your first argument is: "+args[0]);
	System.out.println("Your second argument is: "+args[1]);  
	System.out.println("Your third argument is: "+args[2]);  

	int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]) + Integer.parseInt(args[2]);
	System.out.println("The sum is: "+sum);  

	}  
}  