    import java.util.*;
public class PrimeNo {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=2;i<=a;i++)
     {
         int c=0;
         for(int j=1;j<=i;j++)
         {
        	     if(i%j==0)
        	     {
        	         c++;
        	     }
         }
         
       if(c==2)
       {
             System.out.println(i);
         }
     }

		
	}
}
