import java.io.*;

class  Quiz
{
    public static void main(String args[]) throws IOException{

      final String ans="SOIS";
      String str;
      int n=3,attempt=0;

      BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));

      while(n>0){
        
        System.out.print("What is name of your institute ?");
        str=obj.readLine();
        attempt++;
        if( str.equalsIgnoreCase(ans) == true){

          if(attempt==1){

            System.out.println("\n You are the BEST!");
            System.exit(1);
          }
          
          else if(attempt==2){

            System.out.println("\nGOOD");
            System.exit(1);
          }
          
          else{

            System.out.println("Not Bad!!!");
            System.exit(1);
          }
        
        }
        
        else
          System.out.println("\nInCOrrect Answer : The number of attempts remaining are\n" +(n-1) );
          n=n-1;
      }
       
      if(attempt>=3)

        System.out.println("\nThe Correct Answer is : "+ans);
       
    }
}