import java.util.*;
public class Reverseofnumber {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int reversed=0;
         while(num != 0) {
    
      // get last digit from num
      int digit = num % 10;
      reversed = reversed * 10 + digit;

      // remove the last digit from num
      num /= 10;
    }

    System.out.println(reversed);
    
        

	}
}
