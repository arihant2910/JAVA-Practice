import java.util.*;
public class SumOEvenandOdd {
	
	public static void main(String[] args) {
		  int sumOdd=0;
		  int sumEven=0;// Write your code here
		  Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        while(n!=0){
            int r=n%10;
            if (r%2==0){
                  sumEven = sumEven + r;
            }
            else{
             sumOdd=sumOdd+r;
            }
            n=n/10;
        }
        System.out.print(sumEven +" " + sumOdd);
        

	}
}
