class SumOfDigit{

	public static void main(String args[]){

		int result=0;
		int count=0;

		for(int i=100;i<=200;i++){

			if(i%7==0){
				count ++;
				result += i;
			}

		}

		assert(count == 14);
		// System.out.println("Nomber of Elements : "+count);
		assert(result == 2107);
		// System.out.println("Output of Program is : "+result);
	}
}