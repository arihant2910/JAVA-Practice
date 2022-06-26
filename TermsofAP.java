import java.util.*;
public class TermsofAP {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
		for(int i=1;count<n;i++){
            int sum=3*i+2;
            if(sum%4!=0){
             System.out.print(sum+" ");
                count++;
            }
            
        }
	}
}
