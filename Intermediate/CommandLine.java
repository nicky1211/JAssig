class CommandLineExample{  
	public static void main(String args[]){  
	
	if(args.length != 3){
		System.out.println("Usage : <CommandLineExample> <arg1> <arg2> <arg3>");
	
	}
	System.out.println("Your first argument is: "+args[0]);
	System.out.println("Your second argument is: "+args[1]);  
	System.out.println("Your third argument is: "+args[2]);  
	}  
}  
